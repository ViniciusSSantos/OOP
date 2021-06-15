package semana2;


public class OperacoesStrings {

    String texto;
    

    public void setTexto(String texto){        
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }
    
    public int contaPalavras(){

                
        int numPalavra= 0;
        int separator=0;
        int i = 0;
        while (i < texto.length()){
            
            if(texto.charAt(i) == ' ' || texto.charAt(i) == '\n'|| texto.charAt(i) == '\t')
                separator = 0;
                 
                  
            else if (separator == 0){
                separator = 1;
                if(texto.charAt(i) != '.')
                    numPalavra++;
            }
      
            i++;
        }
        return numPalavra;
    }

    public double comprimentoMedioPalavras(){

        int numPalavras = contaPalavras();
        int letras=0;

        char[] caracteres = texto.toCharArray();
        for(int i = 0; i< caracteres.length; i++){
            if(Character.isLetter(caracteres[i])){
                letras++;
            }
        }

        double media = (double) letras/numPalavras;

        return media;
    }

    public String maiorPalavra(){

        int size = comprimentoMaiorPalavra();
        String palavraMax;

        int letras = 0;
        int indice = 0;
        char[] caracteres = texto.toCharArray();
        char[] palavraMaxChar = new char[size];
        

        if(contaPalavras() == 1){
            System.arraycopy(caracteres, 0, palavraMaxChar, 0, size);
            palavraMax = String.valueOf(palavraMaxChar);
            return palavraMax;
        }
            
        for(int i = 0; i< caracteres.length; i++){
            if(Character.isWhitespace(caracteres[i])){
                if(letras == size)
                    indice = i;
                    letras=0;
            }

            if(Character.isLetter(caracteres[i])){
                letras++;
            }
        }

            System.arraycopy(caracteres, indice - size, palavraMaxChar, 0, size);

           

        palavraMax = String.valueOf(palavraMaxChar);

        return palavraMax;



    }

    public int comprimentoMaiorPalavra(){
        int max = 0;
        int letras = 0;
        int end = texto.length()-1;


        for(int i = 0; i< texto.length(); i++){
            if(texto.charAt(i) == ' ' || texto.charAt(i) == '\n'|| texto.charAt(i) == '\t' || i == end){
                if(letras > max)
                    max = letras;
                    letras=0;
            }

            else
                letras++;
        }

        if(contaPalavras() == 1)
            return max+1;
        return max;
    }

}
