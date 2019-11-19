package model;

import java.lang.reflect.GenericArrayType;

public class Student {
    private String name;
    private int studentNumber;
    private int age;
    private boolean gender;
    public Student(){}
    public Student (String name,int studentNumber,int age, boolean gender ){
        this.name= name;
        this.studentNumber=studentNumber;
        this.age=age;
        this.gender=gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getAge(){
        return age;
    }

    public void  setAge(int Age){
        this.age=Age;
    }

    public boolean getGender(){
        return gender;

    }

    public void setGender(boolean Gender){
        this.gender= Gender ;

    }

}
