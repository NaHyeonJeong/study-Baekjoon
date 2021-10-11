package com.company.step6to10;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BasicMath2 {
    /**
     * 피타고라스 정리 개념 적용
     */
    public void num4153() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while(true){
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);

            if(x == 0 && y == 0 && z == 0){ //무한루프 종료 조건
                break;
            }

            if((x*x + y*y) == z*z){
                sb.append("right").append('\n');
            } else if((y*y + z*z) == x*x){
                sb.append("right").append('\n');
            } else if((x*x + z*z) == y*y){
                sb.append("right").append('\n');
            } else{
                sb.append("wrong").append('\n');
            }
        }
        bw.write(sb+"");
        bw.flush();
        bw.close();
    }

    public void num3053() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double r = Double.parseDouble(br.readLine());
        double u = r * r * Math.PI; //유클리드
        double t = 2 * r * r; //택시

        bw.write(u + "\n" + t);
        bw.flush();
        bw.close();
    }

    public void num1193(){

    }

    public void num10757() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] s = str.split(" ");

        BigInteger bigInteger1 = new BigInteger(s[0]);
        BigInteger bigInteger2 = new BigInteger(s[1]);

        bw.write(bigInteger1.add(bigInteger2)+"");
        bw.flush();
        bw.close();
    }

    public void num1978() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine(); //입력 받을 숫자 개수
        int count = 0; //소수의 개수

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()){
            boolean isPrimeNum = true; //소수면 true, 아니면 false
            int num = Integer.parseInt(st.nextToken());

            if(num == 1){ //소수에서 1은 제외
                continue;
            }

            //소수가 아닌 경우 - 나 자신이 아닌 값으로 나눠 떨어지기라도 하면 소수 탈락임
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrimeNum = false;
                    break;
                }
            }

            //소수인 경우
            if(isPrimeNum){
                count++;
            }
        }

        bw.write(count+"\n");
        bw.flush();
        bw.close();
    }

    public void num2581() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 100000;

        for(int i = M; i <= N; i++){
            boolean isPrimeNum = true; //소수면 true, 아니면 false

            if(i == 1){ //1은 소수 아님
                continue;
            }

            //소수가 아닌 경우 - 1이랑 나 자신이 아닌 값으로 나눠 떨어지기라도 하면 소수 탈락임
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrimeNum = false;
                    break;
                }
            }

            if(isPrimeNum){ //소수인 경우
                sum += i;
                if(min > i){
                    min = i;
                }
            }
        }

        if(sum == 0){
            System.out.println(-1);
        } else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
