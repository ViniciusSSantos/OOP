package semana7.dispositivos;

public class Gerenciador {
    DispositivoInteligente[] dispositivos = new  DispositivoInteligente[10];
    int count = 0;

    public void adicionarDispositivo(DispositivoInteligente d){
        dispositivos[count] = d;
        count++;
    }

    public void ligarTodosDispositivos(){
        for(int i = 0; i < count; i++){
            dispositivos[i].ligar();            
        }        
    }

    public void desligarTodosDispositivos(){
        for(int i = 0; i < count; i++){
            dispositivos[i].desligar();            
        }       
    }
    
}

abstract class DispositivoInteligente {
    boolean estado = false;

    public void ligar(){
        this.estado = true;
    }

    public void desligar(){
        this.estado = false;
    }

    public boolean getEstado(){
        return this.estado;
    }    
}

class LampadaInteligente extends DispositivoInteligente {}

class TomadaInteligente extends DispositivoInteligente {    
}
class InterruptorInteligente extends DispositivoInteligente{    
}


