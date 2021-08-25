package com.company.step6to10;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class funcEx {
    /**
     * @param a 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
     * @return a에 포함되어 있는 정수 n개의 합
     */
    public long sum(int[] a){
        int sumVal = 0;

        for(int i = 0; i < a.length; i++){
            sumVal += a[i];
        }
        return sumVal;
    }

    public void num4673() throws IOException {
        /**
         * 셀프 넘버
         * in : X
         * out : 10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다.
         */
        boolean[] check = new boolean[10001];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i < 10001; i++){
            int n = selfNum(i); //셀프 넘버
            if(n < 10001){
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            if (!check[i]) { //셀프 넘버 아닌거 = 생성자가 있는거
                sb.append(i).append('\n');
            }
        }
        bw.write(sb + "");
        bw.flush();
        bw.close();
    }
    public static int selfNum(int num){ //셀프 넘버 찾기
        int sum = num; //num이 1이면 그대로 1을 더함(1+1)

        while(num != 0){ //들어 온 숫자를 쪼개기
            sum = sum + (num % 10); //뒤에서 부터 하나씩 쪼갬
            num = num / 10; //쪼갠거 빼고 나머지
        }
        return sum;
    }
}
