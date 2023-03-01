package zsgs.theatre.ticketbooking.booking;

import java.util.ArrayList;
import java.util.Scanner;
import zsgs.theatre.ticketbooking.dao.Booking;
import zsgs.theatre.ticketbooking.*;

public class BookingView {
	BookingController bookingcontroller;
	Scanner scanner = new Scanner(System.in);
	BookingController s1=new BookingController(null);
	public BookingView() {
		bookingcontroller = new BookingController(this);
	}

	public static void main(String[] args) {
		BookingView bv = new BookingView();
		bv.bookMyShow();
	}

	public void bookMyShow() {
		boolean setup = true;
		do {
			System.out.println("Welcome to Theatre Ticket Booking ");
			System.out.println("\n 1.Add Theatres\n 2.View Theatres \n 3.TicketBookings\n 4.Exit\n");
			System.out.println("Enter your chioce");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addTheatre();
				break;
			case 2:
				checkTheatre();
				break;
			case 3:
				ticketBooking();
				break;
			case 4:
				setup = false;
				break;
			default:
				System.out.println("\n Choose correct options\n");
				break;

			}
		} while (setup);
	}

	public void viewTheatres(ArrayList<Booking> VT) {
		for (Booking Vt : VT) {
			System.out.println(
					Vt.gettheatname() + " " + Vt.getmoviename() + " " + Vt.getticketrate() + " " + Vt.getticketcount());
		}
	}

	private void ticketBooking() {
		System.out.println("Enter theatreNo");
		int theatreno=scanner.nextInt();
		System.out.println("Enter theatre name:");
		String theatname=scanner.next();
		System.out.println("Enter movie name:");
		String moviename=scanner.next();
		System.out.println("Enter ticketcount:");
		int ticketcount=scanner.nextInt();
		System.out.println("Enter ticketrate:");
		int ticketrate=scanner.nextInt();
		bookingcontroller.checkticketbooking();
		String[] arr=s1.checkticketBooking(theatreno,theatname,ticketcount,ticketrate);

		System.out.println("theatrename:"+arr[1]);
		System.out.println("ticketcount:"+arr[0]);
		System.out.println("Booked Successfully Happy Journey");
		}

	private void addTheatre() {
		System.out.println("Enter TheatreNo");
		int theatreno=scanner.nextInt();
		System.out.println("Enter theatre Name : ");
		String theatname = scanner.next();
		System.out.println("Enter Movie Name : ");
		String moviename = scanner.next();
		System.out.println("Enter Ticket  Numberof tickets: ");
		int ticketno = scanner.nextInt();
		System.out.println("Enter Ticket Rate in Rs₹ : ");
		int ticketrate = scanner.nextInt();
		bookingcontroller.checkaddTheatre(theatreno,theatname, moviename, ticketno, ticketrate);

	}

	public void addtheatresuccessfully() {
		System.out.println("Theatre added Successfully");

	}

	public void addtheatrefailure() {
		System.out.println("Sorry!!addedFailed");

	}

	private void checkTheatre() {
		bookingcontroller.checkTheatre();
	}

	public void ticketbookingsuccess() {
		System.out.println("Ticket booked Successfull");
		
	}

	public void ticketbookingfailed() {
		System.out.println("SORRY!!!...Ticket not available....");
		
		
	}

	
}
