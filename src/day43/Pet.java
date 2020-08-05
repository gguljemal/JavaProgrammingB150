package day43;

public class Pet {

    private String type;
    private String name;

    public Pet(){
        this.name = "unknown";
        this.name = "no-name";
    }

    public Pet(String type, String name){
        this.name = type;
        this.name = name;
    }

    public void speak() {

        switch ( type ){

            case "cat" :
                System.out.println("MEOW");
                break;
            case "dog" :
                System.out.println("WOOF");
                break;
            case "horse" :
                System.out.println("NEIGH");
                break;
            case "cow" :
                System.out.println("MOOOO");
                break;
            default:
                System.out.println("UNKNOWN");

        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void showGeneralPetInfo(){
        System.out.println( "PETS ARE FRIENDS OF HUMANS" );
    }

}
