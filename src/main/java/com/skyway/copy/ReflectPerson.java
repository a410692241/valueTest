package com.skyway.copy;
/**
 * 复制对象
 *
 * @author qichunlin
 */

import java.lang.reflect.Constructor;

import java.lang.reflect.Field;

import java.lang.reflect.Method;

public class ReflectPerson {
    public Object copy(Object object) throws Exception {
        //加载类
        Class c = object.getClass();
        //获取类中的构造方法
        Constructor ct = c.getConstructor(new Class[]{});
        //在构造方法中传值
        Object obj = ct.newInstance(new Object[]{});
        //获取所有 属性 返回数组
        Field[] f = c.getDeclaredFields();
        for (Field field : f) {
            String name = field.getName();
            //System.out.println("a"+name);
            //截取
            String firstLetter = name.substring(0, 1).toUpperCase();
            String getMethodName = "get" + firstLetter + name.substring(1);
            String setMethodName = "set" + firstLetter + name.substring(1);
            //获取无参构造方法
            Method getMethod = c.getDeclaredMethod(getMethodName, new Class[]{});
            Method setMethod = c.getDeclaredMethod(setMethodName, new Class[]{field.getType()});
            //执行赋值无参构造方法
            Object value = getMethod.invoke(object, new Object[]{});
            System.out.println(value);
            //执行赋值有参构造方法
            setMethod.setAccessible(true);
            setMethod.invoke(obj, new Object[]{value});
        }
        return obj;

    }

}
