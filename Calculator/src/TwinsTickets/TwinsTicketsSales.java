package TwinsTickets;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class TwinsTicketsSales {
	public static void main(String[] args) {
		final int TICKET_PRICE = 75;
		final int PROCESSING_FEE = 20;
		final double TAX = 0.07;
		String t = JOptionPane.showInputDialog("Number of Tickets");
		JFrame frame = new JFrame("Frame");
		int cost = Integer.parseInt(t) * TICKET_PRICE + PROCESSING_FEE;
		JOptionPane.showMessageDialog(frame, Integer.toString(cost));
	}
}
