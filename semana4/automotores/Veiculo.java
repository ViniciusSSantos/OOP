package semana4.automotores;

public class Veiculo {
    String modelo;

    public void setModelo( String modelo){
        this.modelo = modelo;
    }

    public String getTipo(){
        return "Veiculo generico modelo " + modelo;
    }
    
}
