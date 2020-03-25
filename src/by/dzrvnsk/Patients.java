package by.dzrvnsk;

import java.util.Scanner;

public class Patients {
    // Task 5
    public static void main(String[] args) {
        Patients p = new Patients();
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество пациентов:");
        int quantity = sc.nextInt();
        System.out.println("Количество пациентов = " + quantity);
        Patient[] pats = new Patient[quantity];
        p.setPatients(pats);
        p.getPatients(pats);

        String command = "";
        command = sc.nextLine();
        while (!(command.equals("exit"))) {
            System.out.println("Введите следующую команду (name, age, exit)");
            command = sc.nextLine();
            switch (command) {
                case "name":
                    System.out.println("Searching by name");
                    String searchName = sc.nextLine();
                    p.searchByName(pats, searchName);
                    break;

                case "age":
                    System.out.println("Searching by age");
                    int searchAge = sc.nextInt();
                    p.searchByAge(pats, searchAge);
                    break;

                default:
                    break;
            }
        }
    }

    public void setPatients(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) {
            patients[i] = new Patient();
            System.out.println("Введите данные пациента " + (i + 1));
            patients[i].addPatient();
        }
    }

    public void getPatients(Patient[] patients) {
        System.out.println("Данные пациентов");
        for (int i = 0; i < patients.length; i++) {
            patients[i].getPatient();
        }
    }

    public void searchByName(Patient[] patients, String name) {
        boolean found = false;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].searchPatientName(name)) {
                found = true;
                patients[i].getPatient();
            }
        }
        if (!found) {
            System.out.println("В базе нет пациента с таким именем");
        }
    }

    public void searchByAge(Patient[] patients, int age) {
        boolean found = false;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].searchPatientAge(age)) {
                found = true;
                patients[i].getPatient();
            }
        }
        if (!found) {
            System.out.println("В базе нет пациента с таким возрастом");
        }
    }
}
