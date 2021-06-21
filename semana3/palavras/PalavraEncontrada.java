package semana3.palavras;

public class PalavraEncontrada {
    String palavra;
    int[] posicao = new int[2];
    int tipo;
    int direcao;

    public String getPalavra(){
        return palavra;
    }

    public int[] getPosicao(){
        return posicao;
    }

    public int getTipo(){
        return tipo;
    }

    public int getDirecao(){
        return direcao;
    }
    
}
