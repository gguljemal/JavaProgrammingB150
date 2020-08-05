package day35;

public class ParsingPractice {

    public static void main(String[] args) {
  //                       012345678901234567890123456789012345678901234
        String sentence = "I bought 3 tomato and the price was 3.14 each";

        //how much is your final checkout price
        //The count is always 3rd word
        //the price is always at 2nd word from the last

       String words [] = sentence.split(" ");
       int count = Integer.parseInt(words[2]);
       double price = Double.parseDouble(words[words.length-2]);

        System.out.println("Total price is " + count*price );
    }
}
