/*Напишите класс CollectionsDemo со следующим набором методов.
1. Вход: список строк и символ. Выход: количество строк входного списка, у которых первый
символ совпадает с заданным.
2. Создайте класс Human с полями: фамилия, имя, отчество, возраст и методами:
конструкторы, геттеры/сеттеры, equals и hashCode.
Напишите метода класса ListDemo, который получает на вход список объектов типа Human
и еще один объект типа Human. Результат — список однофамильцев заданного человека
среди людей из входного списка.
3. Вход: список объектов типа Human и еще один объект типа Human. Выход — копия
входного списка, не содержащая выделенного человека. При изменении элементов
входного списка элементы выходного изменяться не должны.
4. Вход: список множеств целых чисел и еще одно множество. Выход: список всех множеств
входного списка, которые не пересекаются с заданным множеством.
5. Создайте класс Student, производный от Human, новое поле — название факультета, к
нему геттер, сеттер и конструктор.
Напишите метод класса ListDemo, который получает на вход список, состоящий из
объектов типа Human и его производных классов. Результат — множество людей из
входного списка с максимальным возрастом.
7. Имеется набор людей, каждому человеку задан уникальный целочисленный
идентификатор. Напишите метод, который получает на вход отображение (Map)
целочисленных идентификаторов в объекты типа Human и множество целых чисел.
Результат — множество людей, идентификаторы которых содержатся во входном
множестве.
8. Для отображения из задачи 7 постройте список идентификаторов людей, чей возраст не
менее 18 лет.
9. Для отображения из задачи 7 постройте новое отображение, которое идентификатору
сопоставляет возраст человека.
10. По множеству объектов типа Human постройте отображение, которое целому числу
(возраст человека) сопоставляет список всех людей данного возраста из входного
множества.*/
package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Human h = new Human("Rus", "Sad", "Otc", 14);
        System.out.println(h.toString());

        Student s = new Student(h,"fac");
        System.out.println(s.toString());


        List<Human>  hl = new ArrayList<>();
        hl.add(new Human("a", "Sad", "a", 1));
        hl.add(new Human("b", "Sad", "b", 2));
        hl.add(new Human("c", "Sad1", "c", 3));
        ListDemo ld = new ListDemo();
        List<Human>  hl3 = new ArrayList<>();
        hl3 = ld.getListOfSimilarSurnames(hl, h);
        System.out.println(hl3);
        System.out.println();

        List<Human>  hl1 = new ArrayList<>();

        hl1.add(new Human("Rus1", "Sad1", "Otc1", 1123));
        hl1.add(new Human("Rus12", "Sad1231", "Ot123c1", 12));
        hl1.add(h);
        System.out.println(hl1.toString());
        hl1 = ld.getListWithoutHuman(hl1,h);
        System.out.println(hl1.toString());
        System.out.println();
        System.out.println(hl);
        hl = ld.getListWithoutHuman(hl, h);
        System.out.println(hl);

        List<Integer> i1 = new ArrayList<>();
        List<Integer> i2 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        List<Set<Integer>> list = new ArrayList<>();

        System.out.println(-1752869353);
        System.out.println(h.hashCode());

    }
}
