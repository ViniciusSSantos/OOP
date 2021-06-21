package semana3;

public class ContaCorrente {
    double saldo;
    String nome;
    static int contas = 0;

    public ContaCorrente(String nome){
        this.nome = nome;
        contas++;
        
    }

    public ContaCorrente(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
        contas++;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTitular(){
        return nome;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true; 
        }

        return false;
    }

    public boolean sacar(double valor){

        if(saldo >= valor ){
            saldo -= valor;
            return true; 
        }

        return false;
    }

    public static boolean transferir(ContaCorrente de, ContaCorrente para, double valor){


        if(de.saldo < valor)
            return false;

        de.sacar(valor);
        para.depositar(valor);
        return true;
        
    }

    public static int getQuantidadeContas(){

        return contas;
    }

    
}
