import java.util.Scanner;
public class MovieTicket {
    public static void displayBill(String movieName, int ticketPrice, int numberOfTickets, double discountPercentage) {
        int totalCost = ticketPrice * numberOfTickets;
        double discountAmount = totalCost * discountPercentage / 100;
        double finalCost = totalCost - discountAmount;
        System.out.println("Movie Name: " + movieName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Cost: " + finalCost);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String movieName = "Spider-Man: No Way Home";
        int ticketPrice = 150;
        System.out.println("Enter Number of Tickets: ");
        int numberOfTickets = sc.nextInt();
        double discountPercentage = numberOfTickets >= 5 ? 10.0 : 0.0;
        double discountAmount = (ticketPrice * numberOfTickets) * (discountPercentage / 100);
        displayBill(movieName, ticketPrice, numberOfTickets, discountPercentage);
    }
}
