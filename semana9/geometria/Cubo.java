package semana9.geometria;

public class Cubo implements Comparable<Cubo>{
    double lado;

    public Cubo(double lado){
        this.lado = lado;
    }

    public double area(){
        double pot = Math.pow(lado, 2);
        return 6*(pot);
    }

    @Override
    public int compareTo(Cubo c){

        return (int)(this.area() - c.area());
    }

    public String toString(){
        return String.format("cubo de area %.1f", area());
    }


}
