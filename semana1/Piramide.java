package semana1;

import java.util.*;

public class Piramide {
    public static void main(String[] args) {
        int j = 0;
        Scanner leitor = new Scanner(System.in);
		    int n = leitor.nextInt();
        //loop externo que cria as n linhas
        for (int i = 1; i <= n; ++i, j = 0) {
          //cria os espacos/traços a direita do 1. Diminui baseado no loop externo
          for (int k = 1; k <= n - i; k++) {
            System.out.print("-");
          }
          // printa os 1's de acordo com a linha que estamos
          while (j != 2 * i - 1) {
            System.out.print("1");
                   
            j++;
          }
          //cria os espacos/traços a esquerda do 1
          for (int k = 1; k <= n - i; k++) {
            System.out.print("-");
          } 
          //quebra a linha
          System.out.println();
        }
      }
    }
