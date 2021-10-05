package com.company.step6to10;

import java.io.*;

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


}
