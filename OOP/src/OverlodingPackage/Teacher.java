package OverlodingPackage;

public class Teacher {
    String name,gender;
    int id,phone,age;
    Teacher(){
        System.out.print("Nothing Found ");
    }
    Teacher (String n,String g){
        name = n;
        gender =g;
    }
    Teacher (String n,String g,int p){
        name = n;
        gender = g;
        phone = p;
    }

    void displayInfo(){
        System.out.println("Name is "+name);
        System.out.println("Gender is "+gender);
        System.out.println("Phone number  is "+phone);
        System.out.println("Age is is "+age);
    }
}
