package com.company;
import model.Student;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Main {


    public static void main(String[] args) {
     Student a = new Student();
     Student b= new Student("peter",123,12,true);
        System.out.println(b.getAge()+"" +b.getGender()+b.getName()+b.getStudentNumber());

    }

    }

