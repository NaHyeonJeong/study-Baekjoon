package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int copyN = n;
        int ten = n / 10; //10의 자리
        int one = n % 10; //1의 자리
        int count = 0;

        while(true){

            if(n == copyN){
                break;
            }
        }
    }
}
