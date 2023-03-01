package zsgs.theatre.ticketbooking.booking;

import java.util.ArrayList;

import zsgs.theatre.ticketbooking.dao.Booking;

public class BookingController {
	BookingView bookingview;
	BookingModel bookingmodel;

	public BookingController(BookingView bookingView) {
		this.bookingview=bookingView;
		this.bookingmodel=new BookingModel(this);
		
	}

	public void checkaddTheatre(int theatreno,String theatname, String moviename, int ticketno, int theatrate) {
		bookingmodel.checkaddTheatre(theatreno, theatname,moviename,ticketno,theatrate);
		
	}

	public void addtheatresuccessfully() {
		bookingview.addtheatresuccessfully();		
	}

	public void addtheatrefailure() {
		bookingview.addtheatrefailure();
		
	}

	public void viewTheatres(ArrayList<Booking> VT) {
		bookingview.viewTheatres(VT);
		
	}
	public void checkTheatre()
	{
		bookingmodel.checkTheatre();
	}

	public void checkticketbooking() {
		bookingmodel.checkticketbooking(0, null, null, 0, 0);
		
	}

	public void ticketbookingsuccess() {
		bookingview.ticketbookingsuccess();
		
	}

	public void ticketbookingfailed() {
		bookingview.ticketbookingfailed();
		
	}

	public String[] checkticketBooking(int theatreno, String theatname, int ticketcount, int ticketrate) {
		// TODO Auto-generated method stub
		return null;
	}
}
