package clases;

public class DatabasePro extends Employee{
    
    String databaseTool;

    public DatabasePro(String databaseTool, String name, int age, double salary) {
        super(name, age, salary);
        this.databaseTool = databaseTool;
    }
    
    void printData() {
        System.out.println("datos del empleado....");
        System.out.println("Nombre :" + name);
        System.out.println("Edad :" + age);
        System.out.println("Salario :" + salary);
        System.out.println("Herramiento base de datos :" +databaseTool);
    }

}
