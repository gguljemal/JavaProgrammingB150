package day44;

public class House {

    int houseNum;
    String design;

    // we can change default value of the fields
    // by assigning value directly in the template class
    static String neighbourhoodName = "Cybertek Avenue";

    // constructor can access anything
    public House ( int houseNum, String design ) {
        this.houseNum = houseNum;
        this.design = design;
    }

    // instance method access anything
    public void showAllInfo(){

        System.out.println("House: " + this.houseNum + ", design: " + this.design +
                ", neighbourhoodName " + neighbourhoodName);
    }

    //static method can only access static members of same class
    public static void showNeighborhood(){

        System.out.println("neighbourhoodName = " + neighbourhoodName);

        //System.out.println("houseNum = " + houseNum);==> will not work
        // because  static method cannot access anything that is non-static inside static methods
    }


}
