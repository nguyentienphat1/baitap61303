import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y;
        int dem=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        x= scanner.nextInt();
        System.out.println(" nhap y");
        y= scanner.nextInt();
        for (int i=x;i<=y;i++){
            if (i%3==0){
                dem++;
            }
        }
        System.out.println("so lan chia het cho 3 la:"+dem);
    }
}