package com.XyDp.service.impl;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
//public class SentinelRuleInitializer implements CommandLineRunner {
//
//    @Override
//    public void run(String... args) throws Exception {
//        // 配置限流规则
//        List<FlowRule> flowRules = new ArrayList<>();
//        FlowRule flowRule = new FlowRule();
//        flowRule.setResource("seckillVoucher"); // 资源名称，与 @SentinelResource 中的 value 一致
//        flowRule.setCount(100); // 限流阈值，每秒允许通过 10 个请求
//        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS); // 限流模式，QPS 模式
//        flowRules.add(flowRule);
//        FlowRuleManager.loadRules(flowRules);
//
//        // 配置熔断规则
//        List<DegradeRule> degradeRules = new ArrayList<>();
//        DegradeRule degradeRule = new DegradeRule();
//        degradeRule.setResource("seckillVoucher"); // 资源名称，与 @SentinelResource 中的 value 一致
//        degradeRule.setCount(0.3); // 熔断阈值，异常比例阈值为 0.5
//        degradeRule.setGrade(RuleConstant.DEGRADE_GRADE_EXCEPTION_RATIO); // 熔断模式，异常比例模式
//        degradeRule.setTimeWindow(10); // 熔断时长，10 秒
//        degradeRules.add(degradeRule);
//        DegradeRuleManager.loadRules(degradeRules);
//    }
//}
