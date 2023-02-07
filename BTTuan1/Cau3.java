import java.util.Scanner;
public class Cau3 {
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
        
        System.out.println("Tong 2 phan so la : " + (a/b+c/d));
        System.out.println("Hieu 2 phan so la : " + (a/b - c/d));
        System.out.println("Tich 2 phan so la : " + ((a/b)/(c/d)));
        System.out.println("Thuong 2 phan so la : " + (a/b*c/d));

    }
}

