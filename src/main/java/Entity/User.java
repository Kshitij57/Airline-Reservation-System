package Entity;

import java.util.Scanner ;
public class User {

	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Airline Reservation System");
		
	
		System.out.println("Press 1 to Register");
		System.out.println("Press 2  to Login");
		System.out.println("Press 3  to Book Ticket");
		System.out.println("Press 3  to check Available Ticket");
		System.out.println("Press 4 to Exit Ticket Booking ");
		int a = 0;
		while ( a==0) {
			if (a==1) {
				System.out.println("Welcome to Passenger Registration ");
			}
			if (a==2) {
				System.out.println("Welcome to Passenger Login");
			}
			if(a==3) {
				System.out.println("Welcome to Flight Ticket Bookking");
			}
			if (a==4) {
				System.out.println("Welcome   to check Available Ticket");
			}
			if (a==5) {
				System.out.println("Exited Ticket Booking SUcessfully");
			}
		}
		
	}
}
