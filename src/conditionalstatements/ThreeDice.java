package conditionalstatements;

import java.util.Scanner;

public class ThreeDice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int diceNo1 = sc.nextInt();
        int diceNo2 = sc.nextInt();
        int diceNo3 = sc.nextInt();

        if((diceNo1 == diceNo2) && (diceNo2 == diceNo3) && (diceNo3 == diceNo1)) {
            System.out.println("같은 눈이 세 개입니다");
            System.out.println(10000 + diceNo1 * 1000);
        }else if((diceNo1 == diceNo2) || (diceNo2 == diceNo3)){
            System.out.println("같은 눈이 두 개입니다");
            System.out.println(1000 + diceNo2 * 100);
        } else if (diceNo1 == diceNo3) {
            System.out.println("같은 눈이 두 개입니다");
            System.out.println(1000 + diceNo1 * 100);
        }else {
            System.out.println("같은 눈이 아닙니다.");
            System.out.println(Math.max(diceNo1, Math.max(diceNo2, diceNo3))*100);
        }

        /*if((diceNo1 == diceNo2) && (diceNo2 == diceNo3) && (diceNo3 == diceNo1)) {
            System.out.println(10000 + diceNo1 * 1000);
        }else if((diceNo1 == diceNo2) || (diceNo2 == diceNo3) || (diceNo1 == diceNo3)){
            System.out.println(1000 + diceNo2 * 100);
        }else {
            System.out.println(Math.max(diceNo1, Math.max(diceNo2, diceNo3))*100);
        }*/
        // 이건 왜 안 되는 걸까...

        sc.close();

    }

}
