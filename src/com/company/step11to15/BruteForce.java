package com.company.step11to15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BruteForce {
    /**
     * 블랙 잭
     */
    public void num2798() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //카드 개수
        int M = Integer.parseInt(st.nextToken()); //최대 합

        int[] cards = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(cards, N, M);
        System.out.println(result);
    }
    public static int search(int[] arr, int N, int M){
        int result = 0;

        for(int i = 0; i < N-2; i++){ //첫 번째 카드
            for(int j = i+1; j < N-1; j++){ //두 번째 카드 - 첫 번째 카드 다음부터
                for(int k = j+1; k < N; k++){ // 세 번째 카드 - 두 번째 카드 다음부터
                    int temp = arr[i] + arr[j] + arr[k];

                    if(M == temp){ //M과 완전히 같은 경우
                        return temp;
                    }

                    if(result < temp && temp < M){ //M과 최대한 가까운 경우
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
