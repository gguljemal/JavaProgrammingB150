package day09;

public class DayType2 {

    public static void main(String[] args) {

        /*
         *create a variable called dayCode as int
         * if the dayCode is 1 ---->>Monday
         * if the dayCode is 2 ---->>Tuesday
         * if the dayCode is 3 ---->>Wednesday
         * if the dayCode is 4 ---->>Thursday
         * if the dayCode is 5 ---->>Friday
         * if the dayCode is 6 ---->>Saturday
         * if the dayCode is 7 ---->>Sunday
         * if non of the above just print unknown day
         */

        int dayCode = 7;
        String dayName="";
        if (dayCode == 1) {
           dayName= "Monday"; }

        else if (dayCode == 2) {
            dayName="Tuesday"; }

        else if (dayCode == 3) {
            dayName= "Wednesday"; }

        else if (dayCode == 4) {
            dayName= "Thursday"; }

        else if (dayCode == 5) {
            dayName="Friday"; }

        else if (dayCode == 6) {
            dayName= "Saturday"; }

        else if (dayCode == 7) {
            dayName ="Sunday";
        System.out.println("Yeeee it is Sunday!"); }

        else { dayName="Unknown Day"; }

        System.out.println("Day is "+dayName);
    }
}