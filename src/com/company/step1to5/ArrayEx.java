package com.company.step1to5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArrayEx {

    public void num1546() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double[] score = new double[Integer.parseInt(br.readLine())]; //과목 개수
        double newScore = 0.0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); //점수
        for(int i = 0; i < score.length; i++){
            score[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(score); //가장 마지막 인덱스에 최대값

        for(int j = 0; j < score.length; j++){
            newScore += ((score[j] / score[score.length - 1]) * 100);
        }
        bw.write(newScore / score.length + "");
        bw.flush();
        bw.close();

        /* Array 사용하지 않고 최대값 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //입력 개수
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); //기존 점수
        int max = -1; //최대값
        double sum = 0.0; //점수 합계

        for(int i = 0; i < N; i++){
            int val = Integer.parseInt(st.nextToken());
            if(val > max){ //최대값 구하기
                max = val;
            }
            sum += val;
        }
        bw.write(((sum / max) * 100.0) / N + "");
        bw.flush();
        bw.close();*/
    }

    public void num4344() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine()); //케이스 수
        int[] score; //학생 들 점수
        double average = 0.0; //반 평균

        int i = 0;
        while(i < testCase){//케이스 수 만큼 입력 가능
            st = new StringTokenizer(br.readLine(), " "); //학생 수 & 점수 입력

            int studentNum = Integer.parseInt(st.nextToken()); //학생 수
            score = new int[studentNum];

            //성적 입력
            int sum = 0;
            for(int j = 0; j < studentNum; j++){
                int val = Integer.parseInt(st.nextToken()); //학생 별 점수
                score[j] = val;
                sum += val; //학생들 성적 총 합계
            }
            average = sum / studentNum; //반 평균

            int count = 0;
            for(int k = 0; k < studentNum; k++){ //평균을 넘는 학생들 수
                if(score[k] > average){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count / (double)studentNum) * 100); //반 평균이 넘는 학생들의 비율
            i++;
        }
    }

}
