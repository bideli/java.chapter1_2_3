import javax.swing.JOptionPane;
public class NumbersApp {
    public static void main(String[] args){
        String num1=JOptionPane.showInputDialog("Enter firs number:");
        double n1=Double.parseDouble(num1);
        String num2=JOptionPane.showInputDialog("Enter second number:");
        double n2=Double.parseDouble(num2);
        Result pack1=new Result(n1,n2);
        JOptionPane.showMessageDialog(null,pack1.sum()+pack1.subtraction()
                +pack1.multiplication()+pack1.distribution()+pack1.remainder());
    }
}
