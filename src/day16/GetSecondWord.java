package day16;

public class GetSecondWord {

    public static void main(String[] args) {

     /*given a sentence with 3 words
     get the second word
     second word is between first space and last space
      */
                    //01234567890
     String sentence="I Love Java";
     String secondWord;

     int firstSpaceIndex=sentence.indexOf(" ");
     System.out.println("First index of space= "+firstSpaceIndex);

     int lastSpaceIndex=sentence.lastIndexOf(" ");
     System.out.println("Last index of space= "+lastSpaceIndex);

     //System.out.println(sentence.substring(2,6));
        System.out.println(sentence.substring(1+1,6));
        secondWord=sentence.substring(firstSpaceIndex+1,lastSpaceIndex);
        System.out.println("second word is: "+secondWord);

        //How to get first word:
        //first word is stating from from first character till first space
        String firstWord=sentence.substring(0,firstSpaceIndex);
        System.out.println("first word is= "+firstWord);

        //int sentencesLength=sentence.length();
        //String lastWord=sentence.substring(lastSpaceIndex+1,sentencesLength);
        // or we can use below one
        String lastWord=sentence.substring(lastSpaceIndex+1);
        System.out.println("last word of sentences= "+lastWord);


    }
}
