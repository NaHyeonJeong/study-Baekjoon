package com.company.step6to10;

import java.io.*;
import java.util.Scanner;

public class StringEx {
    /**
     * 아스키코드
     */
    public void num11654(){
        Scanner input = new Scanner(System.in);
        int ch = input.next().charAt(0); //string -> char -> int
        System.out.print(ch);

        /*int a = System.in.read();
        System.out.print(a);*/
    }

    /**
     * 숫자의 합
     */
    public void num11720() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        int sum = 0;

        //getBytes() : 문자열을 byte 배열로 변환(utf-16 인코딩으로 변경되는 값을 따름 == ((value - '0' 또는 48))
        // > readLine()으로 읽어들인 문자를 byte[]로 변환하여 반환됨 - foreach 구문으로 문자열 하나하나 읽어들일 수 있음
        for(byte val : br.readLine().getBytes()){
            sum+=(val - '0');
        }

        bw.write(sum+"");
        bw.flush();
        bw.close();
    }

    /**
     * 문자에서 알파벳 찾기
     */
    public void num10809() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] count = new int[26];
        for(int i = 0; i < count.length; i++){
            count[i] = -1;
        }

        String word = br.readLine();
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            //동일 문자가 포함된 경우 처음 나타난 위치 출력
            if(count[ch - 'a'] == -1){ //추적된 적이 없는 경우에만 인덱스 값 입력하고 추적된 적이 있다면 기존 값 유지
                count[ch - 'a'] = i;
            }
        }

        for(int val: count){
            bw.write(val+" ");
        }
        bw.flush();
        bw.close();
    }

    /**
     * 문자열 반복하기
     */
    public void num2675() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        for(int i = 0; i < tc; i++){
            String[] str = br.readLine().split(" "); //공백 기준 분리
            int R = Integer.parseInt(str[0]); //반복 횟수
            String S = str[1];

            for(int j = 0; j < S.length(); j++){ //문자열을 문자로 쪼개기
                for(int k = 0; k < R; k++){ //입력받은 횟수 만큼 반복
                    bw.write(S.charAt(j)+"");
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
