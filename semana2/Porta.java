package semana2;

public class Porta {
    public boolean aberta = true;
    public String nome = "Porta sem nome";

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean estaAberta(){
        if(aberta) return true;
        else return false;
    }

    public int abrir(){

        if(aberta)
            return 1;
        
        aberta = true;
        return 0;
    }

    public int fechar(){

        if(aberta == false)
            return 1;
        
        aberta = false;
        return 0;
    } 
}
