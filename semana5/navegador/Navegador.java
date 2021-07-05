package semana5.navegador;

public class Navegador {
    private int count = 0;    
    private int limiteAbas;
    private AbaNavegador[] abasAbertas;

    public Navegador(int limiteAbas){
        this.limiteAbas = limiteAbas;
        abasAbertas = new AbaNavegador[limiteAbas];
        for(int i = 0; i < limiteAbas; i++){
            abasAbertas[i] = null;
        }
    }

    public AbaNavegador abrirAba(int tipo, String Titulo){

        if(count >= limiteAbas)
            return null;

        if(tipo == 1){
            AbaBuscador abaNova = new AbaBuscador();
            abaNova.titulo = Titulo;
            insere(abaNova);
            count++;
            return abaNova;
        }

        if(tipo == 2){
            AbaRedeSocial abaNova = new AbaRedeSocial();
            abaNova.titulo = Titulo;
            insere(abaNova);
            count++;
            return abaNova; 
        }

        return null;

    }

    public void fecharAba(AbaNavegador aba){

        for(int i = 0; i < limiteAbas; i++){
            if(abasAbertas[i] == aba){
                count--;

                for(int k = i; k< limiteAbas-1; k++){
                    abasAbertas[k] = abasAbertas[k+1];
                }

                abasAbertas[limiteAbas-1]= null;
                break;          
            }
        }
    }

    public String[] getAbas(){
        String[] abas = new String[count];

        for(int i = 0; i<count; i++){
            abas[i] = abasAbertas[i].getTipo() + " " + abasAbertas[i].getTitulo();
        }        
        return abas;
    }

    public String[] getHistorico(){
        String[] historico = new String[AbaNavegador.countHist];
        for(int i = 0; i <AbaNavegador.countHist; i++){
            historico[i] = AbaNavegador.historico[i];
        }
        
        return historico;
    }

    private void insere(AbaNavegador aba){
        for(int i = 0; i<limiteAbas; i++){
            if(abasAbertas[i]==null){
                abasAbertas[i] = aba;
                break;
            }
        }
        
    }

}
