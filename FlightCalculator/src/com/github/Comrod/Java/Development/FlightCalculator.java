package com.github.Comrod.Java.Development;

import javax.swing.JOptionPane;

public class FlightCalculator
{

	public static void main(String[] args)
	{
			float flighttime;
			int planemph = 653;
			
			String departloc = JOptionPane.showInputDialog("Enter Departure Location");
			String arrivalloc = JOptionPane.showInputDialog("Enter Arrival Location");
			int distance = Integer.parseInt(JOptionPane.showInputDialog("Enter the distance between your two locations in miles"));
			
			System.out.println("Distance Entered: " + distance);
			
			flighttime = (distance / planemph);		
			
			System.out.println("Flight Time " + flighttime);
			
			JOptionPane.showMessageDialog(null, "Your flight from " + departloc + " to " + arrivalloc + " will take " + flighttime + " hours");
	}

}
