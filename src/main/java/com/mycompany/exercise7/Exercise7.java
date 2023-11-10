/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise7;

/**
 *
 * @author HP
 */
public class Exercise7 {

    public static void main(String[] args) {
         Monster charizard = new FireType("Charizard", 40, 80);
         Monster spheal = new WaterType("Spheal", 25, 100);
         Monster bulbasaur = new GrassType("Bulbasaur", 35, 90);
        
         Trainer pam = new Trainer ("Pam");
         Location japan = new Location ("Japan", "cherry blossom flowers");
         NPC Navia = new NPC ("Navia", "Oh hi there! You look like a trainer. I wanted to be one too but I ended up becoming a nurse instead...");
         
         
         pam.inspect(spheal); 
         pam.inspect(japan);
         pam.inspect(Navia);
    }
}
