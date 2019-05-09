import java.util.Scanner;

public class BaekJoon_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in= Integer.parseInt(sc.next());
        for (int i=0; i<in;i++ ){
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
