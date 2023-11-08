/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4sesante;

/**
 *
 * @author HP
 */
public class Cs4Sesante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String car1Name = "Mclaren Senna";
       int car1Price = 1050000;
       int car1Horsepower = 589;
       
       String car2Name = "Porsche 911";
       int car2Price = 106100;
       int car2Horsepower = 379; 
      
       String car3Name = "Ferrari Laferrari";
       int car3Price = 6127000;
       int car3Horsepower = 949; 
       
       int totalPrice = car1Price + car2Price + car3Price;
       boolean carHorsepowerCompare = car1Horsepower>500 && car2Horsepower>500 && car3Horsepower>500;
       int horsepowerDifference = car3Horsepower - car2Horsepower;
      
       System.out.println("Car 1" + "\n Name: " + car1Name + "\n Price: $" + car1Price + "\n Horsepower: " + car1Horsepower + 
                          "\n\nCar 2" + "\n Name: " + car2Name + "\n Price: $" + car2Price + "\n Horsepower: " + car2Horsepower +
                          "\n\nCar 3" + "\n Name: " + car3Name + "\n Price: $" + car3Price + "\n Horsepower: " + car3Horsepower);
       
       System.out.println("\nTotal price of the cars: $" + totalPrice);
       System.out.println("All cars have a horsepower above 500: " + carHorsepowerCompare);
       System.out.println("Difference of the Laferrari's and Porsche 911's horsepower: " + horsepowerDifference);
    }
}
