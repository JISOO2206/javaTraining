package Iteration;

import java.io.*;
import java.util.StringTokenizer;

public class AplusBminus7 {

    public static void main(String[] args) throws IOException {

        StringTokenizer st;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeatNo = Integer.parseInt(bf.readLine());

        for(int i = 1; i<=repeatNo; i++){
            st = new StringTokenizer(bf.readLine());
            bw.write("Case #"+i+": "+((Integer.parseInt(st.nextToken())
                    + Integer.parseInt(st.nextToken())
            ))+"\n");
        }

        bw.flush();

    }

}
