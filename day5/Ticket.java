package day5;

public class Ticket {
	private  int ticketid;
	private int price;
	static int availableTickets;
	
	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0) {
			Ticket.availableTickets = availableTickets;
		}
		else {
			System.out.println("Please Provide Positive Number");
		}
	}
	public int calculateTicketCost(int nooftickets) {
		int amount;
		if(nooftickets<=availableTickets) {
			availableTickets+=-nooftickets;
			amount=nooftickets*price;
			System.out.println("availableTickets after booking "+availableTickets);
			return amount;
		}
		else {
			return -1;
		}
		
	}
	public static void main(String[] args) {
		setAvailableTickets(25);
		Ticket t1=new Ticket();
		t1.ticketid=123;
		t1.price=100;
		System.out.println(t1.calculateTicketCost(5));

	}

}
