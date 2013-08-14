package com.github.Comrod.Java.Development;

import java.util.Random;
import javax.swing.JOptionPane;

public class GuessingGame
{
  public static void main(String[] args)
  {
    int range = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));
    Random r = new Random();
    int num = r.nextInt(range) + 1;
    int guess = 0;
    JOptionPane.showMessageDialog(null, "My number could be anything from 1 to " + range);
    guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess:"));
    while (guess != num) {
      if (guess < num) {
        guess = Integer.parseInt(JOptionPane.showInputDialog("Your guess was too low.\n\nEnter a new guess:"));
      }
      if (guess > num) {
        guess = Integer.parseInt(JOptionPane.showInputDialog("Your guess was too high.\n\nEnter a new guess:"));
      }
    }
    JOptionPane.showMessageDialog(null, "You've guessed my number! It was " + num);
  }
}