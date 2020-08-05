package day36;

public class WrapperReview {

    public static void main(String[] args) {

      Integer i1 = new Integer(1000000000);
      Integer i2 = Integer.valueOf(123);

         // i3 primitive type variable
        // i3 reference type variable
        //auto boxing : primitive to wrapper type conversion
        Integer i3 = 45;//   45 ---->> new Integer (45);

        int i4 = 54;
        //auto unboxing : wrapper to primitive type conversion
        int i5 = new Integer(100);// new Integer (100)----->>100

        //AUTO BOXING AND UNBOXING IS UNIQUE FEATURE
        //OF CONVERSION BETWEEN VALUE WRAPPER CLASSES OBJECTS
    }
}
