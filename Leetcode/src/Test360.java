import java.util.Arrays;
import java.util.Scanner;

public class Test360 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] score = new int[N];
        for(int i=0;i<N;i++)
        {
            score[i] = in.nextInt();
        }
        Arrays.sort(score);
        int signal = 2 * M - N;
        if (signal > N) {
            System.out.println(0);
        }
        int len = N - signal;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len / 2; i++) {
            int newMax = score[i] + score[len - i -1];
            if (newMax > max) {
                max = newMax;
            }
        }
        System.out.println(max);
    }
}
