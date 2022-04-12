package com.company;

class Student{

    int id;
    String name;
    int roll;

    public String getName(String st)
    {
        String name="StudyTonight";
        name=name+st;
        return name;
    }
}
public class Main {
    public static void main(String[] args) {
	 Student s=new Student();
      String k=s.getName(".com");
      System.out.print(k);
    }
}
