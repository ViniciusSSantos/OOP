package semana6.multimidia;

public class ArquivoAudio extends ArquivoMultimidia {
   private boolean audioHD;

    public ArquivoAudio(String nomeArquivo, boolean audioHD){
        super(nomeArquivo);
        this.audioHD = audioHD;
   }
   public String toString(){
        return String.format("Audio: %s (HD = %s)", getNomeArquivo(), audioHD);
   }
    
}
