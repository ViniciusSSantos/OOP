package semana5.navegador;

public class AbaBuscador extends AbaNavegador {
    String busca;
    
    public void buscar(String expressao){
        this.busca = "Busca: " + expressao;
        historico[countHist] = busca;
        countHist++;
    }

    @Override
    public String getTipo() {
        return "Buscador";
    }

    
}
