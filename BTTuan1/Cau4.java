import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args)
    {
        System.out.println("Nhap vao mot ngay : ");
        int a = new Scanner(System.in).nextInt();
        if( a >=1 &&a <=31)
        {
            if(a == 31)
            {
                System.out.println("Ngay tiep theo la : " + 1);
            }
            else
            {
                System.out.println("Ngay tiep theo la : " +(a+1));
            }
        }
        else
        {
            System.out.println("So ngay khong hop le");
        }
    }
}
