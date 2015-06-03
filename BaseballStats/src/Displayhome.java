/**********************
Author: Jesse Castaneda
To Do List:
*complete for now

What is working:
*user can create, edit and delete players
*user can add stats for all created players

Last Update:
*figured out how use JScrollPane to display players
***********************/



import java.util.ArrayList;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;


public class Displayhome {

	//Different windows that will be used throughout the program
	static JFrame frame;
	static Homepage homePage;
	static createPlayerWindow createPlayer;
	static EditPlayer editPlayer;
	static addStats addStats;
	static viewStats viewStats;
	
	//list that will store all players created
	static Vector<Player> playerList;
	
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
