public class Result {
    //field
    private int m;
    private int n;
    //method
    public Result(int m,int n){
        this.m=m;
        this.n=n;
    }
    public double side1(){
        return Math.abs(Math.pow(m,2)-Math.pow(n,2));
    }
    public double side2(){
        return 2*m*n;
    }
    public double hypotenuse(){
        return Math.pow(m,2)+Math.pow(n,2);
    }
}
