package com.yejinhui.shardingjdbcmasterslavetables;


import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * 自定义分片算法，可以针对单个表写分片算法
 *
 * @author jinhui.ye@ucarinc.com
 * @date 2019/06/29
 */
public class MyPreciseShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Integer> shardingValue) {
        for (String tableName : availableTargetNames) {
            //分4个表，对4取余数0,1,2,3
            if (tableName.endsWith(shardingValue.getValue() % 4 + "")) {
                return tableName;
            }
        }
        throw new IllegalArgumentException();
    }

}