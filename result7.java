public class result {
    //field
    private double x;
    private double y;
    private double z;
    //method
    public result(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double form1(){
        return (Math.pow(x,y)+Math.pow(y,x))/(Math.abs(z));
    }
    public double form2(){
        return Math.exp(y)-Math.log(x+y);
    }
    public double form3(){
        return Math.max(x,y)% Math.min(y,z);
    }
    }