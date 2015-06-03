import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;



public class Homepage extends JPanel {
	private JButton createPlayer;
	private JButton editPlayer;
	private JButton addStats;
	private JButton viewStats;
	private JButton Quit;
	
	public Homepage()
	{
		createPlayer=new JButton("Create Player");
		createPlayer.addActionListener(new ButtonListener());
		editPlayer=new JButton("Edit/Delete Player");
		editPlayer.addActionListener(new ButtonListener());
		addStats=new JButton("Add Player Stats");
		addStats.addActionListener(new ButtonListener());
		viewStats=new JButton("View Player Stats");
		viewStats.addActionListener(new ButtonListener());
		Quit=new JButton("Quit");
		Quit.addActionListener(new ButtonListener());
		
		
		setLayout(new GridLayout(5,1));
		add(createPlayer);
		add(editPlayer);
		add(addStats);
		add(viewStats);
		add(Quit);
	}
	
	public class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Object source=event.getSource();
			if(source==createPlayer)
			{
				Displayhome.frame.remove(Displayhome.homePage);
				Displayhome.frame.add(Displayhome.createPlayer);
				Displayhome.frame.repaint();
				Displayhome.frame.validate();
			}
			if(source==editPlayer)
			{
				Displayhome.editPlayer.reset();
				Displayhome.frame.remove(Displayhome.homePage);
				Displayhome.frame.add(Displayhome.editPlayer);
				Displayhome.frame.repaint();
				Displayhome.frame.validate();
			}
			if(source==addStats)
			{
				Displayhome.addStats.reset();
				Displayhome.frame.remove(Displayhome.homePage);
				Displayhome.frame.add(Displayhome.addStats);
				Displayhome.frame.repaint();
				Displayhome.frame.validate();
			}
			if(source==viewStats)
			{
				Displayhome.viewStats.reset();
				Displayhome.frame.remove(Displayhome.homePage);
				Displayhome.frame.add(Displayhome.viewStats);
				Displayhome.frame.repaint();
				Displayhome.frame.validate();
			}
			if(source==Quit)
			{
				System.exit(0);
			}
		}
	}

}
