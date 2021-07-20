package semana7.chat;
public abstract class Mensagem {
    int likes = 0;
    boolean isAnswer = false;
    Mensagem answerTo = null;

    public void like(){
        likes++;
    }

    public void responder(Mensagem resposta){
        resposta.isAnswer = true;
        resposta.answerTo = (this);
    }

    public abstract String getRepresentacao();
    public abstract String getRepresentacao2();    
}

class MensagemTexto extends Mensagem{
    String texto;

    public MensagemTexto(String texto){
        this.texto = texto;
    }


    @Override
    public String getRepresentacao() {
        if((this).isAnswer){
            return String.format("%s RESPOSTA A [%s] (likes=%d)", this.texto, (this).answerTo.getRepresentacao2(), likes);
        }
        else{
            return String.format("%s (likes=%d)", this.texto, likes);
        }
    }
    @Override
    public String getRepresentacao2() {
        return String.format("%s", this.texto);
    }   
}


class MensagemImagem extends Mensagem{
    String arquivoImagem;
    int largura;
    int altura;

    MensagemImagem(String arquivoImagem, int largura, int altura){
        this.arquivoImagem = arquivoImagem;
        this.largura = largura;
        this.altura = altura;
    } 

    @Override
    public String getRepresentacao() {
        if((this).isAnswer){
            return String.format("%s %dx%d RESPOSTA A [%s] (likes=%d)", arquivoImagem, largura, altura, (this).answerTo.getRepresentacao2(), likes);
        }
        else{
            return String.format( "%s %dx%d (likes=%d)", arquivoImagem, largura, altura, likes);
        }
    }

    @Override
    public String getRepresentacao2() {
        return String.format( "%s %dx%d", arquivoImagem, largura, altura);
    }

    
}