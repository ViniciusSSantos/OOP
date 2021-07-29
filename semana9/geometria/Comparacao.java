package semana9.geometria;


public class Comparacao {
    public static <T extends Comparable<T>> T maiorElemento(T[] v){
        T maior = v[0];

        for(int i = 0; i< v.length-1; i++){
            if(v[i+1].compareTo(v[i]) > 0){
                maior = v[i+1];
            }
        }


        return maior;

    } 

    public static <T extends Comparable<T>> T menorElemento(T[] v){
        T menor = v[0];

        for(int i = 0; i< v.length-1; i++){
            if(v[i+1].compareTo(v[i]) < 0){
                menor = v[i+1];
            }
        }




        return menor;
    }

    
}
