/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4sesante_exercise.pkg2;

/**
 *
 * @author HP
 */
public class Singer {
    private final String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances = 0;
    
    public Singer(String n, Song f) {
        name = n;
        noOfPerformances = 0;
        earnings = 0;
        favoriteSong = f;
    }
    
    public void changeFavSong(Song newFavoriteSong) {
     String newFavoriteSongName = newFavoriteSong.getSongName();
     setFavoriteSong(newFavoriteSong);
     System.out.println(getName() + " has changed their favorite song to " + newFavoriteSongName + ".\n");
    }
    
    public void performForAudience(int noOfAudience){
        String favoriteSongName = favoriteSong.getSongName();
        setEarnings(getEarnings() + noOfAudience*100);
        noOfPerformances++;
        System.out.println(getName() + " performed for " + noOfAudience + " people and now has " + getEarnings() + " dollars. Their song " + favoriteSongName + " was received spectacularly!" + "\n");
    }
    
    public void performForAudience(int noOfAudience, Singer otherSinger) {
        String singerTwoName = otherSinger.getName();
        double singerTwoEarnings = otherSinger.getEarnings();
        int duoEarnings = noOfAudience*100;
        setEarnings(getEarnings() + duoEarnings/2);
        otherSinger.setEarnings(singerTwoEarnings + duoEarnings/2);
        noOfPerformances++;
        otherSinger.noOfPerformances++;
        totalPerformances = noOfPerformances + otherSinger.noOfPerformances;
        
        System.out.println(name + " is performing with " + singerTwoName + "! They have amassed " + noOfAudience + " people and have earned " + duoEarnings + " dollars.");
        System.out.println(name + " now has " + earnings + " dollars. Number of performances: " + noOfPerformances + ".");
        System.out.println(singerTwoName + " now has " + otherSinger.earnings + " dollars. Number of performances: " + otherSinger.noOfPerformances + ".");
        System.out.println("Total number of performances: " + totalPerformances + ".\n");
    }

    public String getName() {
        return name;
    }

    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    public double getEarnings() {
        return earnings;
    }
    
    
    public static int getTotalPerformances() {
        return totalPerformances;
    }
    
    public Song getFavoriteSong() {
        return favoriteSong;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
    
}
    
