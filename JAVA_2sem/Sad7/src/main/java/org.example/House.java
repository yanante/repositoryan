//House (дом), содержит кадастровый номер дома (строка), адрес, старшего по дому
package org.example;

import java.util.List;
import java.util.Objects;

public class House {
    private List<Flat> listOfFlat;
    private Person oldOfHouse;
    private String Cadastr;
    private String address;

    public House(List<Flat> h, Person man, String c, String a){
        this.address = a;
        this.Cadastr = c;
        this.oldOfHouse = man;
        this.listOfFlat = h;
    }

    public List<Flat> getListOfFlat() {return listOfFlat;}
    public Person getOldOfHouse() {return oldOfHouse;}
    public String getAddress() {return address;}
    public String getCadastr() {return Cadastr;}

    public void setAddress(String address) {this.address = address;}
    public void setCadastr(String cadastr) {Cadastr = cadastr;}
    public void setListOfFlat(List<Flat> listOfFlat) {this.listOfFlat = listOfFlat;}
    public void setOldOfHouse(Person oldOfHouse) {this.oldOfHouse = oldOfHouse;}

    @Override
    public String toString() {
        return "House{" +
                "listOfFlat=" + listOfFlat +
                ", oldOfHouse=" + oldOfHouse +
                ", Cadastr='" + Cadastr + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(listOfFlat, house.listOfFlat) && Objects.equals(oldOfHouse, house.oldOfHouse) && Objects.equals(Cadastr, house.Cadastr) && Objects.equals(address, house.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfFlat, oldOfHouse, Cadastr, address);
    }
}
