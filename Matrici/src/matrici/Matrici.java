/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrici;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author pogliani.mattia
 */
public class Matrici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("matrici.txt"));
// pre-read in the number of rows/columns
        int rows = 0;
        int columns = 1;
        
        System.out.println("matrix has " + rows + " rows and " + columns + " columns");
        int[][] a = new int[rows][columns];

        input = new Scanner(new File("matrix.txt"));

        for () {
            for () {
                if (input.hasNextInt()) {
                    a[i][j] = input.;
                }
            }
        }
        
        for (int i = rows-1; i >=0; i--) {
            for (int j = columns-1; j >=0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}