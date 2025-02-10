package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        Human human = new Human("Sad", "rus", "aman", 11);
        Student st = new Student(human,"FKN");
        list.add(human);
        list.add(new Human("S123", "ghf", "asd", 12));
        list.add(st);
        list.add(new Student(human,"imit"));
        list.add(new Human("Chel", "sur", "rashid", 13));

        list.add(new Man(st));
        list.add(new Man(st));

        list.add(12);
        list.add("Word");
        list.add("asd");
        System.out.println(list);

        ReflectionDemo rd = new ReflectionDemo();
        System.out.println("List of Human and students: " + rd.findHumanObjects(list));

        rd.getMethods(human);
        rd.getMethods(st);
        rd.getMethods(list);

        System.out.println("List of superclasses");
        System.out.println(rd.getListSuperClasses(st));
        System.out.println(rd.getListSuperClasses(list));

    }
}