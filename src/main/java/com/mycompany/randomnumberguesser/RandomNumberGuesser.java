/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnumberguesser;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Student
 */
public class RandomNumberGuesser {

    public static void main(String[] args) {
        Random obj = new Random();//instance of the Random class
        int FlorasSecret = obj.nextInt(100)+ 1;
        int userGuess = 0;
       int Attempts= 0;//TO TRACK ATTEMPTS!
       int maxAttempts =3;
        while (userGuess != FlorasSecret && Attempts < maxAttempts ){
        userGuess = Integer.parseInt(JOptionPane.showInputDialog("hey guess a number between 1 and 100"));
        Attempts++;
        if (userGuess > FlorasSecret){
        JOptionPane.showMessageDialog(null, "your guess is too high");
        }else  if (userGuess < FlorasSecret){
        JOptionPane.showMessageDialog(null, "your guess is too low");
        }else{
            JOptionPane.showMessageDialog(null, "ayeyeyeye ping ping!! you guessed correctly in" + Attempts);
        }
        }
        
        JOptionPane.showMessageDialog(null, "you've reached max attempts,pls try again later \n the secret number was" + FlorasSecret);
    }
}
