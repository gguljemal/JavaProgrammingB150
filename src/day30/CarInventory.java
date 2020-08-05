package day30;

public class CarInventory {

    public static void main(String[] args) {

        String cars [] = { "Acura-NSX",
                           "Chevrolet-Corvette",
                           "Chevrolet-Cavalier",
                            "BMW-3 Series",
                            "Pontiac-LeMans",
                            "BMW-7 Series",
                            "Oldsmobile-Achieva",
                             "Honda-Civic"};

        //Count Chevrolet and Civic

        int chevyCount=0;
        int civic = 0;

        for (String car : cars){

            //if (car.startsWith("Chevrolet"))-->sensitive case

            //insensitive case
            if (car.toLowerCase().startsWith("chevrolet")){
                chevyCount++;
            }
                if (car.toUpperCase().contains("CIVIC")){
                    civic++;
                }
        }

        System.out.println("chevyCount = " + chevyCount);
        System.out.println("civic = " + civic);

        System.out.println("------with for-i loop-----------");

        for (int i = 0; i < cars.length ; i++) {

            if (cars[i].contains("Chevrolet"));{
                chevyCount++;
            } if (cars[i].contains("Civic")) {
                civic++;
            }
        }
        System.out.println("chevyCount = " + chevyCount);
        System.out.println("civic = " + civic);


        //PRINT ALL LOCATION OF CIVIC in this array
        for (int x = 0; x < cars.length ; x++) {

            if (cars[x].contains("Civic")){
                System.out.println("Civic found at location: "+x);
            }
        }
        //PRINT ALL LOCATION OF honda-CIVIC in this array
        for (int x = 0; x < cars.length ; x++) {

            if (cars[x].equals("Honda-Civic")){
                System.out.println("Civic found at location: "+x);
            }
        }

        //PRINT Make and Model separately in this format
        //Honda-Civic--->   Car make is Honda and Model is Civic
        //print only Honda brand cars
        String car = "Honda-Civic";
        String carArray [] = car.split("-");
        System.out.println("Car make is "+carArray[0]+
                           "Car Model is "+carArray[1]);

        for (String eachCar : cars) {

            if (eachCar.startsWith("Honda")){
                System.out.println("car "+eachCar);
            }
        }

//        for (String car : cars) {
//
//            if (car.startsWith("Honda")){

//                String carSplitted [] = car.split("-");

//                System.out.println("Car make is "+eachCarArray[0]+
//                        "Car Model is "+eachCarArray[1]);
//            }
//        }

    }
}
