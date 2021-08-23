package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int copyN = n; //변수 복사
        int count = 0;

        while(true){
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            count++;
            if(n == copyN){
                break;
            }
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}
