import javax.swing.*;

public class BuyHouseApp {
    public static void main(String[] args){
        String initial= JOptionPane.showInputDialog("Enter Initial House Cost:");
        double i=Double.parseDouble(initial);
        String annual= JOptionPane.showInputDialog("Enter Annual Fuel Cost:");
        double a=Double.parseDouble(annual);
        String tax = JOptionPane.showInputDialog("Enter Tax:");
        double t=Double.parseDouble(tax);
        House my=new House(i,a,t);
        JOptionPane.showMessageDialog(null,"The total cost of house in 5 years is:  "+
                my.totalCost()+"$");
    }
}
