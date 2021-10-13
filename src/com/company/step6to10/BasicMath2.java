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

    /**
     * 소수 찾기 - 입력 받은 수 중 소수의 개수 출력
     * sqrt(N) 이하의 자연수들로 모두 나눠본다.
     * @throws IOException
     */
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

    /**
     * 소수
     * @throws IOException
     */
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

    public void num1085() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int xMin = Math.min(x, w-x);
        int yMin = Math.min(y, h-y);

        System.out.println(Math.min(xMin, yMin));
    }

    /**
     * 소수 구하기
     * "에라토스테네스의 체"를 사용해서 소수 구하기
     * k=2부터 sqrt(N) 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다.
     */
    public void num1929() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[N + 1];

        //소수 구하기
        //0과 1은 소수가 아님
        for(int i = 2; i <= N; i++){
            if(prime[i]){ //소수가 아니라고 체크된 경우 그냥 패스
                continue;
            }
            if(i >= M){
                sb.append(i).append('\n');
            }
            for(int j = i+i; j <= N; j += i){ //소수가 아닌 경우 체크
                prime[j] = true;
            }
        }
        System.out.println(sb);
    }

    /**
     * 베르트랑 공준
     * 1 <= n <= 123456
     * 2n = 246912
     * 0~246912 -> 246913
     */
    public static boolean[] prime = new boolean[246913];
    public void num4948() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        getPrime();

        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            int count = 0;

            for(int i = n+1; i <= 2*n; i++){ //n부터 2n까지 돌면서 소수 찾기
                //false면 소수, true면 소수 아님
                if(!prime[i]) count++;
            }
            sb.append(count).append('\n');
        }
        System.out.print(sb);
    }
    //소수 구하는 메소드
    //소수O = false, 소수X = true
    public static void getPrime(){
        //0과 1은 소수가 아님
        prime[0] = prime[1] = true;

        for(int i = 2; i < Math.sqrt(prime.length); i++){
            //소수가 아닌 경우에는 그냥 패스
            if(prime[i])
                continue;
            //소수가 아닌 경우 찾기
            //k=2부터 sqrt(N) 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다.
            for(int j = i*i; j < prime.length; j+=i){
                prime[j] = true;
            }
        }
    }


}
