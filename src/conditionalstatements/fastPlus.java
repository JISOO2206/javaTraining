package conditionalstatements;

import java.io.*;
import java.util.StringTokenizer;

public class fastPlus {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int repeatNo = Integer.parseInt(bf.readLine());
        // 11번 줄에서 예외처리가 발생한다. try/catch 대신 IOException 처리를 해줬다.

        for (int i = 0; i<repeatNo; i++){
           st = new StringTokenizer(bf.readLine());
           bw.write((Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken()))+"\n");
        }

        bw.flush();

    }

}
