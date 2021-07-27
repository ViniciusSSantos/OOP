package semana8.multimidia;

public class Playlist{
    private ArquivoMultimidia[] playlist;
    private int count = 0;

    public Playlist(){
        playlist = new ArquivoMultimidia[10];       
        
    }

    public void adicionarItem(ArquivoMultimidia arquivo) throws QuantidadeLimiteArquivos{
        if(count >= 10){
            throw new QuantidadeLimiteArquivos();
        }
        playlist[count] = arquivo;
        count++;
    }

    public void renomearItem(int indiceArquivo, String novoNomeArquivo) throws IndiceArquivoInvalido{
        if(indiceArquivo < 0 || indiceArquivo > count-1){
            throw new IndiceArquivoInvalido(String.format("Indice de arquivo invalido = %d", indiceArquivo));
        }        
        playlist[indiceArquivo].setNomeArquivo(novoNomeArquivo);
    }

    public void moverParaInicio(int indiceArquivo) throws IndiceArquivoInvalido{
        if(indiceArquivo < 0 || indiceArquivo > count-1){
            throw new IndiceArquivoInvalido(String.format("Indice de arquivo invalido = %d", indiceArquivo));
        }  

        ArquivoMultimidia item = playlist[indiceArquivo];
        for(int i = indiceArquivo; i >= 1; i--){
            playlist[i] = playlist[i-1];
        }
        playlist[0] = item;        
    }

    public String[] listarArquivos(){
        String[] nomes = new String[count];
        for(int i =0; i<count;i++){
            nomes[i] = playlist[i].toString();
        }
        return nomes;
    }
    
    public void ordenarArquivos(int tipo){
        if(tipo == 1){
            for(int i = 0; i<this.count-1; i++){
                for(int j = i+1; j< this.count; j++){
                    if(playlist[i].getNomeArquivo().compareTo(playlist[j].getNomeArquivo()) >0){
                        ArquivoMultimidia temp = playlist[i];
                        playlist[i] = playlist[j];
                        playlist[j] = temp;                      
                    }
                }
            }
        }

        else{
            for(int i = 0; i<this.count-1; i++){
                int index = i;
                for(int j =i+1; j< this.count; j++){
                    if(playlist[j].getTamanhoArquivo() < playlist[index].getTamanhoArquivo()){
                        index = j;
                    }
                }
                ArquivoMultimidia temp = playlist[index];
                playlist[index] = playlist[i];
                playlist[i] = temp;
            }
        }
    }
    
}

class QuantidadeLimiteArquivos extends Exception{
    public QuantidadeLimiteArquivos(){
        super("Quantidade limite de arquivos foi atingida.");
    }    
}

class IndiceArquivoInvalido extends Exception{
    public IndiceArquivoInvalido(String err){        
        super(err);
    }    
}