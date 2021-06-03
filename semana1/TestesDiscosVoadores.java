package semana1;

import java.util.*;


public class TestesDiscosVoadores{

    public static void printaMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println("");
        }


    }

    
    

    public static void arrumaMatriz(int[][] matriz){
        // ordena as linhas
        for(int i = 0; i < matriz.length; i++){
            int k = 0;
            int min  = i;
            for (int j = i+1; j < matriz.length; j++){
                if(matriz[j][k] == matriz[min][k]) k++;

                if(matriz[j][k] < matriz[min][k]){
                    min = j;
                }
            }

            int[] tempLin = matriz[i].clone();
            matriz[i] = matriz[min];
            matriz[min] = tempLin;              

            
        }
        printaMatriz(matriz);

        //ordena as colunas
       /*  for (int i = 0; i < matriz[0].length-1; i++) {
            for (int j = 0; j < matriz[0].length-i-1; j++) {
                int t = 0; 
                if(matriz[t][j] == matriz[t][j+1]) t++;
   
               if (matriz[t][j] > matriz[t][j+1]) {
   
                  for (int k = 0; k < matriz.length; k++) {
                  int tmp = matriz[k][j];
                  matriz[k][j] = matriz[k][j+1];
                  matriz[k][j+1]=tmp;
                  }
              }
          }
       } */
       System.out.println("");
        
            
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