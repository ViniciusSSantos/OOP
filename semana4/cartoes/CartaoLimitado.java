package semana4.cartoes;

public class CartaoLimitado extends CartaoCredito {

    @Override
    public boolean pagarComCredito(double valor){

        if(valor + divida > 200.00)
            return false;


        divida += valor;    
        return true;
        
        


    }
}
