package Iteration;

import java.io.*;
import java.util.StringTokenizer;

public class AplusBminus8 {

    public static void main(String[] args) throws IOException {

        StringTokenizer st;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeatNo = Integer.parseInt(bf.readLine());
        int A;
        int B;

        for(int i = 1; i<=repeatNo; i++){
            st = new StringTokenizer(bf.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "
                    +A+" + "+B+" = "+(A+B)+"\n");
        }

        bw.flush();

    }

}
