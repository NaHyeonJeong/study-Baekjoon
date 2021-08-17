package com.company.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 1단계
 * 입출력과 사칙연산
 * 시작일 : 2021년08월15일
 */
public class InOutCal {

    public void num2557(){
        System.out.println("Hello World!");
    }

    public void num10718(){
        System.out.println("강한친구 대한육군 \n강한친구 대한육군");
    }

    public void num10171(){
        System.out.println("\\    /\\\n" +
                " )  ( ')\n" +
                "(  /  )\n" +
                " \\(__)|");
    }

    public void num10172(){
        System.out.println("|\\_/|\n" +
                "|q p|   /}\n" +
                "( 0 )\"\"\"\\\n" +
                "|\"^\"`    |\n" +
                "||_/=\\\\__|");
    }

    public void num1000(){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println(sum);

        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int sum = 0;
        int[] array = new int[2];
        st = new StringTokenizer(bufferedReader.readLine(), " ");
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(st.nextToken());
            sum += array[i];
        }
        System.out.println(sum);*/
    }

    public void num1001(){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sub = num1 - num2;

        System.out.println(sub);
    }

    public void num10998() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int sum = 0;
        int[] array = new int[2];
        st = new StringTokenizer(bufferedReader.readLine(), " ");
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(st.nextToken());
            sum += array[i];
        }
        System.out.println(sum);
    }

    public void num10430() throws IOException {
        //첫째 줄에 (A+B)%C
        //둘째 줄에 ((A%C) + (B%C))%C
        //셋째 줄에 (A×B)%C
        //넷째 줄에 ((A%C) × (B%C))%C를 출력
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int[] array = new int[3];
        int[] result = {0, 0, 0, 0};
        //double first = 0.0, second = 0.0, third = 0.0, fourth = 0.0;

        st = new StringTokenizer(bf.readLine(), " ");
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        result[0] = (array[0] + array[1]) % array[2];
        result[1] = ((array[0] % array[2]) + (array[1] % array[2])) % array[2];
        result[2] = (array[0] * array[1]) % array[2];
        result[3] = ((array[0] % array[2]) * (array[1] % array[2])) % array[2];

        for(int rs : result){
            System.out.println(rs);
        }
    }

    public void num2588(){

    }
}
