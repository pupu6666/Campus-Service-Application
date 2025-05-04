package com.XyDp.utils;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import com.XyDp.entity.Shop;
import com.XyDp.mapper.ShopMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class BloomFilterInitializer {
    @Autowired
    private ShopMapper shopMapper;

    private static BloomFilter<Long> bloomFilter;

    @PostConstruct
    public void initBloomFilter() {
        // 1. 从数据库加载所有存在的店铺ID
        List<Long> ids = shopMapper.selectObjs(
                        Wrappers.<Shop>query().select("id")
                ).stream()
                .map(obj -> ((Number) obj).longValue())  // 避免 BigInteger 转换错误
                .collect(Collectors.toList());

        // 2. 初始化布隆过滤器（预期元素 100 万，误判率 1%）
        bloomFilter = BloomFilter.create(
                Funnels.longFunnel(),
                1_000_000L,
                0.01
        );

        // 3. 将数据库中的店铺 ID 加入布隆过滤器
        ids.forEach(bloomFilter::put);
        log.info("布隆过滤器初始化完成，共存入 {} 个店铺 ID", ids.size());
    }

    public static BloomFilter<Long> getBloomFilter() {
        return bloomFilter;
    }
}
