package com.company.step6to10;

import java.io.*;

public class BasicMath {

    /**
     * 아파트 층, 호수별로 필요한 인원수 구하기
     */
    public void num2775() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] APT = new int[15][15]; //아파트는 14층 14호까지 제한됨
        StringBuilder sb = new StringBuilder();

        //아파트 기본 틀 만들기
        for(int i = 0; i < 15; i++){
            APT[i][1] = 1; //i층 1호
            APT[0][i] = i; //0층 i호
        }

        for(int i = 1; i < 15; i++){ //1층 부터 14층
            for(int j = 2; j < 15; j++){ //2호 부터 14호
                APT[i][j] = APT[i][j-1] + APT[i-1][j]; //각 호수의 필요 인원 수
            }
        }

        int P = Integer.parseInt(br.readLine()); //호수 검색 개수
        for(int i = 0; i < P; i++){
            int k = Integer.parseInt(br.readLine()); //층
            int n = Integer.parseInt(br.readLine()); //호
            sb.append(APT[k][n]).append('\n');
        }

        bw.write(sb+"");
        bw.flush();
        bw.close();
    }

    /**
     * 손님이 들어갈 방의 호수는?
     */
    public void num10250() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        //호수는 최소 100의 자리에서 최대 1000의 자리까지임 (100또는 1000 x 층수)
        for(int i = 0; i < T; i++){
            String[] str = br.readLine().split(" ");
            int H = Integer.parseInt(str[0]); //층수
            int N = Integer.parseInt(str[2]); //몇 번째 손님
            // 호수 구하기
            if(N % H == 0){
                //6층짜리 호텔에 6번째로 온 손님
                sb.append((H * 100) + (N / H)).append('\n');
            } else{
                //6층짜리 호텔에 10번째로 온 손님
                sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
            }
        }

        bw.write(sb+"");
        bw.flush();
        bw.close();
    }
}
