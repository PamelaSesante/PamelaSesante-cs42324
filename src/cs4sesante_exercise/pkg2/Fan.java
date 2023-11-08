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
    private String fanName;
    private double fanMoney;
    private Singer favoriteSinger;
    private int boughtTicket;
    
    public Fan(String n, Singer faveSinger) {
    fanName = n;
    fanMoney = 500;
    favoriteSinger = faveSinger;
    boughtTicket = 0;
}
    public void work() {
        setFanMoney(getFanMoney() + 500);
        System.out.println (getFanName() + " worked really hard. They got payed 500 dollars by their generous boss.");
    }
    
    public void buyTicket() {
     String favoriteSingerName = favoriteSinger.getName();
    if (getFanMoney() >= 500) {
            setBoughtTicket(getBoughtTicket() + 1);
            setFanMoney(getFanMoney() - 500);
        System.out.println(getFanName() + " buys a " + favoriteSingerName + " concert ticket. They jump in joy and look at the ticket.") ;
    }
    else {
       System.out.println(getFanName() + " doesn't have enough money to buy a " + favoriteSingerName + " concert ticket. They should probably work more...") ;
    }
    }
    
    public void goToConcert (){
        String concertSingerName = favoriteSinger.getName(); 
        if (getBoughtTicket() >= 1) {
            System.out.println(getFanName() + " goes to " + concertSingerName + "'s concert");
        }
        
        else {
            System.out.println(getFanName() + " becomes very sad after realizing that they have no tickets to go to " + concertSingerName + "'s concert.");
        }
    }
    
    public void cheer() {
    String concertSingerName = favoriteSinger.getName();
    System.out.println(getFanName() + " cheers for " + concertSingerName);
    System.out.println(concertSingerName + " hears " + getFanName() + "'s cheer and smiles on the stage.");
    }

    public String getFanName() {
        return fanName;
    }

    public double getFanMoney() {
        return fanMoney;
    }

    public Singer getFavoriteSinger() {
        return favoriteSinger;
    }
    
        public int getBoughtTicket() {
        return boughtTicket;
    }
    
        
    public void setFanMoney(double fanMoney) {
        this.fanMoney = fanMoney;
    }

    public void setFavoriteSinger(Singer favoriteSinger) {
        this.favoriteSinger = favoriteSinger;
        String newFavoriteSinger = favoriteSinger.getName();
        System.out.println(fanName + " decides to be a part of " + newFavoriteSinger + "'s fandom.");
    }
    
    public void setBoughtTicket(int boughtTicket) {
        this.boughtTicket = boughtTicket;
    }
    
    
}
