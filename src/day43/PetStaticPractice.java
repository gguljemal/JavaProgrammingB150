package day43;

public class PetStaticPractice {

    public static void main(String[] args) {

       Pet.showGeneralPetInfo();

       //Pet.getName();---> not work need an object

        Pet p1 = new Pet("cat","yumyum");
        System.out.println("p1 name = " + p1.getName());
        p1.speak();

    }
}
