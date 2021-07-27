package semana8;

public class GerenciadorLampadas{
    LampadaInteligente[] dispositivos = new LampadaInteligente[10];
    int count = 0;

    public void adicionarLampada(){
        LampadaInteligente lampada = new LampadaInteligente();
        dispositivos[count] = lampada;
        count++;
    }

    public void ligarLampada(int indiceLampada) throws LampadaEstaLigada{
        if(dispositivos[indiceLampada].getEstado() == true){
            throw new LampadaEstaLigada();
        }
        dispositivos[indiceLampada].ligar();        
    }

    public void desligarLampada(int indiceLampada) throws LampadaEstaDesligada{
        if(dispositivos[indiceLampada].getEstado() == false){
            throw new LampadaEstaDesligada();
        }
        dispositivos[indiceLampada].desligar();
    }
}

class LampadaEstaLigada extends Exception{
    public LampadaEstaLigada(){
        super("A lampada ja esta ligada.");
    }    
}

class LampadaEstaDesligada extends Exception{
    public LampadaEstaDesligada(){
        super("A lampada ja esta desligada.");
    }
}

