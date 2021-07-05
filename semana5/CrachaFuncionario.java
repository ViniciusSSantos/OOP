package semana5;

public class CrachaFuncionario extends Cracha {
    String cargo;
    int m, a;


    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void setDataAdmissao(int m, int a){
        this.m = m;
        this.a = a;
    }


    @Override
    public void imprimir(){
        Impressao.imprimirLinha("FUNCIONARIO");
        Impressao.imprimirLinha("Nome: " + nome);
        Impressao.imprimirLinha("Cargo: " + cargo);
        Impressao.imprimirLinha("Admissao: " + String.valueOf(m) + "/" + String.valueOf(a));
    }

    
}
