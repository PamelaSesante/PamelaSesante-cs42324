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
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(String n, Song f) {
        name = n;
        noOfPerformances = 0;
        earnings = 0;
        favoriteSong = f;
    }
    
    public void changeFavSong(Song favSong) {
     favoriteSong = favSong;
     System.out.println(name + " has changed their favorite song to " + favSong.songName);
    }
    
    public void performForAudience(int noOfAudience){
        earnings += noOfAudience*100;
        noOfPerformances++;
        System.out.println(name + " performed for " + noOfAudience + " people and now has " + earnings + " dollars. Their song " + favoriteSong.songName + " was received spectacularly!");
    }
}
    
