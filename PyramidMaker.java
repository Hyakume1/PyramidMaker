/**This project will take input of a pyramid's length (base) and will create it accordingly
 * ____                            _     _   __  __       _
 * |  _ \ _   _ _ __ __ _ _ __ ___ (_) __| | |  \/  | __ _| | _____ _ __
 * | |_) | | | | '__/ _` | '_ ` _ \| |/ _` | | |\/| |/ _` | |/ / _ \ '__|
 * |  __/| |_| | | | (_| | | | | | | | (_| | | |  | | (_| |   <  __/ |
 * |_|    \__, |_|  \__,_|_| |_| |_|_|\__,_| |_|  |_|\__,_|_|\_\___|_|
 *        |___/
 *
 * developer:Hyakume1
 */

package com.company;

import java.util.Scanner;

public class PyramidMaker {

    static int pyramidBase;
    static int rows;
    static int times; // number of times a symbol is repeated
    static char symbol; //character you want repeated;

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("What's the length of the base? ");
        pyramidBase = input.nextInt();

        System.out.println("what symbol will you use?");
        symbol = input.next().charAt(0);

         if (pyramidBase % 2 == 0){ //if base is even, the top has 2 symbols
             rows = pyramidBase / 2; //half length of the pyramid
             times = 2;
         }
         else{ //if odd, it has only one
             rows = pyramidBase / 2; //since the pyramid has one symbol on top, if you cut the shape in half, while keeping the one ton top, you use this formula for the new base
             times = 1;
         }

        for(int i = 0; i <= rows; i++){
            System.out.print(" ".repeat(rows- i)); //if you cut the pyramid in half, the amount of spaces is the base - the number of characters in that row
            System.out.printf(String.valueOf(symbol).repeat(times).concat("\n")); // base is even so i have to keep adding 2 until i get to the base number
            times += 2;
        }
    }
}
