import java.util.Scanner;

public class Cau2
{
    public static void main(String[] args)
    {
        System.out.println("Phan so co dang a/b");
        System.out.println("Nhap vao a : ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Nhap vao b : ");
        double b = new Scanner(System.in).nextDouble();

        System.out.println("Phan so co dang c/d");
        System.out.println("Nhap vao c : ");
        double c = new Scanner(System.in).nextDouble();
        System.out.println("Nhap vao d : ");
        double d = new Scanner(System.in).nextDouble();
        
        if(a/b > c/d) 
        {
            System.out.println("Phan so " + a/b + " lon hon");
        }
        else
        {
            System.out.println("Phan so " + c/d + " lon hon");
        }
    }
}