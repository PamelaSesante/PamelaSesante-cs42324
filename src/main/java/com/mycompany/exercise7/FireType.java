/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise7;

/**
 *
 * @author HP
 */
public class FireType extends Monster {
    
    public FireType(String n, int base, int hp){
        super(n, "fire", "grass", "water", hp, base);
        this.atk = (int) (base * 1.3);
        this.def = (int) (base * 0.7);
    }
    
    @Override
        public void special(){
            this.atk += 2;
            this.hp -= 0.10 * maxHP;
            System.out.println(this.name + " did a pose. " + this.name + "'s attack increased by 2! But their health is now " + this.hp);
        }
        
}
