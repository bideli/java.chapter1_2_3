import javax.swing.*;

public class TimeApp {
    public static void main(String[] args){
        String xHome= JOptionPane.showInputDialog("Enter home ordinate:");
        double oHome=Double.parseDouble(xHome);
        String yHome= JOptionPane.showInputDialog("Enter home length:");
        double lHome=Double.parseDouble(yHome);
        String xYard= JOptionPane.showInputDialog("Enter yard ordinate:");
        double oYard=Double.parseDouble(xYard);
        String yYard= JOptionPane.showInputDialog("Enter yard length:");
        double lYard=Double.parseDouble(yYard);
        grass home1=new grass(oHome,lHome,oYard,lYard);
        JOptionPane.showMessageDialog(null,"It takes "+home1.secondToMin()+" minutes to " +
                "mow the lawn.");
    }
}
