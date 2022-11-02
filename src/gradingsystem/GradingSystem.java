/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradingsystem;

import java.util.Scanner;
import object.Student;

/**
 *
 * @author user
 */
public class GradingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //initialiser creer tableau vide
        Student[] listStudents = new Student[5];
        for (int i = 0; i < 5; i++) {
            String n;
            
            System.out.println("entrer nom");
            //String n = sc.next();
            System.out.println("entrer prenom");
            //String p = sc.next();
            System.out.println("entrer note1");
            //double no1 = sc.nextDouble();
            System.out.println("entrer note2");
            //double no2 = sc.nextDouble();
            double no1;
            double no2;
            String p;

            Student student1 = new Student(n = sc.next(), p = sc.next(), no1 = sc.nextDouble(), no2 = sc.nextDouble());

            listStudents[i] = student1;
        }

        for (Student s : listStudents) {

            if ((s.getNote1() + s.getNote2()) / 2 > 60) {

                System.out.println(s.getNom() + " " + s.getPrenom() + "  " + "SUCCESS");

            } else {
                System.out.println(s.getNom() + " " + s.getPrenom() + "  " + "ECHEC");
            }

        }

    }

}
