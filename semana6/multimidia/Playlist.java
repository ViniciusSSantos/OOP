package semana6.multimidia;

public class Playlist implements Cloneable {
    private ArquivoMultimidia[] playlist;
    private int count = 0;

    public Playlist(){
        playlist = new ArquivoMultimidia[100];
        
    }

    public void adicionarItem(ArquivoMultimidia arquivo){
        playlist[count] = arquivo;
        count++;
    }

    public void renomearItem(int indiceArquivo, String novoNomeArquivo){
        playlist[indiceArquivo].setNomeArquivo(novoNomeArquivo);
    }

    public void moverParaInicio(int indiceArquivo){
        ArquivoMultimidia item = playlist[indiceArquivo];
        for(int i = indiceArquivo; i >= 1; i--){
            playlist[i] = playlist[i-1];
        }

        playlist[0] = item;
        
    }

    public String[] listarArquivos(){
        String[] nomes = new String[count];
        for(int i =0; i<count;i++){
            nomes[i] = playlist[i].getNomeArquivo();
        }

        return nomes;


    }    


    @Override
    public Playlist clone() throws CloneNotSupportedException{
        Playlist novaPlaylist = (Playlist)super.clone();
        novaPlaylist.playlist = this.playlist.clone();        
        
        for (int i = 0; i <= this.count; i++){
            if (this.playlist[i] != null){
                novaPlaylist.playlist[i] = this.playlist[i].clone();;
            }
        }            
        return novaPlaylist;
    }

}

 