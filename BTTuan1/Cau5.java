import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args)
    {
        System.out.println("Nhap ho ten : " );
        String hoten = new Scanner(System.in).nextLine();
        
        System.out.println("Nhap diem mon toan : " );
        double toan = new Scanner(System.in).nextDouble();

        System.out.println("Nhap diem mon van : " );
        double van = new Scanner(System.in).nextDouble();

        System.out.println("Diem trung binh : " + ((toan+van)/2) );

    }
}
