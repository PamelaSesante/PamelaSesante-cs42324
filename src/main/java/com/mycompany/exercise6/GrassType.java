/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise6;

/**
 *
 * @author HP
 */
public class GrassType extends Monster{
      public GrassType(String n, int base, int hp){
        super(n, "grass", "water", "fire", hp, base);
    }
      
     @Override
      public void special(){
         super.special();
         this.hp += 0.20*maxHP;
         System.out.println(this.name + "'s health is now " + this.hp);
    }
      
    public void rest(){ 
        this.hp += 0.50*maxHP;
        System.out.println(name + "'s health is now " + this.hp);
    }
}
