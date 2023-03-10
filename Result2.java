public class Result {
    //fields
     private double n1;
     private double n2;
     //methods
    public Result(double n1,double n2){
        this.n1=n1;
        this.n2=n2;
    }
    public String sum(){
        return "\n"+n1+"+"+n2+"="+(n1+n2);
    }
    public String subtraction(){
        return "\n"+n1+"-"+n2+"="+(n1-n2);
    }
    public String multiplication(){
        return "\n"+n1+"*"+n2+"="+(n1*n2);
    }
    public String distribution(){
        return "\n"+n1+"/"+n2+"="+(n1/n2);
    }
    public String remainder(){
        return "\n"+n1+"%"+n2+"="+(n1%n2);
    }
}
