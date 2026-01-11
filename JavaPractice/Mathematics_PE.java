// 중요한 것은 코드를 짜기 전에 문제부터 파악하는 것이다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Mathematics_PE{     //  그런데 왜 메인함수(시작점 함수)에는 괄호가 없지?
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine()); // 숫자 범위때문에 계속 틀린거였다!!! 좀더 세심하게 조건을 살필것!

        System.out.println(4*n);
    }
}