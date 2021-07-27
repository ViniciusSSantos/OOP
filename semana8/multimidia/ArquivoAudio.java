package semana8.multimidia;

public class ArquivoAudio extends ArquivoMultimidia {
   private boolean audioHD;

    public ArquivoAudio(String nomeArquivo, int tamanho, boolean audioHD){
        super(nomeArquivo, tamanho);
        this.audioHD = audioHD;
   }
   public String toString(){
        return String.format("Audio: %s (%d)", getNomeArquivo(), getTamanhoArquivo());
   }
    
}
