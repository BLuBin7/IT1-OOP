import java.util.Scanner;

public class Cau1
{
    public static void main(String[] args)
    {
        System.out.println("Phan so co dang a/b");
        System.out.println("Nhap vao a : ");
        double a = new Scanner(System.in).nextDouble();
        
        // làm tròn lên : Math.round(a);
        // làm tròn xuống : Math.floor(b);
        System.out.println("Nhap vao b : ");
        double b = new Scanner(System.in).nextDouble();
        int max = 0;
        for(int i =0 ;i<10; i++)
        {
            if(a%i == 0&b%i == 0)
            {
                if(i>max)
                {
                    max = i;
                }
            }
        }
        System.out.println("Hai so deu có uoc chung lon nhat la : " + max);
        System.out.println("So a sau khi rut gon : " + a/max);
        System.out.println("So b sau khi rut gon : " + b/max);

        System.out.println("Ket qua cua phan so la : " +a/b );
        
        
    }
}