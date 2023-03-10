/*
   *Author: F Bideli
   * change the seconds into the hours,minutes and seconds
 */
import javax.swing.*;
public class MainApp {
    public static void main(String[] args){
           String word=JOptionPane.showInputDialog("Enter number of seconds:");
           int seconds=Integer.parseInt(word);
           int hour=seconds/3600;
           int min=(seconds%3600)/60;
           int sec=(seconds%3600)%60;
           JOptionPane.showMessageDialog(null,word+" seconds is:\n"+hour+
                   "hours\n and "+min+"minutes\n and "+sec+"seconds.");
    } 
}
