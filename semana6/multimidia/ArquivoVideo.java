package semana6.multimidia;

public class ArquivoVideo extends ArquivoMultimidia {
    private int largura; 
    private int altura;

    public ArquivoVideo(String nomeArquivo, int largura, int altura){
        super(nomeArquivo);
        this.altura = altura;
        this.largura= largura; 
    }

    public String toString(){
        return String.format("Video: %s (%d x %d)", getNomeArquivo(),largura,altura);
    }

    
}
