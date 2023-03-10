import javax.swing.*;

public class GameApp {
    public static void main(String[] args){
        String input= JOptionPane.showInputDialog("Let's play~\n Enter a number between 1 to 10 :");
        int n=Integer.parseInt(input);
        double r=Math.floor(Math.random()*10);
        double num=(r-n+1)*n;
        if (num>0) {
            JOptionPane.showMessageDialog(null,"Great!!!\n" +
                    "The random number of the computer is " +r+"\nyou can move forward:)");
        }
        else {
            JOptionPane.showMessageDialog(null,"Ops!!!\n" +
                    "The random number of the computer is " +r+"\nyou have to move back:(");
        }
        System.out.println(num);
    }
}
