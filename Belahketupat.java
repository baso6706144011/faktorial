/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belahketupat;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Belahketupat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Masukkan Bilangan : ");
    int size = new Scanner(System.in).nextInt();
        
    for (int i = 1; i < size; i += 2) {
        for (int k = size; k >= i; k -= 2) {
            System.out.print("0");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        for (int k = size; k >= i; k -= 2) {
            System.out.print("0");
        }
        System.out.println();
    }// end loop

    for (int i = 1; i <= size; i += 2) {
        for (int k = 1; k <= i; k += 2) {
            System.out.print("0");
        }
        for (int j = size; j >= i; j--) {
            System.out.print("*");
        }
        for (int k = 1; k <= i; k += 2) {
            System.out.print("0");
        }
        
        
        1111111111111111
        System.out.println();
    }// end loop
    }
    
}
