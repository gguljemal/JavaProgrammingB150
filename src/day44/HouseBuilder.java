package day44;

public class HouseBuilder {

    public static void main(String[] args) {

     House.showNeighborhood();

     House h1 = new House(101,"Vintage");
     h1.showAllInfo();

     House h2 = new House(102,"Classic");
     h2.showAllInfo();

//    how do I get max value of Short

        System.out.println(Short.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);

    }
}
