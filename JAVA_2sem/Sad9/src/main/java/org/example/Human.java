package org.example;

import java.util.Objects;

public class Human {
    protected String name;
    protected String surname;
    protected String midname;
    protected int age;
    protected enum gender {MAN, WOMAN}
    public Human(String n, String s,String m, int a, gender g){
        if (a < 0) {throw new IllegalArgumentException("Age < 0");}
        if (n == null || n.equals("")){throw new IllegalArgumentException("name is not defined");}
        if (s == null || s.equals("")){throw new IllegalArgumentException("surname is not defined");}
        if (m == null || m.equals("")){throw new IllegalArgumentException("middle name is not defined");}
        name = n;
        surname = s;
        midname = m;
        age = a;
        this.gender = g;
    }
    public Human(Human h){
        name = h.getName();
        surname = h.getSurname();
        midname = h.getMidname();
        age = h.getAge();
        gender = ;
    }
    public String getName(){return name;}
    public String getSurname(){return surname;}
    public String getMidname(){return midname;}
    public int getAge(){return age;}
    public void setName(String o){name = o;}
    public void setSurname(String o){surname = o;}
    public void setMidname(String o){midname = o;}
    public void setAge(int o){age = o;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human h = (Human) o;
        return Objects.equals(name, h.getName()) && Objects.equals(surname, h.getSurname()) && Objects.equals(midname,h.getMidname()) && Objects.equals(age, h.getAge());
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, midname, age);
    }
    public String toString(){
        return surname + " " + name + " " + midname + " " + age + " y.o";
    }
}
