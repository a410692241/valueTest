package com.skyway.copy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 创建人
 *
 * @author qichunlin
 */

public class Person {
    private int id;

    private String name;

    public int getId() {
        return id;

    }

    private void setId(int id) {
        this.id = id;

    }

    public String getName() {
        return name;

    }

    private void setName(String name) {
        this.name = name;

    }

    //有参构造方法

    public Person(String name, int id) {
        super();
        this.id = id;
        this.name = name;

    }

    //无参构造方法

    public Person() {
        super();
    // TODO Auto-generated constructor stub
    }

}

