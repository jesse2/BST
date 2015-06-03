import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;


public class EditPlayer extends JPanel {

	private JButton edit;
	private JButton back;
	private JButton delete;
	private JList list;
	private JScrollPane listScroller;
	
	public EditPlayer()
	{
		list=new JList(Displayhome.playerList);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setSelectedIndex(-1);
		list.setLayoutOrientation(JList.VERTICAL);
		list.setVisibleRowCount(3);
		listScroller=new JScrollPane(list);
		
		edit=new JButton("Edit Player Name");
		edit.addActionListener(new ButtonListener());
		delete=new JButton("Delete Player");
		delete.addActionListener(new ButtonListener());;
		back=new JButton("Go Back");
		back.addActionListener(new ButtonListener());
		setLayout(new GridLayout(4,1));
		

		add(listScroller);
		add(edit);
		add(delete);
		add(back);
	}
	
	public void reset()
	{
		list.updateUI();
	}
	
	public class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Object source=event.getSource();
			if(source==back)
			{
				Displayhome.frame.remove(Displayhome.editPlayer);
				Displayhome.frame.add(Displayhome.homePage);
				Displayhome.frame.repaint();
				Displayhome.frame.validate();
			}
			try{
			if(source==delete)
			{
				int index=list.getSelectedIndex();
				
				if(list!=null)
				{
					if(index<0)
						JOptionPane.showMessageDialog(Displayhome.frame, "Please choose or add a player");
					else
						Displayhome.playerList.remove(index);
						updateUI();
				}
				else
					JOptionPane.showMessageDialog(Displayhome.frame, "Please choose or add a player");
			}
			if(source==edit)
			{
				int index=list.getSelectedIndex();
				
				if(list!=null)
				{
					if(index<0)
						JOptionPane.showMessageDialog(Displayhome.frame, "Please choose or add a player");
					else
						{
							String name=Displayhome.playerList.get(index).getName();
							Displayhome.createPlayer.updatename(name,index);
							
							
							Displayhome.frame.remove(Displayhome.editPlayer);
							Displayhome.frame.add(Displayhome.createPlayer);
							Displayhome.frame.repaint();
							Displayhome.frame.validate();					
						}
				}
				else
					JOptionPane.showMessageDialog(Displayhome.frame, "Please choose or add a player");
				}
			}
			catch(ArrayIndexOutOfBoundsException e){
				JOptionPane.showMessageDialog(Displayhome.frame, "It Looks like the list is Empty");
			}
		}
	}
}
