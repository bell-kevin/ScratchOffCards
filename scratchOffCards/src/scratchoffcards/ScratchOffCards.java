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
        System.out.print("Scratch-off Card Results by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        int scratchOffNumber;
        String itemWon = "";
        do {
            System.out.print("What is your scratch-off number? ");
            scratchOffNumber = computerKeyboardInput.nextInt();
            switch (scratchOffNumber) {
                case 1508:
                case 1515:
                case 1516:
                    itemWon = "hamburger";
                    break;
                case 1511:
                    itemWon = "meal";
                    break;
                case 1505:
                case 1510:
                case 1513:
                case 1514:
                case 1519:
                    itemWon = "small drink";
                    break;
                case 1503:
                case 1504:
                case 1506:
                case 1509:
                case 1517:
                    itemWon = "ice cream cone";
                    break;
                case 1501:
                case 1507:
                case 1512:
                case 1520:
                    itemWon = "$1 off coupon";
                    break;
                case 1502:
                case 1518:
                    itemWon = "$5 off coupon";
                    break;
                default:
                    System.out.println("...Wait, you didn't win anyting. Invalid input. Try again");
                    break;
            }
        } while (scratchOffNumber < 1501 || scratchOffNumber > 1520);
        System.out.print("You won a " + itemWon + "\n");
    }
}
