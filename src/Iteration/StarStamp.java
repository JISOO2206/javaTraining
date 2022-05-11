package Iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarStamp {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int starStamp = Integer.parseInt(br.readLine());

        for (int i = 1; i<=starStamp; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("=====================");

        for(int i = 1; i<=starStamp; i++){
            for(int j=1; j<=starStamp-i; j++){
                System.out.print(" ");
            }
            for (int k=0; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
