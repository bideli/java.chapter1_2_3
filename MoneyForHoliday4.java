public class MoneyForHoliday {
    //field
    private double distance;
    private double oilPrice;
    private double oilNeedCar;
    //method
    public MoneyForHoliday(double distance,double oilPrice,double oilNeedCar){
        this.distance=distance;
        this.oilPrice=oilPrice;
        this.oilNeedCar=oilNeedCar;
    }
    //found how much money need
    public double money(){
        return distance*oilNeedCar*oilPrice;
    }
}
