package main;

import javax.swing.*;
import java.awt.event.*;

public class txt extends JFrame implements ActionListener
{

	private JPanel panel;
	static JButton nButton, sButton, eButton, wButton;
    static int nClick=0, sClick=0, eClick=0, wClick=0;
    static JLabel label1;
    		 
    public txt()
    {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setTitle("GameTest");
    	setResizable(true);
    	setSize(230, 370);
    	setLocationRelativeTo(null);
    				
    	panel = new JPanel();
    	panel.setSize(230,370);
    	panel.setLayout(null);
    				
    	label1 = new JLabel();
    	label1.setText("You are in the back of a bus which is going 56 mph. You see a mysterious man to the west and a restroom to the south. To the north is the front of the bus with no driver.");
    	label1.setSize(230,250);
    	label1.setLocation(0,0);
    	
    	nButton = new JButton("North");
    	nButton.setSize(50,50);
    	nButton.setLocation(170,200);
    				
    	sButton = new JButton("South");
    	sButton.setSize(50,50);
    	sButton.setLocation(170,120);
    				
    	eButton = new JButton("East");
    	eButton.setSize(50,50);
    	eButton.setLocation(170, 65);
    				
    	wButton = new JButton("West");
    	wButton.setSize(50,50);
    	wButton.setLocation(115,65);
    				
    	panel.add(wButton);
    	panel.add(nButton);
    	panel.add(eButton);
    	panel.add(sButton);
    	panel.add(label1);
    	add(panel);
    				
    	wButton.addActionListener(this);
    	nButton.addActionListener(this);
    	eButton.addActionListener(this);
    	sButton.addActionListener(this);
    }
    		 
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource() == wButton)
    	{
    		label1.setText("You go to the front of the bus and see no driver. The bus suddenly combusts sending you flying into the air. You land on the ground next to a tree. You see a shack to the north and a forest on all other sides.");
    	}
    	else if(e.getSource() == nButton)
    	{
    		label1.setText("You go to the front of the bus and see no driver. The bus suddenly combusts sending you flying into the air. You land on the ground next to a tree. You see a shack to the north and a forest on all other sides.");
    	}
    	else if(e.getSource() == eButton)
    	{
    		label1.setText("You go to the front of the bus and see no driver. The bus suddenly combusts sending you flying into the air. You land on the ground next to a tree. You see a shack to the north and a forest on all other sides.");
    	}
    	else if(e.getSource() == sButton)
   		{
    		label1.setText("You go to the front of the bus and see no driver. The bus suddenly combusts sending you flying into the air. You land on the ground next to a tree. You see a shack to the north and a forest on all other sides.");
    	}
     }
}