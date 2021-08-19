package com.company.step3;

import java.io.*;

/**
 * 3단계
 * for 문
 * 시작일 : 2021년 08월 19일
 */
public class ForState {
    /**
     * 구구단
     * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
     */
    public void num2739() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(bf.readLine());

        for(int i = 1; i < 10; i++){
            bw.write(num + " * " + i + " = " + (num * i) + "\n");
        }
        bw.flush(); //남아있는 데이터 모두 출력
        bw.close(); //스트림 닫음
    }

    /**
     * 오른쪽 정렬 삼각형 별 찍기
     */
    public void num2439() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(bf.readLine());

        for(int i = 1; i <= num; i++){
            for(int j = num; j > 0; j--){
                if(j > i)
                    bw.write(" ");
                else
                    bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
