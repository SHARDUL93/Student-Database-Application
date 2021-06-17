package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tutionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1001;

	// constructor
	public Student() {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();

		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();

		System.out.println(
				"1 - Freshman\n" + "2 - Sophomore\n" + "3 - Junior\n" + "4 - Senior" + "\nEnter student class level: ");
		this.gradeYear = in.nextInt();

		setStudentID();

		// System.out.println(firstName + " " + lastName + " " + gradeYear + " " +
		// studentID);

	}

	// gen. an ID
	private void setStudentID() {
		id++;
		this.studentID = gradeYear + " " + id;
	}

	// enroll in courses
	public void enroll() {
		do {
			System.out.println("Enter course to enroll(Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equalsIgnoreCase("Q")) {
				courses = courses + "\n " + course;
				tutionBalance = tutionBalance + costOfCourse;
			} else {
				break;
			}
		} while (true);

		// System.out.println("ENROLLED IN: " + courses);
		// System.out.println("TUITION BALANCE: " + tutionBalance);

	}

	// view balance
	public void viewBalance() {
		System.out.println("Your balance is : $ " + tutionBalance);

	}

	// pay tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment : $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tutionBalance = tutionBalance - payment;

		System.out.println("Thank you for your payment of : $ " + payment);
		viewBalance();

	}

	// show status
	public String toString() {
		return "\nDISPLAY NAME: " + firstName + " " + lastName + "\nGRADE LEVEL " + gradeYear + "\nSTUDENT ID: "
				+ studentID + "\nCOURSES ENROLLED: " + courses + "\nBALANCE : $ " + tutionBalance;
	}
}
