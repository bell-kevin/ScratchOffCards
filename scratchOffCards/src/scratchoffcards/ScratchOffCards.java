/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scratchoffcards;

import java.util.Scanner;
/**
 *
 * @author 4800590195
 */
public class ScratchOffCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //lkjashdfkljhsdaklfjhskldajhfksdafsda
        System.out.print("Scratch-off Card Results by Kevin Bell \n");
        //VARIABLE
        Scanner computerKeyboardInput = new Scanner(System.in);
        int scratchOffNumber;
        String itemWon = "";
        //INPUT

        do {
            System.out.print("What is your scratch-off number? ");
            scratchOffNumber = computerKeyboardInput.nextInt();
            switch (scratchOffNumber) {
                case 1508:
                case 1515:
                case 1516:
                    //if scratchOffNumber == 1508, 1515, 1516 then System.out.print("You won a " + hamburger);
                    itemWon = "hamburger";
                    System.out.print("You won a " + itemWon + "\n");
                    break;
                case 1511:
                    // if scratchOffNumber == 1505, 1510, 1513, 1514, 1519 then System.out.print("You won a " + small drink;
                    itemWon = "meal";
                    System.out.print("You won a " + itemWon + "\n");
                    break;
                case 1505:
                case 1510:
                case 1513:
                case 1514:
                case 1519:
                    //if scratchOffNumber == 1501, 1507, 1512, 1520 then System.out.print("You won a " + dollar off;
                    itemWon = "small drink";
                    System.out.print("You won a " + itemWon + "\n");
                    break;
                case 1503:
                case 1504:
                case 1506:
                case 1509:
                case 1517:
                    //if scratchOffNumber ==  1502, 1518 then System.out.print("You won " + 5 dollars off;
                    itemWon = "ice cream cone";
                    System.out.print("You won a " + itemWon + "\n");
                    break;
                case 1501:
                case 1507:
                case 1512:
                case 1520:
                    //if scratchOffNumber ==  1511 then System.out.print("You won a " + free meal;
                    itemWon = "$1 off coupon";
                    System.out.print("You won a " + itemWon + "\n");
                    break;
                case 1502:
                case 1518:
                    //if scratchOffNumber == 1503, 1504, 1506, 1509, 1517 then System.out.print("You won an ice cream cone!");
                    itemWon = "$5 off coupon";
                    System.out.print("You won a " + itemWon + "\n");
                    break;
                default:
                    //if scratchOffNumber >= 1521 || scratchOffNumber <= 1500 then System.out.print("Invalid input. Try again");
                    itemWon = "...Wait, you didn't win anyting. Invalid input. Try again.";
            }
        } while (scratchOffNumber >= 1501 && scratchOffNumber <= 1520);
    }
    
}
