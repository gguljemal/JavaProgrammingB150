package day41;

public class TV {

    String name ;
    boolean isOn;
    int currentChannel; //range from 1-50


    /**
     * A method to return the value of current channel for the TV
     * @return  the value of current channel for the TV
     */
   public int getCurrentChannel(){
       return  currentChannel;
   }


   // we can not set channel if the TV is off!!!
   public void setCurrentChannel(int newCurrentChannel){

       if (newCurrentChannel < 0 || newCurrentChannel > 50){
           System.out.println("INVALID CHANNEL, GETTING OUT");
           return; // early exit from the method
       }
       if (isOn == true) {
           currentChannel = newCurrentChannel;
       }else{
           System.out.println("TURN ON TV FIRST!");
       }
   }

    public void turnOn(){

        if (isOn==false) {
            System.out.println("Turning on TV");
            isOn = true;
        }
    }

    public void turnOff(){

        if (isOn==true) {
            System.out.println("Turning off TV");
            isOn = false;
        }
    }


    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
