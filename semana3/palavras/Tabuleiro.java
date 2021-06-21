package semana3.palavras;

public class Tabuleiro {

    char[][] matriz;

    private int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
    private int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };

    public Tabuleiro(char[][] matriz){
        this.matriz = matriz;        
    }

    public Tabuleiro(int qtdLinhas, int qtdColunas, char[] dadosMatriz){
        matriz = new char[qtdLinhas][qtdColunas];
        int k = 0;
        for(int i = 0; i < qtdLinhas; i++){
            for(int j = 0; j < qtdColunas; j++){
                this.matriz[i][j] = dadosMatriz[k];
                k++;
            }
        }
    }

    private int achaTipo(String Palavra, int lin, int col){

        
        for(int dir = 0; dir < 8; dir++){

            int i, linhaDir = lin + x[dir], colunaDir = col + y[dir];

            for( i = 1; i< Palavra.length(); i++){

                if(linhaDir >= matriz.length || linhaDir < 0 || colunaDir >= matriz[0].length || colunaDir < 0)
                    break;

                if(matriz[linhaDir][colunaDir] != Palavra.charAt(i))
                    break;

                linhaDir += x[dir];
                colunaDir += y[dir];
            }

            if(i == Palavra.length()){
                if(dir == 3 || dir == 4)
                    return 1;

                if(dir == 1 || dir == 6)
                    return 2;

                if(dir == 0 || dir == 2 || dir == 5 || dir == 7)
                    return 3;
            }
                

        }

        return 0;
    }


    private int achaDirecao(String Palavra, int lin, int col){

        
        for(int dir = 0; dir < 8; dir++){

            int i, linhaDir = lin + x[dir], colunaDir = col + y[dir];

            for( i = 1; i< Palavra.length(); i++){

                if(linhaDir >= matriz.length || linhaDir < 0 || colunaDir >= matriz[0].length || colunaDir < 0)
                    break;

                if(matriz[linhaDir][colunaDir] != Palavra.charAt(i))
                    break;

                linhaDir += x[dir];
                colunaDir += y[dir];
            }

            if(i == Palavra.length()){
                // linha
                if(dir == 4)
                    return 1;   

                if(dir == 3)
                    return 2;
                             
                //coluna
                if(dir == 6)
                    return 1;

                if(dir == 1)
                    return 2;               

                // diagonal
                if( dir == 2)
                    return 1;
                if(dir == 7)
                    return 2;
                if(dir == 5)
                    return 3;
                if(dir == 0)
                    return 4;
            }
        }

        return 0;
    }




    private boolean achaPalavra(String Palavra, int lin, int col){

        int len = Palavra.length();

        if (matriz[lin][col] != Palavra.charAt(0))
            return false;

        
        for(int dir = 0; dir < 8; dir++){

            int i, linhaDir = lin + x[dir], colunaDir = col + y[dir];

            for( i = 1; i < len; i++){

                if(linhaDir >= matriz.length || linhaDir < 0 || colunaDir >= matriz[0].length || colunaDir < 0)
                    break;

                if(matriz[linhaDir][colunaDir] != Palavra.charAt(i))
                    break;

                linhaDir += x[dir];
                colunaDir += y[dir];
            }

            if(i == len)
                return true;
        }

        return false;
    }

    public PalavraEncontrada buscar(String palavra){
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++) {
                if(achaPalavra(palavra, lin, col)){
                    PalavraEncontrada wordFound = new PalavraEncontrada();
                    wordFound.palavra = palavra;
                    wordFound.posicao[0] = lin;
                    wordFound.posicao[1] = col;
                    wordFound.tipo = achaTipo(palavra, lin, col);
                    wordFound.direcao = achaDirecao(palavra, lin, col);
                    return wordFound;
                }                    
            }
        }

        return null;
    }

    public PalavraEncontrada[] buscar(String[] palavras){
        int count = 0;
        int countVet = 0;
        for(int i = 0; i< palavras.length ; i++){
            if(buscar(palavras[i]) != null)
                count++;
        }
        PalavraEncontrada[] wordsFound = new PalavraEncontrada[count];

        for(int i = 0; i< palavras.length ; i++){
            if(buscar(palavras[i]) != null){
                wordsFound[countVet] = buscar(palavras[i]);
                countVet++;
            }
        }
        return wordsFound;
    }
}
