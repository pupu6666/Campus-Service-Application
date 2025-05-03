package com.XyDp.service;

import com.XyDp.dto.Result;
import com.XyDp.entity.ShopType;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IShopTypeService extends IService<ShopType> {
    Result queryshopTypeList();
}
