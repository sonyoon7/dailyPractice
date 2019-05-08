import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_15953 {
    public static int[] reward17 = {500, 300, 200, 50, 30, 10};
    public static int[] people17 = {1, 2, 3, 4, 5, 6};

    public static int[] reward18 = {512, 256, 128, 64, 32};
    public static int[] people18 = {1, 2, 4, 8, 16};

    public static int TEN_THOUSAND = 10000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int testCase = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(testCase-- > 0) {
            st = new StringTokenizer(br.readLine());

            int rank17 = Integer.parseInt(st.nextToken());
            int rank18 = Integer.parseInt(st.nextToken());

            int totalRank = getRank(rank17, rank18);

            sb.append(totalRank*TEN_THOUSAND + "\n");
        }
        System.out.println(sb.toString());
    }

    public static int getRank(int rank17, int rank18) {
        int totalReward = 0;

        int r = 0;
        for (int i = 0; i < people17.length; i++) {
            r += people17[i];
            if (rank17 > 0 && rank17 <= r) {
                totalReward += reward17[i];
                break;
            }
        }

        r = 0;
        for (int i = 0; i < people18.length; i++) {
            r += people18[i];
            if (rank18 > 0 && rank18 <= r) {
                totalReward += reward18[i];
                break;
            }
        }

        return totalReward;
    }
    }
