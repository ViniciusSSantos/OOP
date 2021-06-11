package semana1;
//https://stackoverflow.com/questions/20861476/sorting-a-matrix-by-rows-in-java

import java.util.*;


public class TestesDiscosVoadores{

    public static void printaMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                if(j < matriz[0].length-1) System.out.print(matriz[i][j] + " ");
                else System.out.print(matriz[i][j]);               
            }
            System.out.println("");
        }
    }

    

    public static int[][] transposeNaoQuad(int[][] matriz){

        int[][] transp = new int[matriz[0].length][matriz.length];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                transp[j][i] = matriz[i][j];
            }
        }

        return transp;



    }

    public static void Bubble(int[][] matriz){

        
        
        if(matriz[0].length == 1){
            for(int i = 0; i < matriz.length; i++){
                for(int j = i; j < matriz.length; j++){
                    if(matriz[i][0] > matriz[j][0]){
                        int[] temp = matriz[j].clone();
                        matriz[j] = matriz[i].clone();
                        matriz[i] = temp.clone();
                    }
                }
            }


        }
            //ordena matriz da ultima coluna para a primeira com bubble
            for(int c = matriz[0].length - 1; c >= 0; c--){
                for(int i = 0; i < matriz.length; i++){
                    for(int j = i; j < matriz.length; j++){
                        if(matriz[i][c] > matriz[j][c]){
                            int[] temp = matriz[j].clone();
                            matriz[j] = matriz[i].clone();
                            matriz[i] = temp.clone();
                        }
                    }
                }
            }
    }

    

   public static void arrumaMatriz(int[][] matriz){

        if(matriz[0].length == 1){
            Bubble(matriz);
            printaMatriz(matriz);
            System.out.println();
            printaMatriz(matriz);
        }

        else{
            Bubble(matriz);
            printaMatriz(matriz);
            System.out.println();

            //coluna
            int[][] transp1 = transposeNaoQuad(matriz);
            Bubble(transp1);
            int[][] transp2 = transposeNaoQuad(transp1);
            printaMatriz(transp2);

           
    
    


        }

    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int lin = leitor.nextInt();
        int col = leitor.nextInt();
        int[][] matriz = new int[lin][col];

        for(int i = 0; i < lin; i++){
            for(int j = 0; j < col; j++){
                matriz[i][j] = leitor.nextInt();
            }
        }

        arrumaMatriz(matriz);
        
        
        
    }
}