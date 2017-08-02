/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;

import becker.robots.*;
/**
 *
 
 */
public class pepito {
      public static void girar (Robot karel, int a){
       for(int i=0; i<a; i++){
           karel.turnLeft();
       }
   };
   
   public static void avanza (Robot karel, int a){
       for(int i=0; i<a; i++){
           karel.move();
       }
   };
       public static void main(String[] args){
          
        City prague = new City();
       
        Wall p1 = new Wall (prague, 1, 1, Direction.NORTH);
        Wall p2 = new Wall (prague, 1, 2, Direction.NORTH);
        Wall p3 = new Wall (prague, 1, 2, Direction.EAST);
        Wall p4 = new Wall (prague, 1, 2, Direction.SOUTH);
        Wall p5 = new Wall (prague, 1, 1, Direction.WEST);
        Wall p6 = new Wall (prague, 2, 1, Direction.WEST);
        Wall p7 = new Wall (prague, 2, 1, Direction.SOUTH);
        Thing c1 = new Thing (prague, 2, 2);
               
        Robot karel = new Robot(prague, 1, 2, Direction.SOUTH,5);
        
        
        
        girar(karel, 3);
        karel.move();
        int i=0;
        while(i<2){
        karel.turnLeft();
        karel.move();
        i++;
        }
        karel.pickThing();
        girar(karel, 2);
        int j=0;
        while(j<3){
            karel.move();
            girar(karel,3);
            j++;
        }
        
    };    
        
        
        
   };

