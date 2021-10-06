package com.company.step6to10;

import java.io.*;
import java.math.BigInteger;

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

}
