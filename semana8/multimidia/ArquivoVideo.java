package semana8.multimidia;

public class ArquivoVideo extends ArquivoMultimidia {
    private int largura; 
    private int altura;

    public ArquivoVideo(String nomeArquivo, int tamanho, int largura, int altura){
        super(nomeArquivo, tamanho);
        this.altura = altura;
        this.largura = largura; 
    }

    public String toString(){
        return String.format("Video: %s (%d)", getNomeArquivo(), getTamanhoArquivo());
    }

    
}
