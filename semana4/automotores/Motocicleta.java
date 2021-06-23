package semana4.automotores;

public class Motocicleta extends Veiculo {
    boolean temCarroLateral;

    public void setTemCarroLateral(boolean temCarroLateral){
        this.temCarroLateral= temCarroLateral;
    }

    public boolean getTemCarroLateral(){
        return temCarroLateral;
    }

    @Override
    public String getTipo(){
        return "Motocicleta modelo " + modelo;
    }
    
}
