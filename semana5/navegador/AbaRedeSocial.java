package semana5.navegador;

public class AbaRedeSocial extends AbaNavegador {
    String post;
    
    public void postar(String texto){
        this.post = "Post: " + texto;
        historico[countHist] = post;
        countHist++;
    }


    @Override
    public String getTipo() {
        return "RedeSocial";
    }
}
