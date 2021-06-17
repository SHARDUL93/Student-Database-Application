package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {

//		Student std1 = new Student();
//		std1.enroll();
//		std1.payTuition();
//		System.out.println(std1.toString());
//		
		// how many students
		System.out.println("Enter number of new students to enroll:  ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];

		// create N students
		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}

		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].toString());
		}

	}
}
