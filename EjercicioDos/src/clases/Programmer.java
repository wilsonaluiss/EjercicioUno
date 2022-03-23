package clases;

public class Programmer extends Employee {

    String language;

    public Programmer(String language, String name, int age, double salary) {
        super(name, age, salary);
        this.language = language;
    }

    void printData() {
        System.out.println("datos del empleado....");
        System.out.println("Nombre :" + name);
        System.out.println("Edad :" + age);
        System.out.println("Salario :" + salary);
        System.out.println("lenguaje :" +language);
    }

}
