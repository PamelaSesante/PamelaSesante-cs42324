/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4sesante_exercise.pkg2;

/**
 *
 * @author HP
 */
public class Fan {
    String fanName;
    double fanMoney;
    Singer favoriteSinger;
    int boughtTicket;
    
    public Fan(String n, Singer faveSinger) {
    fanName = n;
    fanMoney = 500;
    favoriteSinger = faveSinger;
    boughtTicket = 0;
}
    public void work() {
        fanMoney += 500;
        System.out.println (fanName + " worked really hard. They got payed 500 dollars by their generous boss.");
    }
    
    public void buyTicket() {
    if (fanMoney >= 500) {
        boughtTicket++;
        fanMoney -= 500;
        System.out.println(fanName + " buys a " + favoriteSinger.name + " concert ticket. They jump in joy and look at the ticket.") ;
    }
    else {
       System.out.println(fanName + " doesn't have enough money to buy a " + favoriteSinger.name + " concert ticket. They should probably work more...") ;
    }
    }
    
    public void goToConcert (){
        if (boughtTicket >= 1) {
            System.out.println(fanName + " goes to " + favoriteSinger.name + "'s concert. They seem to be very excited.");
            boughtTicket--;
        }
        
        else {
            System.out.println(fanName + " becomes very sad after realizing that they have no tickets to go to " + favoriteSinger.name + "'s concert.");
        }
    }
    
    public void cheer() {
    System.out.println(fanName + " cheers for " + favoriteSinger.name);
    System.out.println(favoriteSinger.name + " hears " + fanName + "'s cheer and smiles on the stage.");
    }
}
