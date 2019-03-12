package test;


import jdk.internal.dynalink.linker.MethodTypeConversionStrategy;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author XP
 * @date 2018/5/29 19:54
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception{
        //Class<?> classMethodClazz = Class.forName("test.ClassMethod");
        Class<?> classMethodClazz = ClassMethod.class;
        Object obj1 = classMethodClazz.newInstance();
        Constructor ctor = classMethodClazz.getConstructor(int.class,String.class);
        Object obj2 = ctor.newInstance(1,"xp");
        System.out.println(obj1);
        System.out.println(obj2);
        Method method = classMethodClazz.getMethod("test",int.class,String.class);
        //Object[] arg = {1,"xpp"};j
        method.invoke(obj1,2,"xp");
        Field field1 = classMethodClazz.getField("id");
        System.out.println("通过getInt得到的id值： " + field1.getInt(obj2));
        field1.setInt(obj2,2);
        System.out.println("setInt改变过的id值： " + field1.getInt(obj2));
        Field field2 = classMethodClazz.getDeclaredField("name");
        System.out.println("通过getInt得到的非public修饰的name值： " + field2.get(obj2));
        Field[] field3 = classMethodClazz.getDeclaredFields();
        System.out.println("通过getDeclaredFields得到的id值： " + field3[0].getInt(obj2) + " 通过getDeclaredFields得到的name值： " + field3[1].get(obj2));
        Object arr = Array.newInstance(String.class,10);
        Array.set(arr,0,"xp");
        System.out.println("Array动态创建数组： " + Array.get(arr,0));
    }
}
