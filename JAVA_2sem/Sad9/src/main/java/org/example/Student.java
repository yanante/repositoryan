package org.example;

import java.util.Objects;

//2. Напишите производный класс Student с добавленными полями университет, факультет,
//специальность.
public class Student extends Human {
    private String university;
    private String faculty;
    private String specialty;

    public Student(Human h, String u, String f, String sp) {
        super(h);
        university = u;
        faculty = f;
        specialty = sp;
    }
    @Override
    public int getAge() {return super.getAge();}
    @Override
    public String getMidname() {return super.getMidname();}
    @Override
    public String getName() {return super.getName();}
    @Override
    public String getSurname() {return super.getSurname();}
    public String getFaculty() {return faculty;}
    public String getSpecialty() {return specialty;}
    public String getUniversity() {return university;}

    public void setFaculty(String faculty) {this.faculty = faculty;}
    public void setSpecialty(String specialty) {this.specialty = specialty;}
    public void setUniversity(String university) {this.university = university;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(university, student.university) && Objects.equals(faculty, student.faculty) && Objects.equals(specialty, student.specialty);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), university, faculty, specialty);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", midname='" + midname + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                ", faculty='" + faculty + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
