/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author Tugce Kocak
 */
public class soru6 {

    static boolean birimMatrisMi(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if (i == j && matris[i][j] != 1) {
                    return false;
                } else if (i != j && matris[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matris={{1,0,0},
                        {0,2,0},
                        {4,0,1}};
        System.out.println(birimMatrisMi(matris));
    }
}
