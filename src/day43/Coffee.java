package day43;

/*
A Blueprint for Coffee object
with 3 constructors
getter and setters
Price should never be less than 0
No Coffee object with minus price should be created
No one should change the price
to minus for any existing coffee object
 */

public class Coffee {

    private String type;
    private int caffeineLevel;
    private double price;

    public Coffee (){
        System.out.println(" no arg constructor");
    }

    public Coffee (String type, int caffeineLevel){

        this.type = type;
        this.caffeineLevel = caffeineLevel;
        System.out.println("2 args constructor");
    }

    public Coffee (String type, int caffeineLevel, double price) {
        this.type = type;
        this.caffeineLevel = caffeineLevel;

        if (price > 0){
            this.price = price;
        } else {
            this.price = 1;
        }

//        setPrice(price);
    }

    //we want to block the caller of this method to set invalid prices
    public void setPrice(double price) {

        if (price>0){
            this.price = price;
        }else{
            this.price = 1;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(int caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }

    public double getPrice() {
        return price;
    }



    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }
}
