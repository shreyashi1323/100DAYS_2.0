package oops;
class Demo{
    private int a ;
    private int b;
    public Demo(int a , int b){
        this.a=a;
        this.b=b;
    }
    void disp(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class constructor {

    public static void main(String[] args) {
        Demo d = new Demo();
        Demo d2= new Demo(10,20);
    }
}
