package com.company.step1to5;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 4단계
 * while 문
 * 시작일 : 2021년 08월 23일
 */
public class WhileState {

    public void num10951() throws IOException {
        /**
         * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. (EOF)
         *
         * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
         * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String input;

        while((input = br.readLine()) != null){
            st = new StringTokenizer(input, " ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int sum = first + second;
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }

    public void num1110() throws IOException {
        /**
         * 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
         * 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
         *
         * N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
         */
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
