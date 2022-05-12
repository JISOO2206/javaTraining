package Iteration;

import java.io.*;
import java.util.StringTokenizer;

public class AplusBminus5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        /*
        *   - String은 변경 불가능한 문자열을 생성하지만
        *   String Builder는 변경 가능한 문자열을 만들어 준다.
        */

        while (true){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A == 0 && B ==0){
                break;
            }
            sb.append((A+B)).append('\n');
        }
        System.out.println(sb);

    }
}
