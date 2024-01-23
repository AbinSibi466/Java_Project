package cineticket;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SystemOwnerMovieInterface {

	JFrame frame;
	private ArrayList<JLabel> movieNames = new ArrayList<>();
    private ArrayList<JLabel> movieTimes = new ArrayList<>();
    private ArrayList<JLabel> movieTheaterNo = new ArrayList<>();
    private ArrayList<JLabel> moviePrices = new ArrayList<>();
    
    public ArrayList<JLabel> getMovieNames() {
		return movieNames;
	}
    public void setMovieNames(ArrayList<JLabel> movieNames) {
    	this.movieNames = movieNames;
    }
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SystemOwnerMovieInterface window = new SystemOwnerMovieInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public SystemOwnerMovieInterface() {
		frame = new JFrame();
		Image icon = Toolkit.getDefaultToolkit().getImage("movies-app.png");
		frame.setIconImage(icon);
		frame.setBounds(100, 100, 556, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 542, 379);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Movie List");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 30, 522, 37);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Movie Name");
		lblNewLabel_1.setBounds(36, 93, 101, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Movie Time");
		lblNewLabel_2.setBounds(158, 93, 101, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Movie Theater");
		lblNewLabel_3.setBounds(291, 93, 101, 13);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Movie Price");
		lblNewLabel_4.setBounds(427, 93, 85, 13);
		panel.add(lblNewLabel_4);
		
		JLabel movieNameLabel1 = new JLabel("");
		movieNameLabel1.setBounds(40, 129, 97, 13);
		panel.add(movieNameLabel1);
		
		JLabel movieNameLabel2 = new JLabel("");
		movieNameLabel2.setBounds(40, 165, 97, 13);
		panel.add(movieNameLabel2);
		
		JLabel movieNameLabel3 = new JLabel("");
		movieNameLabel3.setBounds(40, 201, 97, 13);
		panel.add(movieNameLabel3);
		
		JLabel movieNameLabel4 = new JLabel("");
		movieNameLabel4.setBounds(40, 242, 97, 13);
		panel.add(movieNameLabel4);
		
		JLabel movieNameLabel5 = new JLabel("");
		movieNameLabel5.setBounds(40, 281, 97, 13);
		panel.add(movieNameLabel5);
		
		JLabel movieTimeLabel1 = new JLabel("");
		movieTimeLabel1.setBounds(158, 129, 45, 13);
		panel.add(movieTimeLabel1);
		
		JLabel movieTimeLabel2 = new JLabel("");
		movieTimeLabel2.setBounds(158, 165, 45, 13);
		panel.add(movieTimeLabel2);
		
		JLabel movieTimeLabel3 = new JLabel("");
		movieTimeLabel3.setBounds(158, 201, 45, 13);
		panel.add(movieTimeLabel3);
		
		JLabel movieTimeLabel4 = new JLabel("");
		movieTimeLabel4.setBounds(158, 242, 45, 13);
		panel.add(movieTimeLabel4);
		
		JLabel movieTimeLabel5 = new JLabel("");
		movieTimeLabel5.setBounds(158, 281, 45, 13);
		panel.add(movieTimeLabel5);
		
		JLabel theaterNoLabel1 = new JLabel("");
		theaterNoLabel1.setBounds(291, 129, 45, 13);
		panel.add(theaterNoLabel1);
		
		JLabel theaterNoLabel2 = new JLabel("");
		theaterNoLabel2.setBounds(291, 165, 45, 13);
		panel.add(theaterNoLabel2);
		
		JLabel theaterNoLabel3 = new JLabel("");
		theaterNoLabel3.setBounds(291, 201, 45, 13);
		panel.add(theaterNoLabel3);
		
		JLabel theaterNoLabel4 = new JLabel("");
		theaterNoLabel4.setBounds(291, 242, 45, 13);
		panel.add(theaterNoLabel4);
		
		JLabel theaterNoLabel5 = new JLabel("");
		theaterNoLabel5.setBounds(291, 281, 45, 13);
		panel.add(theaterNoLabel5);
		
		JLabel priceLabel1 = new JLabel("");
		priceLabel1.setBounds(427, 129, 45, 13);
		panel.add(priceLabel1);
		
		JLabel priceLabel2 = new JLabel("");
		priceLabel2.setBounds(427, 165, 45, 13);
		panel.add(priceLabel2);
		
		JLabel priceLabel3 = new JLabel("");
		priceLabel3.setBounds(427, 201, 45, 13);
		panel.add(priceLabel3);
		
		JLabel priceLabel4 = new JLabel("");
		priceLabel4.setBounds(427, 242, 45, 13);
		panel.add(priceLabel4);
		
		JLabel priceLabel5 = new JLabel("");
		priceLabel5.setBounds(427, 281, 45, 13);
		panel.add(priceLabel5);
		
		
		JButton seeAvailabilityButton = new JButton("See Availability");
		seeAvailabilityButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				CinemaSeatsDesign cinemaSeatsDesign = new CinemaSeatsDesign(true);
				cinemaSeatsDesign.frame.setVisible(true);
				//**********************************************************************//
			}
		});
		seeAvailabilityButton.setBounds(263, 334, 129, 21);
		panel.add(seeAvailabilityButton);
		
		JButton goBackButton = new JButton("Go Back");
		goBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
	            SystemOwnerInterface systemOwnerInterface = new SystemOwnerInterface();
	            systemOwnerInterface.frame.setVisible(true);
			}
		});
		goBackButton.setBounds(406, 334, 85, 21);
		panel.add(goBackButton);
		
		JButton addMoviesButton = new JButton("Add Movie");
        addMoviesButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AddMovieInterface addMovieInterface = new AddMovieInterface();
        		addMovieInterface.frame.setVisible(true);
        		frame.dispose();
        	}
        });
        addMoviesButton.setBounds(20, 334, 101, 21);
        panel.add(addMoviesButton);
        
        JButton deleteMoviesButton = new JButton("Delete Movie");
        deleteMoviesButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		DeleteMovieInterface  deleteMovieInterface = new DeleteMovieInterface();
        		deleteMovieInterface.frame.setVisible(true);
        		frame.dispose();
        		
        		
        	}
        });
        deleteMoviesButton.setBounds(139, 334, 114, 21);
        panel.add(deleteMoviesButton);
		
		//adding movie names labels to movieNames array list
        movieNames.add(movieNameLabel1);
        movieNames.add(movieNameLabel2);
        movieNames.add(movieNameLabel3);
        movieNames.add(movieNameLabel4);
        movieNames.add(movieNameLabel5);

        //adding movie times labels to movieTimes array list
        movieTimes.add(movieTimeLabel1);
        movieTimes.add(movieTimeLabel2);
        movieTimes.add(movieTimeLabel3);
        movieTimes.add(movieTimeLabel4);
        movieTimes.add(movieTimeLabel5);

        //adding movie theater id labels to movieTheaterNo array list
        movieTheaterNo.add(theaterNoLabel1);
        movieTheaterNo.add(theaterNoLabel2);
        movieTheaterNo.add(theaterNoLabel3);
        movieTheaterNo.add(theaterNoLabel4);
        movieTheaterNo.add(theaterNoLabel5);

        //adding prices labels to moviePrices array list

        moviePrices.add(priceLabel1);
        moviePrices.add(priceLabel2);
        moviePrices.add(priceLabel3);
        moviePrices.add(priceLabel4);
        moviePrices.add(priceLabel5);
        
        
	
        
 
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlite:movie.sqlite");
            Statement statement =con.createStatement();

            String query = "SELECT * FROM movies LIMIT 0,5";

            PreparedStatement preparedStatement = con.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();


            int count = 0;
            while (resultSet.next()){

                // it gets the movies from the database and adds to the related movie attribute
                //array lists to be shown later in the movie list

                movieNames.get(count).setText(resultSet.getString(1));
                movieTimes.get(count).setText(resultSet.getString(2));
                movieTheaterNo.get(count).setText(resultSet.getString(3));
                moviePrices.get(count).setText(resultSet.getString(4));

                count++;

            }
            statement.close();
            con.close();
        }
        catch (Exception e) {

            //When the system couldn't get the movie information from the database, an error message will be displayed
            //on the screen.

            JOptionPane.showMessageDialog(frame,"The system could not" +
                            " fetch the movie at the moment. Please try again later.","Try Again",
                    JOptionPane.ERROR_MESSAGE);
        }
        
		
}
}
