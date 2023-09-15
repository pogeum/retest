import java.util.Scanner;


public class Exam2 {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("높이를 입력하세요 : ");
        int height = scan.nextInt();
        int loop = height;

        for(int i = 1;i<=height;i++){
            loop--; //4
            for(int j = loop; j>0;j--) {
                System.out.print(" ");
            }
            for(int st=1;st<=(2*i)-1;st++){
                System.out.print("*");
            }
            System.out.println("\n");
        }



    }
}


