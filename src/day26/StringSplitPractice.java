package day26;

import java.util.Arrays;

public class StringSplitPractice {

    public static void main(String[] args) {

     String students  = "Abbos, Zulyar,Hasan,Zhibek,Muge, Orhan,Susan";
     //first get all the name into String array called namesArray
     students = students.replace(" ", "");
        System.out.println("students = " + students);

        String names [] = students.split(",");
        System.out.println(Arrays.toString(names));
        System.out.println("length of names are: "+names.length);
        
     //Spell the name of each person in this format
        //exclude space if you get space in names
 //       String name = names[0]; //Abbos
 //       for (int i = 0; i < name.length() ; i++) {
 //           System.out.println(name.charAt(i)+"-");
 //       }
  //      System.out.println();

        String name1 = names[1]; //Zulyar
        for (int i = 0; i < name1.length() ; i++) {
            System.out.println(name1.charAt(i)+"-");
        }
        System.out.println();

         String name2 = names [2];//Zhibek
        for (int i = 0; i < name2.length() ; i++) {
            System.out.println(name2.charAt(i)+"-");
        }
        System.out.println();
        //AND SO ON.......

        for (int i = 0; i < names.length; i++) {
             String name = names[i];
            System.out.println("name = " + name);

            for (int j = 0; j <name.length() ; j++) {
                System.out.print(name.charAt(j)+"-");
            }
            System.out.println();
        }


        //OPTIONALLY count a from each name print 
    }
}
