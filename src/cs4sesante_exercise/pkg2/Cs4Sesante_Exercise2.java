/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4sesante_exercise.pkg2;

/**
 *
 * @author HP
 */
public class Cs4Sesante_Exercise2 {

    public static void main(String[] args) {
            Song gorgeous = new Song("Gorgeous", "Taylor Swift", "Reputation");
            Song youBelongWithMe = new Song("You Belong With Me", "Taylor Swift", "Fearless");
            Song deathByAThousandCuts = new Song("Death By A Thousand Cuts", "Taylor Swift", "Lover");
            Song checkmate = new Song("Checkmate", "Conan Gray", "Kid Krow");
            Song overdrive = new Song("Overdrive", "Conan Gray", "Superache");
            Song maniac = new Song("Maniac", "Conan Gray", "Kid Krow");
            
            Singer taylorSwift = new Singer("Taylor Swift", gorgeous);
            Singer conanGray = new Singer ("Conan Gray", checkmate);
            
            Fan shaun = new Fan("Shaun", taylorSwift);
            Fan miranda = new Fan("Miranda", taylorSwift);
            Fan sunny = new Fan("Sunny", conanGray);
            Fan ethan = new Fan("Ethan", conanGray);
            
            taylorSwift.performForAudience(12);
            taylorSwift.changeFavSong(deathByAThousandCuts);
    }
    
}
