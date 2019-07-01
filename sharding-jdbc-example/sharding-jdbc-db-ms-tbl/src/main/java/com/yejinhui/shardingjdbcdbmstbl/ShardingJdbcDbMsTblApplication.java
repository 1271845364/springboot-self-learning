package com.yejinhui.shardingjdbcdbmstbl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(value = {"com.yejinhui.shardingjdbcdbmstbl.mapper"})
public class ShardingJdbcDbMsTblApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcDbMsTblApplication.class, args);
    }

}
