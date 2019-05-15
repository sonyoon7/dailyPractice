//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class BaekJoon_16236 {
//    //아기상어 크기
//    int babyshark_size = 2;
//    //아기상어 위치
//    int bs_i = 0;
//    int bs_j = 0;
//    //초 세기
//    int count = 0;
//    int sum = 0;
//    //물고기 위치
//    int fish_i = 0;
//    int fish_j = 0;
//    int[][] array;
//
//    BaekJoon_16236() {
//    }
//
//    BaekJoon_16236(int n) {
//        array = new int[n][n];
//    }
//
//
//    //      아기상어 위치 구하기
//    public void getBabySharkLocation() {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] == 9) {
//                    bs_i = i;
//                    bs_j = j;
//                    System.out.println(i + ", " + j);
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        BaekJoon_16236 init = new BaekJoon_16236(n);
//
////      초기화 해주기
//        for (int i = 0; i < init.array.length; i++) {
//            for (int j = 0; j < init.array[i].length; j++) {
//                init.array[i][j] = Integer.parseInt(sc.next());
//            }
//        }
//
////        init.getBabySharkLocation();
//
//        //    아기상어 본인보다 크기가 작은 물고기가 어딨는지 먼저 구하자
//        for (int i = 0; i < init.array.length; i++) {
//            for (int j = 0; j < init.array[i].length; j++) {
////                if (init.array[i][j] < init.babyshark_size&&init.array[i][j]!=0) {//먹을만한 물고기가 있다면
////                    if(init.fish_i==i&& init.fish_j>j){//같은 높이에 있고 더 왼쪽에 있다면 바꿔치기
////                       init.fish_i=i;
////                       init.fish_j=j;
////                        System.out.println("1........."+init.fish_i+", "+init.fish_j);
////                    }else if(init.fish_i>i){//더 상단에 위치 하고 있다면 바꿔치기
////                        init.fish_i=i;
////                        init.fish_j=j;
////                        System.out.println("2........."+init.fish_i+", "+init.fish_j);
////                    }
////                }
//                if (init.array[i][j] < init.babyshark_size && init.array[i][j] != 0) {//아기상아보다 작은 물고기(0을 제외한)
//                    if (init.fish_i == 0 && init.fish_j == 0) {// 처음에 초기화 개념...
//                        init.fish_i = i;
//                        init.fish_j = j;
//                    }
//                    int tempCount = Math.abs(init.fish_i - init.bs_i) + Math.abs(init.fish_j - init.bs_j);
//                    if (init.count == 0 || tempCount < init.count) {//거리가 더 짧다면
//                        init.count = tempCount;
//                    } else if (tempCount == init.count) {//거리가 같다면?
//                        if (init.fish_i == i && init.fish_j > j) {//같은 높이에 있고 더 왼쪽에 있다면 바꿔치기
//                            init.fish_i = i;
//                            init.fish_j = j;
//                            System.out.println("1........." + init.fish_i + ", " + init.fish_j);
//                        } else if (init.fish_i > i) {//더 상단에 위치 하고 있다면 바꿔치기
//                            init.fish_i = i;
//                            init.fish_j = j;
//                            System.out.println("2........." + init.fish_i + ", " + init.fish_j);
//                        }
//                    }
//
//                }
//            }
//        }
//
//        //거리 구하기
//
//
//        for (int i = 0; i < init.array.length; i++) {
//            for (int j = 0; j < init.array[i].length; j++) {
//                System.out.print(init.array[i][j]);
//            }
//            System.out.println("");
//        }
//
//    }//end of main
//
//
//    //      (0,0) (0,1) (0,2)
//    //      (1,0) (1,1) (1,2)
//    //      (2,0) (2,1) (2,2)
//
////            (2,1)에 아기 상어가 있음...
////            (0,2)에 크기가 1인 물고기가 있음 (2,1)에서 (0,2)로 어떻게 도달할 수 있을까?
////              3초 걸리는 이유는 1차원 배열끼리 빼소 2-0 , 2차원 배열 끼리 빼면 2-1 그리고 항상 정수 이도록.. 하면 구해 질 수 있음
////
////    아기상어 본인보다 크기가 작은 물고기가 어딨는지 먼저 구하자
//    //먹을 수 있는 물고기가 1마리보다 많다면, 거리가 가장 가까운 물고기를 먹으러 간다.
//    //거리가 가까운 물고기가 많다면, 가장 위에 있는 물고기, 그러한 물고기가 여러마리라면, 가장 왼쪽에 있는 물고기를 먹는다.
//
////    그 물고기의 위치 좌표를 빼서 count (초를 측정함)해놓자
//
////  또 마지막으로 잡아먹은 물고기 위치에서 본인 보다 크기가 작은 물고기의 위치를 구해라
//}
