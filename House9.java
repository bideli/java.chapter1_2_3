public class House {
    //field
    private double i;
    private double a;
    private double t;
    //method
    public House(double i,double a,double t){
        this.a=a;
        this.i=i;
        this.t=t;
    }
    public double annualFuelCost (){
        return a*5;
    }
    public double tax (){
        return i*t*5;
    }
    public double totalCost (){
        return i+annualFuelCost()+tax();
    }
}
