public class CrossingUser extends Thread {
      private String mode;
      private Crossing crossing;

      public CrossingUser(Crossing toUse, String modeIn){
          mode = modeIn;
         crossing = toUse;
      }

    public void run(){
        crossing.enterCrossing(this);
        crossing.useCrossing(this);
        crossing.leaveCrossing(this);
    }

  public int timeToCross(){
        if(mode.equals("ROAD")){
            return 50;
        } else {
            return 200;
        }
     }

    public String getMode(){
        return mode;
   }
 }
