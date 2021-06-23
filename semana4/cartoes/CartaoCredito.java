package semana4.cartoes;

public class CartaoCredito extends CartaoDebito {
    double divida = 0;

    public boolean pagarComCredito(double valor){
        divida += valor;    
        return true;
    }

    public void quitarCredito(double valor){
        if(valor > 0)
            divida -= valor;
    }
    
    public  double verificarExtrato(){
        return divida;
    }
}
