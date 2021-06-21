package semana3;

public class Paralelogramo {
    int ladoA;
    int ladoB;
    String tipo;

    public Paralelogramo(int ladoA){
        this.ladoA = ladoA;
    }

    public Paralelogramo(int ladoA, int ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public int getArea(){

        if(getTipo() == "Paralelogramo quadrado"){
            int area = ladoA*ladoA;
            return area;
        }
        else{
            int area = ladoA*ladoB;
            return area;
        }        
    }

    public String getTipo(){
        if(ladoB ==  0|| ladoA == ladoB){
            tipo = "Paralelogramo quadrado";
            return tipo;
        }

        else{
            tipo ="Paralelogramo retangulo";
            return tipo;

        }

    }
    
    
}
