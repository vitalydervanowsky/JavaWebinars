package by.dzrvnsk;

import java.util.Scanner;

public class Patient {
    String name;
    int age;
    boolean isIll;

    public void addPatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name = ");
        this.name = scanner.nextLine();
        System.out.print("age = ");
        this.age = scanner.nextInt();
        System.out.print("isIll = ");
        this.isIll = scanner.nextBoolean();
    }

    public void getPatient() {
        System.out.println("Пациент " + this.name + " - " + this.age + " = " + this.isIll);
    }

    public boolean searchPatientName (String name) {
        if (this.name.equals(name)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean searchPatientAge (int age) {
        if (this.age == age) {
            return true;
        } else {
            return false;
        }
    }
}
