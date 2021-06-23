package semana4.quadrilateros;

public class Quadrado extends Retangulo {

    public void setLados(double ladoAB) {
        this.ladoAB = ladoAB;
    }

    @Override
    public double getPerimetro() {
        
        return 4*ladoAB;
    }
    @Override
    public String getPropriedades() {
        return super.getPropriedades() + " " + "Todos os lados tem o mesmo tamanho.";
    }
    
}
