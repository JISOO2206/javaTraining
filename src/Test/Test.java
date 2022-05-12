package Test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int num = 0; // 입력된 숫자가 저장될 변수를 초기화 한다.
        int sum = 0; // 입력된 숫자의 각 자리의 합을 저장할 변수를 초기화 한다.

        System.out.print("숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while(num!=0){
            //num을 10으로 나눈 나머지를 sum에 더한다.
            sum += num%10;
            //num을 10으로 나눈 값을 다시 num에 저장한다.
            num /= 10;
        }
        System.out.println("각 자리수의 합은 "+sum+"입니다.");
        System.out.println("프로그램을 종료합니다.");
        sc.close();

        /*
        int randNum = 2143;
        String strNum = Integer.toString(randNum );
        for(int i = 0; i < strNum.length(); i++) {
        System.out.println(strNum.charAt(i));
         */
    }


}
