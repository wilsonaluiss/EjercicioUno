package clases;

public class Employee {
    
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

   void printData(){
       System.out.println("datos del empleado....");
       System.out.println("Nombre :"+name);
       System.out.println("Edad :"+age);
       System.out.println("Salario :"+ salary);
   }
    
    

}
