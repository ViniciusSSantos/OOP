package semana1;

import java.util.*;

public class ComparaVetores {

    public static int mdc(int a, int b){
        if (a == 0)
            return b;
        return mdc(b % a, a);
    }

    public static int mdcVec(Vector<Integer> vetorB)
    {
        int res = 0;
        for (int elemento: vetorB){
            res = mdc(res, elemento);
 
            if(res == 1){
               return 1;
            }
        }
 
        return res;
    }


    public static void compara(Vector<Integer> vetorA, Vector<Integer> vetorB){
        int mdcA= mdcVec(vetorA);
        int mdcB = mdcVec(vetorB);
        int sum = 0;
        for(int i = 0; i <vetorA.size(); i++){
            if(vetorA.get(i) == mdcA*vetorB.get(i) || mdcB*vetorA.get(i) == vetorB.get(i)){ 
                sum++;
            }
        }

        if(vetorA.size() == sum){
            System.out.println("SIM");
        }
        else
            System.out.println("NAO");
    }
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();

        Vector<Integer> vetorA = new Vector<Integer>(n);
        Vector<Integer> vetorB = new Vector<Integer>(n);

        for(int i =0; i< n; i++){            
            int num = leitor.nextInt();
            vetorB.add(num);
        }

        for(int i =0; i< n; i++){            
            int num = leitor.nextInt();
            vetorA.add(num);
        }

        
        
       
        compara(vetorA, vetorB);


    }
}