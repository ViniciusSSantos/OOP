package semana1;

import java.util.*;

public class CampoMinado {

    public static void checaBomba(int[][] matriz, int posLin, int posCol){
        int bombas = 0;

        //canto superior esquerdo
        if(posLin == 0 && posCol == 0){
            if(matriz[posLin][posCol+1] == 1) bombas++;
            if(matriz[posLin+1][posCol+1] == 1) bombas++;
            if(matriz[posLin+1][posCol] == 1) bombas++;           
        }

        //canto superior direito
        if(posLin == 0 && posCol == matriz[0].length-1){
            if(matriz[posLin][posCol-1] == 1) bombas++;
            if(matriz[posLin+1][posCol-1] == 1) bombas++;
            if(matriz[posLin+1][posCol] == 1) bombas++;
        }

        // canto inferior esquerdo
        if(posLin == matriz.length-1 && posCol == 0){
            if(matriz[posLin-1][posCol] == 1) bombas++;
            if(matriz[posLin-1][posCol+1] == 1) bombas++;
            if(matriz[posLin][posCol+1] == 1) bombas++;
        }


        //canto inferior direito
        if(posLin == matriz.length-1 && posCol == matriz[0].length-1){
            if(matriz[posLin][posCol-1] == 1) bombas++;
            if(matriz[posLin-1][posCol-1] == 1) bombas++;
            if(matriz[posLin-1][posCol] == 1) bombas++;
        }

        //primeira coluna excluindo os cantos
        if((posLin > 0 && posLin < matriz.length-1) && posCol == 0){
            if(matriz[posLin-1][posCol] == 1) bombas++;
            if(matriz[posLin+1][posCol] == 1) bombas++;
            if(matriz[posLin-1][posCol+1] == 1) bombas++;
            if(matriz[posLin][posCol+1] == 1) bombas++;
            if(matriz[posLin+1][posCol+1] == 1) bombas++;
        }

        //ultima coluna excluindo os cantos
        if((posLin > 0 && posLin < matriz.length-1) && posCol == matriz[0].length-1){

            if(matriz[posLin-1][posCol-1] == 1) bombas++;
            if(matriz[posLin][posCol-1] == 1) bombas++;
            if(matriz[posLin+1][posCol-1] == 1) bombas++;
            if(matriz[posLin-1][posCol] == 1) bombas++;
            if(matriz[posLin+1][posCol] == 1) bombas++;
        }

        // primeira linha excluindo os cantos 
        if(posLin == 0 && (posCol > 0 && posCol < matriz[0].length-1)){
            if(matriz[posLin][posCol-1] == 1) bombas++;
            if(matriz[posLin+1][posCol-1] == 1) bombas++;
            if(matriz[posLin+1][posCol] == 1) bombas++;
            if(matriz[posLin+1][posCol+1] == 1) bombas++;
            if(matriz[posLin][posCol+1] == 1) bombas++;
        }

        // ultima linha excluindo os cantos
        if(posLin == matriz.length-1 && (posCol > 0 && posCol < matriz[0].length-1)){

            if(matriz[posLin][posCol-1] == 1) bombas++;
            if(matriz[posLin-1][posCol-1] == 1) bombas++;            
            if(matriz[posLin-1][posCol] == 1) bombas++;
            if(matriz[posLin-1][posCol+1] == 1) bombas++;
            if(matriz[posLin][posCol+1] == 1) bombas++;
        }

        // casos restantes
        if((posLin > 0 && posLin < matriz.length-1) && (posCol > 0 && posCol < matriz[0].length-1)){
            if(matriz[posLin-1][posCol-1] == 1) bombas++;
            if(matriz[posLin][posCol-1] == 1) bombas++;
            if(matriz[posLin+1][posCol-1] == 1) bombas++;
            if(matriz[posLin-1][posCol] == 1) bombas++;
            if(matriz[posLin+1][posCol] == 1) bombas++;
            if(matriz[posLin-1][posCol+1] == 1) bombas++;
            if(matriz[posLin][posCol+1] == 1) bombas++;
            if(matriz[posLin+1][posCol+1] == 1) bombas++;    
        }    

        System.out.println(bombas);
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

        int posLin = leitor.nextInt();
        int posCol = leitor.nextInt();

        checaBomba(matriz, posLin, posCol);

    }

    

}