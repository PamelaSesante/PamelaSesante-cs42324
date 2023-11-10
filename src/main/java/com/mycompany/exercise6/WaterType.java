/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise6;

/**
 *
 * @author HP
 */
public class WaterType extends Monster{
        public WaterType(String n, int base, int hp){
        super(n, "water", "fire", "grass", hp, base);
        this.atk = (int) (base*0.7);
        this.def = (int) (base*1.3);
    }
        
        @Override
        public void special(){
            super.special();
            this.def += 2;
            this.hp -= 0.10 * maxHP;
            System.out.println(this.name + "'s defense increased by 2! But their health is now " + this.hp);
        }
}
