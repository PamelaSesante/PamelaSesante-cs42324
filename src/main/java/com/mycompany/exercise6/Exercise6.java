/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise6;

/**
 *
 * @author HP
 */
public class Exercise6 {

    public static void main(String[] args) {
        Monster charizard = new FireType("Charizard", 40, 80);
        Monster spheal = new WaterType("Spheal", 25, 100);
        Monster bulbasaur = new GrassType("Bulbasaur", 35, 90);
        
        int moveCounter = 1;
        
        System.out.println("Battle of Water vs. Grass: Spheal vs. Bulbasaur");
        
        do { 
            
            switch(moveCounter) {
                    case 1: 
                        bulbasaur.attack(spheal);
                        moveCounter = 2;
                        if(spheal.hp <=0){
                        break;
                        }
                    case 2:
                        spheal.attack(bulbasaur);
                        moveCounter = 1;
                        if(bulbasaur.hp <=0){
                        break;
                        }
            }
            
        } while (bulbasaur.hp > 0 && spheal.hp > 0);
        
        bulbasaur.restoreHealth();
        spheal.restoreHealth();
                
        System.out.println("\nBattle of Grass vs. Fire: Bulbasaur vs. Charizard");
        do { 
            switch(moveCounter) {
                    case 1: 
                        bulbasaur.attack(charizard);
                        moveCounter = 2;
                        if(charizard.hp <=0){
                        break;
                        }
                    case 2:
                        charizard.attack(bulbasaur);
                        moveCounter = 1;
                        if(bulbasaur.hp <=0){
                        break;
                        }
            }
            
        } while (bulbasaur.hp > 0 && charizard.hp > 0);
        
        bulbasaur.restoreHealth();
        charizard.restoreHealth();
        
        System.out.println("\nBattle of Water vs. Fire: Spheal vs. Charizard");
        
        do { 
            switch(moveCounter) {
                    case 1: 
                        spheal.attack(charizard);
                        moveCounter = 2;
                        if(charizard.hp <=0){
                        break;
                        }
                    case 2:
                        charizard.attack(spheal);
                        moveCounter = 1;
                        if(spheal.hp <=0){
                        break;
                        }
            }
            
        } while (spheal.hp > 0 && charizard.hp > 0);
        
        bulbasaur.restoreHealth();
        charizard.restoreHealth();
        spheal.restoreHealth();
   
    }
}
