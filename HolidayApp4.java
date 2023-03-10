import javax.swing.*;

public class HolidayApp {
    public static void main(String[] args){
        String d= JOptionPane.showInputDialog("Enter distance in kilometers:");
        double distance=Double.parseDouble(d);
        String p=JOptionPane.showInputDialog("Enter price of one liter of oil:");
        double oilPrice=Double.parseDouble(p);
        String n=JOptionPane.showInputDialog("Enter the fuel consumption of your car in one kilometers:");
        double oilNeedCar=Double.parseDouble(n);
        MoneyForHoliday mashhad=new MoneyForHoliday(distance,oilPrice,oilNeedCar);
        JOptionPane.showMessageDialog(null,"This trip costs "+mashhad.money()+" tomans for oil.");
    }
}
