package org.example;

import org.w3c.dom.css.CSSUnknownRule;

public class Student extends Human {
    private String faculty;

    public Student(String n, String s,String m, int a, String f){
        super(n,s,m,a);
        faculty = f;

    }
    public Student(Human h, String f){
        super(h.getName(), h.getSurname(), h.getMidname(), h.getAge());
        faculty = f;
    }
    public Student(Student st){
        super(st);
    }
    public String getFaculty(){return faculty;}
    public void setFaculty(String f){faculty = f;}

    @Override
    public String toString(){
        return "Student from " +  faculty + " faculty: " + name + " " + surname + " " + midname + " " + age + " y.o ";
    }

}
