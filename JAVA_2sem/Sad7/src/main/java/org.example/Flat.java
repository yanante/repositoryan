// Flat (квартира), содержит номер, площадь, данные о владельцах (список людей)
package org.example;

import java.util.List;
import java.util.Objects;

public class Flat{
    private List<Person> listOfPeople;
    private int num;
    private double sizeOfFlat;
    public Flat(List<Person> p, int num, double size){
        this.listOfPeople = p;
        this.num = num;
        this.sizeOfFlat = size;
    }

    public void setListOfPeople(List<Person> listOfPeople) {this.listOfPeople = listOfPeople;}
    public void setNum(int num) {this.num = num;}
    public void setSizeOfFlat(double sizeOfFlat) {this.sizeOfFlat = sizeOfFlat;}
    public double getSizeOfFlat() {return sizeOfFlat;}
    public int getNum() {return num;}
    public List<Person> getListOfPeople() {return listOfPeople;}

    @Override
    public String toString() {
        return "Flat{" +
                "listOfPeople=" + listOfPeople +
                ", num=" + num +
                ", sizeOfFlat=" + sizeOfFlat +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flat flat = (Flat) o;
        return num == flat.num && Double.compare(flat.sizeOfFlat, sizeOfFlat) == 0 && Objects.equals(listOfPeople, flat.listOfPeople);
    }
    @Override
    public int hashCode() {
        return Objects.hash(listOfPeople, num, sizeOfFlat);
    }
}
