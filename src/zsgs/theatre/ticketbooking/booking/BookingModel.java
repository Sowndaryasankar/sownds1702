package zsgs.theatre.ticketbooking.booking;

import java.util.ArrayList;
import zsgs.theatre.ticketbooking.dao.Booking;
import zsgs.theatre.ticketbooking.dao.User;

public class BookingModel {
	BookingController bookingcontroller;

	public BookingModel(BookingController bookingController) {
		this.bookingcontroller = bookingController;
	}

	public BookingModel(String theatname, String moviename, int ticketno, int ticketrate) {
		// TODO Auto-generated constructor stub
	}
	ArrayList<Booking> Bookingdetails = new ArrayList<>();
	ArrayList<Booking> VT = new ArrayList<>();
	public void checkaddTheatre(int theatreno,String theatname, String moviename, int ticketno, int ticketrate) {
		if (Bookingdetails.add(new Booking(theatreno,theatname, moviename, ticketno, ticketrate))) {
			bookingcontroller.addtheatresuccessfully();
		} else
			bookingcontroller.addtheatrefailure();
	}
	public void checkTheatre() {
		VT.add(new Booking(1,"LAcinema", "DADA", 250, 140));
		VT.add(new Booking(2,"Sonamena", "Varisu", 50, 120));
		VT.add(new Booking(3,"LAcinema", "Vaathi", 100, 140));
		VT.add(new Booking(4,"LAcinema", "Don", 45, 100));
		VT.add(new Booking(5,"LAcinema", "Manithan", 150, 120));

		bookingcontroller.viewTheatres(VT);
	}

	public void checkticketbooking(int theatreno,String theatname,String moviename,int ticketcount,int ticketrate ) {
		String arr[] = new String[2];
		for(Booking b:VT) {
			if(b.getTheatreno()==theatreno) {
				if(b.getticketcount() - ticketcount>=0) {
					b.setticketno(b.getticketcount() - ticketcount);
					int totalcost = b.getticketcount() * ticketcount;
					String tc = Integer.toString(totalcost);
					arr[0]=tc;
					arr[1]=b.gettheatname(); // print
					}
					else
					{
						arr[0]=null;
						arr[1]=null;
					}
					
				}
				

			}
		
			

			return;
		}
			}
			
			
			
	
