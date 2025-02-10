package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ListDemo {
    public List<Human> getListOfSimilarSurnames(List<Human> l, Human h){ //3
        List<Human> newList = new ArrayList<>();
        for (Human human : l) {
            if (human.getSurname().equals(h.getSurname())){
                newList.add(human);
            }
        }
        return newList;
    }
    public List<Human> getListWithoutHuman(List<Human> l, Human h){
        List<Human> newList = new ArrayList<>(l);
        for (Human human : l) {
            if (human.equals(h)){
                newList.removeAll(List.of(h));
            }
        }
        return newList;
    }
    public List<Set<Integer>> XorOfSets(List<Set<Integer>> a, Set<Integer> b){ //4
        List<Set<Integer>> newList = new ArrayList<Set<Integer>>(a);

        return newList;
    }
    public List<? extends Human> maxAge(List<Human> l, int age){
        List<Human> newList = new ArrayList<>();
        for (Human human : l){
            if (human.getAge() > age){
                newList.add(human);
            }
        }
        return newList;
    }
}
