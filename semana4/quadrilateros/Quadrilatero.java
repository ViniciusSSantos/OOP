package semana4.quadrilateros;

public class Quadrilatero {
    double ladoAB;
    double ladoBC;
    double ladoCD;
    double ladoDA;

   public void setLados(double ladoAB, double ladoBC, double ladoCD, double ladoDA){
    this.ladoAB = ladoAB;
    this.ladoBC = ladoBC;
    this.ladoCD = ladoCD;
    this.ladoDA = ladoDA;
    }

    public double getPerimetro(){
        return ladoAB+ladoBC+ladoCD+ladoDA;
    }

    public String getPropriedades(){
        return "Figura de quatro lados.";
    }
    
}
