package com.company.step6to10;

import java.io.*;

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

    /**
     * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
     * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
     * N(1~1000)이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
     */
    public void num1065() throws IOException {
        //1~99까지는 사실상 모두 등차수열 > 1~99랑 100~1000까지 범위를 나눠서 진행 필요
        //1~9는 그 자체로 수열
        //10~99는 각 자리수의 차가 공차, 그 자체로 수열(31은 공차가 -2인 수열, 47은 공차가 3인 수열)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(hanSu(Integer.parseInt(br.readLine())));
    }
    public static int hanSu(int num){
        int count = 0; //한수 개수 count

        if(num < 100){ //100 미만의 경우
            return num;
        } else{ //100 이상의 수가 들어오면 99개는 깔고 감
            count = 99;
            //예외처리 - 1000은 등차 수열도 아니고 1000보다 큰 수는 입력받지 않음
            /*if(num == 1000)
                num = 999;*/
            //100이상 1000까지의 한수 개수 구하기
            for(int i = 100; i <= num; i++){
                int hun = i / 100; //백의 자리
                int ten = (i / 10) % 10; //십의 자리
                int one = i % 10;

                if((hun - ten) == (ten - one)){ //각 자리수가 수열을 이루면 한수임
                    count++;
                }
            }
        }
        return count;
    }
}
