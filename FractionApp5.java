import javax.swing.*;

public class FractionApp {
    public static void main(String[] args){
        String n1= JOptionPane.showInputDialog("Enter numerator of the first fraction:");
        double num1=Double.parseDouble(n1);
        String d1=JOptionPane.showInputDialog("Enter denominator of the first fraction:");
        double denom1=Double.parseDouble(d1);
        String n2= JOptionPane.showInputDialog("Enter numerator of the second fraction:");
        double num2=Double.parseDouble(n2);
        String d2=JOptionPane.showInputDialog("Enter denominator of the second fraction:");
        double denom2=Double.parseDouble(d2);
        double result=(num1*num2)/(denom1*denom2);
        JOptionPane.showMessageDialog(null,"The product of these two fraction is "+result);
    }
}