package conditionalstatements;

import java.util.Scanner;

public class HowOldAmIInThailand {

    public static void main(String[] args) {

        int badYear;
        int ADYear;

        Scanner sc = new Scanner(System.in);
        badYear = Integer.parseInt(sc.next());

        ADYear = badYear - 543;

        System.out.println(ADYear);

    }

}
