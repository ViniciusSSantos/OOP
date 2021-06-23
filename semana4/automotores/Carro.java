package semana4.automotores;

public class Carro extends Veiculo{

    int nPortas;

    public void setNumeroPortas(int nPortas){
        this.nPortas = nPortas;
    }

    public int getNumeroPortas(){
        return nPortas;
    }

    @Override
    public String getTipo(){
        return "Carro modelo " + modelo;
    }
}
