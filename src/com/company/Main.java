package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int[] time = new int[2]; //시, 분

        st = new StringTokenizer(bf.readLine(), " ");
        for(int i = 0; i < time.length; i++){
            time[i] = Integer.parseInt(st.nextToken());
        }

        if(time[0] >= 0 && time[0] <= 23) { //hour
            if(time[1] >= 0 && time[1] <= 59) { //minutes
                if(time[1] < 45) {
                    time[1] = 60 - 45 + time[1];
                    if(time[0] == 0){
                        time[0] = 23;
                    } else {
                        time[0] -= 1;
                    }
                } else {
                    time[1] -= 45;
                }
            }
        }
        System.out.println(time[0] + " " + time[1]);
    }
}
