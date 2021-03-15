package com.skyway.copy;
import java.lang.reflect.InvocationTargetException;

/**
 * @author qichunlin
 */

public class Test {
    public static void main(String[] args) throws Exception, InvocationTargetException {
        ReflectPerson rp = new ReflectPerson();
        Person p = new Person("Legend", 22);
        Person obj = (Person) rp.copy(p);
        System.out.println(obj.getName() + "\t" + obj.getId());

    }

}