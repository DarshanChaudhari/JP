package com.darshan.logic;

public class CheckStudentResult {

    public static void main(String[] args) {
        Student std1 = new Student(45,52,60);
        Student std2 = new Student(35,42,66);
        Student std3 = new Student(49,60,76);

        System.out.println("Result of Student 1 " + std1.checkResult());
        System.out.println("Result of Student 2 " + std2.checkResult());
        System.out.println("Result of Student 3 " + std3.checkResult());

        System.out.println("\nReset the Passing Score to 40");
        Student.setPassing(40);
        //Student.passingScore = 40;

        System.out.println("Result of Student 1 " + std1.checkResult());
        System.out.println("Result of Student 2 " + std2.checkResult());
        System.out.println("Result of Student 3 " + std3.checkResult());

        System.out.println("\nReset the Passing Score to 50");
//      Student.passingScore = 50;
        Student.setPassing(50);

        System.out.println("Result of Student 1 " + std1.checkResult());
        System.out.println("Result of Student 2 " + std2.checkResult());
        System.out.println("Result of Student 3 " + std3.checkResult());
    }
}

