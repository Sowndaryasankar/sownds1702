package zsgs.theatre.ticketbooking.dao;

public class Booking {
	private String theatname;
	private String moviename;
	private int ticketcount;
	private int ticketno;
	private int ticketrate;
	private int theatreno;

	public int getTheatreno() {
		return theatreno;
	}

	public void setTheatreno(int theatreno) {
		this.theatreno = theatreno;
	}

	public Booking(int theatreno,String theatname, String moviename, int ticketcount, int ticketno, int ticketrate) {
		this.theatreno=theatreno;
		this.theatname = theatname;
		this.moviename = moviename;
		this.ticketcount = ticketcount;
		this.ticketno = ticketno;
		this.ticketrate = ticketrate;
	}

	public Booking( int theatreno,String theatname, String moviename, int ticketcount, int ticketrate) {
		this.theatreno=theatreno;
		this.theatname = theatname;
		this.moviename = moviename;
		this.ticketcount = ticketcount;
		this.ticketrate = ticketrate;
	}

	public int getticketno() {
		return ticketno;
	}

	public int getticketrate() {
		return ticketrate;
	}



	public String getmoviename() {
		return moviename;
	}

	public int getticketcount() {
		return ticketcount;
	}

	
	public String gettheatname() {
		
		return theatname;
	}

	public void setticketno(int i) {
		// TODO Auto-generated method stub
		
	}

}
