package com.tosan.redissoncodectest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;

@SpringBootTest
public abstract class InitializeRedisTest {
    protected static RedissonClient redisson;
    protected static RedissonClient defaultRedisson;

    @BeforeAll
    public static void BeforeTestClass() {
        defaultRedisson=createInstance();
    }
    @BeforeTestClass
    public static void before(){
        if(redisson==null)
            redisson=defaultRedisson;
        if(flushBetweenTest())
            redisson.getKeys().flushall();
    }
    public static RedissonClient createInstance(){
        Config config=createConfig();
        return Redisson.create(config);
    }

    public static Config createConfig() {
        final String redis_address= "redis://127.0.0.1:6379";
        Config config=new Config();
        config.useSingleServer().setAddress(redis_address);
        return config;
    }

    @AfterAll
    public static void after(){}
    private static boolean flushBetweenTest() {
        return true;
    }
}
