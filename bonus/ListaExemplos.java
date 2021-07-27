package bonus;

public class ListaExemplos {
    int maxQtd;
    Exemplo[] exemplos;
    int count=0;
    public ListaExemplos(int maxQtd){
        this.maxQtd = maxQtd;
        this.exemplos = new Exemplo[maxQtd];
    }

    public void adicionarExemplo(Exemplo exemplo){
        exemplos[count] = exemplo;
        count++;
    }
    public void ordenarPelaDistancia(double[] atributosEntrada){
        insereDistancia(atributosEntrada);
        ordenaExemplos();      
    }

    public int getQtdExemplos(){
        return this.count;
    }

    public Exemplo[] getExemplos(){
        return exemplos;
    }

    public Exemplo[] getPrimeirosExemplos(int n){
        Exemplo[] primeiros = new Exemplo[n];

        for(int i = 0; i < n; i++){
            primeiros[i] = exemplos[i];
        }

        return primeiros;
        
    }

    public Exemplo[] getUltimosExemplos(int n){

        Exemplo[] ultimos = new Exemplo[n];

        for(int i = 0; i < n; i++){
            
                ultimos[i] = exemplos[(count-n)+i];
            
        }
        return ultimos;
    }

    private double calculaDistancia(double[] atributosEntradaX, double[] atributosEntradaY){
        double dist =0;
        for(int i = 0; i < atributosEntradaX.length; i++){            
            dist += Math.pow(atributosEntradaX[i]-atributosEntradaY[i], 2);
        }
        
        return Math.sqrt(dist);
    }  

    private void insereDistancia(double[] atributosEntrada){
        for(int i = 0; i < count; i++){
            exemplos[i].setDistancia(calculaDistancia(exemplos[i].getAtributosEntrada(), atributosEntrada));
        }
    }

    private void ordenaExemplos(){
        for(int i = 0; i<this.count-1; i++){
            int index = i;
            for(int j =i+1; j< this.count; j++){
                if(exemplos[j].getDistancia() < exemplos[index].getDistancia()){
                    index = j;
                }
            }
            Exemplo temp = exemplos[index];
            exemplos[index] = exemplos[i];
            exemplos[i] = temp; 
        }
    }

}

class Exemplo{
    double[] atributosEntrada;
    int rotuloClasse;
    double distancia;

    public Exemplo(double[] atributosEntrada, int rotuloClasse){
        this.atributosEntrada = atributosEntrada;
        this.rotuloClasse = rotuloClasse;
    }

    public double[] getAtributosEntrada(){
        return this.atributosEntrada;
    }

    public int getRotuloClasse(){
        return this.rotuloClasse;
    }

    public void setDistancia(double distancia){
        this.distancia = distancia;

    }

    public double getDistancia(){
        return this.distancia;
    }

}


