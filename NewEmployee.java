import java.util.*;
class Employee{
    String name,address;
    int age,salary;
    long phno;

    void PrintSalary(){
        System.out.println("Salary:"+salary);
    }
}

class Officer extends Employee{
    String specialization;
}

class Manager extends Employee{
    String department;
}
public class NewEmployee {
    public static void main(String args[]){
    Officer of1 = new Officer();
    Manager mn1 = new Manager();
    of1.name = "John";
    of1.address = "ABCD, Florida, 1234";
    of1.age = 21;
    of1.phno = 965432100;
    of1.salary = 80000;
    System.out.println("OFFICER DETAILS");
    System.out.println("name:"+of1.name+"\naddress:"+of1.address+"\nage:"+of1.age+"\nphone:"+of1.phno);
    of1.PrintSalary();
    mn1.name = "Jack";
    mn1.address = "EFGH, Texas, 5678";
    mn1.age = 26;
    mn1.phno = 923111100;
    mn1.salary = 100000;
    System.out.println("MANAGER DETAILS");
    System.out.println("name:"+mn1.name+"\naddress:"+mn1.address+"\nage:"+mn1.age+"\nphone:"+mn1.phno);
    mn1.PrintSalary();
    }
}