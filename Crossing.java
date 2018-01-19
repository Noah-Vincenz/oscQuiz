   public class Crossing {

   private String mode = "";
   private int users = 0;
//synch
    public synchronized void enterCrossing(CrossingUser u){
        while ( (!mode.equals("") && !u.getMode().equals(mode)  ) ||
          (users > 2 && u.getMode().equals("FOOT")) ||
          (users > 0 && u.getMode().equals("ROAD") )   ) {
             try{
                  wait();
                  //Thread.sleep(u.timeToCross());
            } catch (InterruptedException e){
                e.printStackTrace();
            }
       }
        mode = u.getMode();
       ++users;
      System.out.println(u.getMode() + " User Entering the Crossing");
    }

     public void useCrossing(CrossingUser u){
        try{
             Thread.sleep(u.timeToCross());
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
//synch
     public synchronized void leaveCrossing(CrossingUser u){

        --users;
        if(users == 0){
             mode = "";
        }
        System.out.println(u.getMode() + " User Leaving the Crossing");
        notifyAll();
    }
 }
