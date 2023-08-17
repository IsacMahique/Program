/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testegit;

/**
 *
 * @author Kito Mahique
 */
public class TesteGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ola, estou testando meu github");
        int n[][]= {{11, 22, 13, 34, 35}, {36, 34, 38, 39, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}};
        
        //impressao de toda matriz
        for (int l=0; l<n.length; l++){
            for (int c=0; c<n[0].length; c++){
                System.out.print(n[l][c]+"  ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        System.out.println("Diagonal principal \n");
        //impressao da diagonal principal
        for (int l=0; l<n.length; l++){
            for (int c=0; c<n[0].length; c++){
                if (l==c){
                    System.out.print(n[l][c] + "  ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
    }
        
    
}
}
