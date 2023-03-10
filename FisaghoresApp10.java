import javax.swing.*;

public class FisaghoresApp {
    public static void main(String[] args){
        String a= JOptionPane.showInputDialog("Enter number m:");
        int m=Integer.parseInt(a);
        String b= JOptionPane.showInputDialog("Enter number n:");
        int n=Integer.parseInt(b);
        Result triangle=new Result(m,n);
        JOptionPane.showMessageDialog(null,"Side1="+triangle.side1()+
                "\nSide2="+triangle.side2()+"\nHypotenuse="+triangle.hypotenuse());
    }
}
