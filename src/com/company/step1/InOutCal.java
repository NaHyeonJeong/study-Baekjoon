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

    public void num10430(){

    }
}
