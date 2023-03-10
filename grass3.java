public class grass {
    //field
    private double lHome;
    private double oHome;
    private double lYard;
    private double oYard;
    //method
    public grass(double oHome,double lHome,double oYard,double lYard){
        this.oHome=oHome;
        this.lHome=lHome;
        this.oYard=oYard;
        this.lYard=lYard;
    }
    public double areaHome(){
        return lHome*oHome;
    }
    public double areaYard(){
        return lYard*oYard;
    }
    public double areaGrass(){
        return areaYard()-areaHome();
    }
    public double timeGrass(){
        return areaGrass()/2.3;
    }
    public double secondToMin(){
        return timeGrass()/60;
    }
}
