package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Design a solution algorithm that will read a file of student test results and produce a student test grades report.
 * Each test record contains the student number, name and test score (out of 50). The program is to calculate for each
 * student the test score as a percentage and to print the student’s number, name, test score (out of 50) and letter
 * grade on the report.
 *
 * The letter grade is determined as follows:
 * A = 90–100%
 * B = 80–89%
 * C = 70–79%
 * D = 60–69%
 * F = 0–59%
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	    long studentNumber;
        String name;
        int testScore;
        char grade;
        int percent = 0;

        File x = new File("out\\production\\PrintingGrades\\com\\company\\test.txt");
        Scanner sc = new Scanner(x);
        studentNumber = sc.nextLong();
        name = sc.next();
        testScore =  sc.nextInt();

        percent = testScore * 100 / 50;

        if((percent >= 90) & (percent <= 100)){
            grade = 'A';
        } else if((percent >= 80) & (percent <= 89)){
            grade ='B';
        } else if((percent >= 70) & (percent <= 79)){
            grade = 'C';
        } else if((percent >= 60) & (percent <= 69)){
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.printf("Student number %d, Name %s and Test Score %d and Grade %s"
                ,studentNumber, name, testScore, grade);
    }
}
