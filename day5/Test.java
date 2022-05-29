package day5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		setAvailableTickets(25)
		Ticket t1=new Ticket();
		t1.setPrice(100);
//		t1.calculateTicketCost(5);
		t1.setTicketid(123);
		t1.setAvailableTickets(25);
		System.out.println(t1.calculateTicketCost(5));
	}

}
