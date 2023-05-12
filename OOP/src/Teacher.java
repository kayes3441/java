public class Teacher {
    String name,gender;
    int mobile,age;

    Teacher(String n ,String g,int m,int a){

        name = n;
        gender = g;
        mobile = m;
        age = a;
    }
    void displayInfo(){
        System.out.println(" Name : "+name);
        System.out.println(" Gender : "+gender);
        System.out.println(" Mobile : "+mobile);
        System.out.println(" Age : "+age);
    }
}
