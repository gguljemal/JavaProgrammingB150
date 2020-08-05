package day20;

public class Get2SiblingChar {

    public static void main(String[] args) {

      //given a String with even number character count
        //print 2 characters in one line as below example
        /*
        Ayra---> Ay
                 yr
                 ra
         */
      //             012345
        String name="Serdar";
        //           123456
        int length=name.length();

        for(int x=0;x<=length-2;++x){

            System.out.println(name.substring(x,x+2));
        }

        for (int i=0; i<=name.length()-3;i++){

            System.out.println(name.substring(i,i+3));
        }

    }
}
