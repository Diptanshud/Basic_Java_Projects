//Student Grade System

import java.util.Scanner;
public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numberofStudents = sc.nextInt();
        sc.nextLine();

        String[] name = new String[numberofStudents];
        int[] marks = new int[numberofStudents];
        char[] grades = new char[numberofStudents];

        for (int i=0; i<numberofStudents;i++) {
            System.out.println("Enter Name of Student" + (i + 1));
            name[i] = sc.nextLine();

            System.out.println("Enter the marks "+name[i]);
            marks[i]=sc.nextInt();
            sc.nextLine();

            grades[i]=displayGrades(grades[i]);
        }
        displayResult(name,marks,grades);
        sc.close();
    }
    public static char displayGrades(int score){
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static void displayResult(String[] name, int[] marks, char[] grades){
        System.out.println("\nStudent Grades:");
        System.out.println("-------------");
        System.out.println("Name\t\tScore\tGrade");
        System.out.println("--------------");
        for (int i=0; i< name.length;i++){
            System.out.printf("%-10s\t%d\t%c%n",name[i],marks[i],grades[i]);
        }
        System.out.println("------------");
    }
}

