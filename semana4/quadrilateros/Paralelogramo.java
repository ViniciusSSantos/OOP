package semana4.quadrilateros;

public class Paralelogramo extends Quadrilatero {
    
    public void setLados(double ladoAB, double ladoBC) {
        this.ladoAB = ladoAB;
        this.ladoBC = ladoBC;
    }
    @Override
    public double getPerimetro() {
        return 2*super.getPerimetro();
    }

    @Override
    public String getPropriedades() {
        return super.getPropriedades() + " " + "Lados opostos paralelos.";
    }
}
