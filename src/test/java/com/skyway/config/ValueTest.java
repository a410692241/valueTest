package com.skyway.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ValueTest {
    @Value("#{'${test.list}'.split(',')}")
    private List<String> list;
    @Value("#{${test.map}}")
    private Map<String,String> map;
    @Test
    public void testList(){
        System.out.println(list.size());
    }
    @Test
    public void testMap(){
        System.out.println(map.toString());
    }
}
