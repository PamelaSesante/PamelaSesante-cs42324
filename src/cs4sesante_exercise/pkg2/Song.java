/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4sesante_exercise.pkg2;

/**
 *
 * @author HP
 */
public class Song {
    String songName;
    String sungBy;
    String albumName;
    
    public Song(String songN, String sB, String albumN) {
        songName = songN;
        albumName = albumN;
        sungBy = sB;
}
    public void announceConcertSong() {
        System.out.println(sungBy + " announces in the concert that they will play " + songName + " from their album " + albumName);
    }
}
