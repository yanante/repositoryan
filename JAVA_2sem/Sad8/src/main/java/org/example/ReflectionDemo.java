/* 1. Дан список объектов произвольных типов. Найдите количество элементов списка, которые
являются объектами типа Human или его подтипами.
2. Для объекта получить список имен его открытых методов.

3. Для объекта получить список (в виде списка строк) имен всех его суперклассов до класса
Object включительно.*/
package org.example;
import java.lang.reflect.Method;
import java.util.*;

public class ReflectionDemo {
    public int findHumanObjects(List<Object> o){
        int num = 0;
        if ((o == null) || (o.isEmpty())) throw new IllegalArgumentException("List is null or empty");
        for (Object obj: o){
            Class <?> clazz = obj.getClass();
            while (!clazz.equals(Object.class)) {
                if (clazz == Human.class){
                    num++;
                }
                clazz = clazz.getSuperclass();
            }
        }
        return num;
    }

    public void getMethods(Object o) {
        Method[] methods = o.getClass().getMethods();
        System.out.println("\nPublic methods of class: " + o.getClass().getSimpleName());
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].toString());
        }
    }
    public List<String> getListSuperClasses (Object o){
        List<String> list = new ArrayList<>();
        Class <?> clazz = o.getClass();
        while (clazz != null) {
            list.add(clazz.getSimpleName());
            clazz = clazz.getSuperclass();
        }
        return list;
    }
}
