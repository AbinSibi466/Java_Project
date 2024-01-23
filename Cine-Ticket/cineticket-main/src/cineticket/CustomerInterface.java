package cineticket;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerInterface {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerInterface window = new CustomerInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CustomerInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		Image icon = Toolkit.getDefaultToolkit().getImage("movies-app.png");
		frame.setIconImage(icon);
		frame.setBounds(100, 100, 545, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 531, 306);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton moviesButton = new JButton("Movies");
		moviesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				frame.dispose();
                MoviesInterface moviesInterface = new MoviesInterface();
                moviesInterface.frame.setVisible(true);
			}
		});
		moviesButton.setBounds(62, 115, 142, 43);
		panel.add(moviesButton);
		
		JButton bookATicketButton = new JButton("Book A Ticket");
		bookATicketButton.setBounds(314, 115, 142, 43);
		panel.add(bookATicketButton);
		
		JButton paymentMethodsButton = new JButton("Payment Methods");
		paymentMethodsButton.setBounds(62, 200, 142, 43);
		panel.add(paymentMethodsButton);
		
		JButton helpButton = new JButton("Help");
		helpButton.setBounds(314, 200, 142, 43);
		panel.add(helpButton);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				LoginInterface li = new LoginInterface();
				li.frame.setVisible(true);
			}
		});
		btnLogOut.setBounds(409, 272, 89, 23);
		panel.add(btnLogOut);
	}

}
