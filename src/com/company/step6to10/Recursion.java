package com.company.step6to10;

import java.io.*;

public class Recursion {
    /**
     * 피보나치 수 구하기 - 재귀
     * 배열에 비해 시간 오래걸림
     */
    public void num10870_1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        bw.write(recursion(num)+"\n");
        bw.flush();
        bw.close();
    }
    public static int recursion(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }

        return recursion(num-1) + recursion(num-2);
    }

    /**
     * 피보나치 수 구하기 - 배열
     * @throws IOException
     */
    public void num10870_2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] fib = new int[num+1];

        for(int i = 0; i < fib.length; i++){
            if(i == 0)
                fib[0] = 0;
            else if (i == 1)
                fib[1] = 1;
            else
                fib[i] = fib[i-1] + fib[i-2];
        }

        System.out.println(fib[num]);
    }
}
