import java.util.Scanner;

public class BaekJoon_1094 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int original_bar= 64;
        int bar = sc.nextInt();
        int sum_bar=0;
        int div_bar=original_bar;
        while (div_bar>bar){
            System.out.println(div_bar);
         div_bar= div_bar/2;
        }

    }
}
