package becker;

import becker.robots.*;

public class DeliverParcel
{
   public static void girarderecha (Robot karel, int a){
       for(int i=0; i<a; i++){
           karel.turnLeft();
       }
   };
   
   public static void avanza (Robot karel, int a){
       for(int i=0; i<a; i++){
           karel.move();
       }
   };
   
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      // Thing c1 = new Thing(prague, 1, 2);
      //Thing c2 = new Thing(prague, 3, 3);
      Wall p1 = new Wall (prague, 1, 1, Direction.NORTH);
      Wall p2 = new Wall (prague, 1, 2, Direction.NORTH);
      Wall p3 = new Wall (prague, 1, 1, Direction.WEST);
      Wall p4 = new Wall (prague, 2, 1, Direction.WEST);
      Wall p5 = new Wall (prague, 2, 1, Direction.SOUTH);
      Wall p6 = new Wall (prague, 2, 2, Direction.SOUTH);
      Wall p7 = new Wall (prague, 1, 2, Direction.EAST);
      Wall p8 = new Wall (prague, 2, 2, Direction.EAST);
      
      Robot karel = new Robot(prague, 0, 2, Direction.WEST,5);
    
      // Direct the robot to the final situation
      
      
          
      
      girarderecha(karel,2);
      karel.move();       
      int i=0;
      while (i<3){
          girarderecha(karel,3);
          avanza(karel,3);
          i++;
      }
        girarderecha(karel,3);
        avanza(karel,2);
        girarderecha(karel,2);
        
        
      /*karel.move();
      karel.move();
      karel.pickThing();
      karel.move();
      karel.turnLeft();	// start turning right as three turn lefts
      karel.turnLeft();
      karel.turnLeft();	// finished turning right
      karel.move();
     // karel.putThing();
      karel.move();
      System.out.println(karel.countThingsInBackpack());
*/
   }
}
