package fr.makan.app;
import fr.makan.app.*; 

public class Main{
    public static void main(String[] args){
        MyService service = new MyService();
        double x=6;
        double y=6;
        result = service.cal(x,y);
        System.out.println("Hello World !");
        System.out.println(System.format("sum of %s and %s is %s", x, y, result));
    }
}