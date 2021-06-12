package semana2;

import dispositivos.LampadaInteligente;

public class GerenciadorLampadas {
    private int contador = 0;
    private LampadaInteligente[] lampadas = new LampadaInteligente[10];

    public void adicionarLampada(){        
        if(contador < 10){
            lampadas[contador] = new LampadaInteligente();            
            contador++;
        }
    }

    public void ligarLampada(int indiceLampada){
        if(lampadas[indiceLampada].getEstado() == false) lampadas[indiceLampada].ligar();
    }

    public void desligarLampada(int indiceLampada){
        if(lampadas[indiceLampada].getEstado()) lampadas[indiceLampada].desligar();
    }

    public void ligarTodasLampadas(){

        for(int i = 0; i < contador; i++){
            if(lampadas[i].getEstado() == false){
                lampadas[i].ligar();                
            }
        }      
    }

    public void desligarTodasLampadas(){
        for(int i = 0; i < contador; i++){
            if(lampadas[i].getEstado()){    
                lampadas[i].desligar();                    
            }
        }
    }
}
