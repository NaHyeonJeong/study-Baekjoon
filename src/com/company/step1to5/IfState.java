package com.company.step1to5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 2단계
 * if문
 * 시작일 : 2021년 08월 19일
 */
public class IfState {

    /**
     * 제 N 사분면
     * @throws IOException
     */
    public void num14681() throws IOException {
        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(bf1.readLine());
        int y = Integer.parseInt(bf1.readLine());

        if(x > 0) {
            if(y > 0) { //1
                System.out.println("1");
            } else { //4
                System.out.println("4");
            }
        } else {
            if(y > 0) { //2
                System.out.println("2");
            } else { //3
                System.out.println("3");
            }
        }
    }

    /**
     * [입력]
     * 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
     * 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
     * [출력]
     * 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간(45분 앞선 시간)을 출력한다. (입력과 같은 형태로 출력하면 된다.)
     */
    public void num2884() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int[] time = new int[2]; //시, 분

        st = new StringTokenizer(bf.readLine(), " ");
        for(int i = 0; i < time.length; i++){
            time[i] = Integer.parseInt(st.nextToken());
        }

        //TODO 채점 시간이 오래 걸림... 시간을 줄일 수 있는 방법은?
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
