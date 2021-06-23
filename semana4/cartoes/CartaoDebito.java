package semana4.cartoes;

public class CartaoDebito {
    String titular;
    double saldo = 0;    

    public void setTitular(String titular){
        this.titular = titular;

    }

    public void adicionarSaldoDebito(double valor){
        saldo += valor;
    }

    public double verificarSaldoDebito(){
        return saldo;
    }
    
    public boolean pagarComDebito(double valor){

        if(saldo >= valor ){
            saldo -= valor;
            return true; 
        }

        return false;

    }
}
