import javax.swing.*;

public class MathApp {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Enter first number:");
        double x = Double.parseDouble(num1);
        String num2 = JOptionPane.showInputDialog("Enter second number:");
        double y = Double.parseDouble(num2);
        String num3 = JOptionPane.showInputDialog("Enter third number:");
        double z = Double.parseDouble(num3);
        result pack1 = new result(x, y, z);
        JOptionPane.showMessageDialog(null, Math.round(pack1.form1())+"\n"+Math.floor(pack1.form2())
        +"\n"+Math.ceil(pack1.form3()));
    }
}