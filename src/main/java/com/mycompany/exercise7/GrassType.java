/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise7;

/**
 *
 * @author HP
 */
public class GrassType extends Monster implements Interactive{
      public GrassType(String n, int base, int hp){
        super(n, "grass", "water", "fire", hp, base);
    }
      
     @Override
      public void special(){
         this.hp += 0.20*maxHP;
         System.out.println(this.name + "'s health is now " + this.hp);
    }
      
    public void rest(){ // is this rest or restore health?
        this.hp += 0.50*maxHP;
        System.out.println(this.name + " did a pose. " + this.name + "'s health is now " + this.hp);
    }
    
    public void interact(){
       System.out.println("It's " + this.name + ". It seems to be a " + this.type + " type.");
    }
}
