import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Stock {
    public static void main(String[] args){
        new Stock().solve(System.in, System.out);
    }
    public void solve(InputStream in, PrintStream out) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();  //3

        for(int test_case=0; test_case<t; test_case++){ //t번 반복 할 것임
            int n=sc.nextInt(); // 일수 알 수 있임 예) 3일...
            int[] stock = new int[n];
            long gain =0; //최대 수익
            int max =0; //주식 예측 가격 비교로 사용 예정
            for(int i=0; i<n ; i++){
                stock[i]=sc.nextInt();  //3일 동안 예측되는 주식 가격을 stoct 배열에 저장 하기

            }
            for(int i= n-1; i>-1; i--){  //3일 이면, 2,1,0 거꾸로 돔 배열 인덱스 사용 위해
                if(stock[i]>max){ //끝날의 주식 예측 가격이 max 보다 크다면
                    max=stock[i];   //max 는 가장 수익 올릴 수 있는 날....
                }else{
                    gain+=(max-stock[i]);
                }
            }
            System.out.println(gain);
        }
    }
}
