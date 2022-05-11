package conditionalstatements;

import java.util.Scanner;

public class OvenClock {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int currentTimeHours = sc.nextInt();
        int currentTimeMinutes = sc.nextInt();
        int cookingTime = sc.nextInt();
        String timeResult = "";

        currentTimeHours += (currentTimeMinutes+cookingTime)/60;
        currentTimeMinutes += cookingTime - (60 * ((currentTimeMinutes + cookingTime)/60));
        if(currentTimeHours >=24){
            currentTimeHours -= 24;
        }

        timeResult += currentTimeHours + " "+ currentTimeMinutes;
        System.out.println(timeResult);
        sc.close();
    }

}
