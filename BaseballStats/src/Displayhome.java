/**********************
Author: Jesse Castaneda
To Do List:
*Figure out best way to save and display names
*Fix program layout
*Lots more

What is working:

Last Update:
***********************/





import java.util.ArrayList;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;


public class Displayhome {

	static JFrame frame;
	static Homepage homePage;
	static createPlayerWindow createPlayer;
	static Vector<Player> playerList;
	static EditPlayer editPlayer;
	static addStats addStats;
	static viewStats viewStats;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		homePage=new Homepage();
		createPlayer=new createPlayerWindow();
		playerList=new Vector<Player>();
		editPlayer=new EditPlayer();
		addStats=new addStats();
		viewStats=new viewStats();
		
		frame=new JFrame("Baseball Stat Tracker");
		
		frame.add(homePage);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
		frame.setSize(300,300);
		frame.setVisible(true);
	}

}
