package day12;

public class WakeUpTask {

    public static void main(String[] args) {

        /*
        *Create a variable to store the weather of your city right now:
        * Write a if else if statement to do the following
        * if weather sunny------>Code in  Sunny weather
        * if weather rainy------>Code in  Rainy weather
        * if weather cloudy------>Code in  Cloudy weather
        * if weather snowy------>Code in  Snowy weather
        * else --->> rain or shine just keep coding anyway!!!
         */

        String weather = "Rainy";

        if (weather.equals("Rainy") ){
            System.out.println("Rainy weather");
        }
        else if (weather.equals("Cloudy")){
            System.out.println("Cloudy weather");
        }
        else if (weather.equals("Sunny")){
            System.out.println("Sunny weather");
        }
        else if( weather.equals("Snowy")){
            System.out.println("Snowy weather");
        }
        else {
            System.out.println("Rain or shine just keep coding anyway!!!");
        }

        /*
        *
         */
    }
}
