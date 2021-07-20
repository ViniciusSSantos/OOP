package semana7.chat;

public class ListaMensagens {

    Mensagem[] mensagens = new Mensagem[100];
    int mensCount = 0;

    public ListaMensagens(){
    }

    public void adicionarMensagem(Mensagem mensagem){
        mensagens[mensCount] = mensagem;
        mensCount++;
    }

    public void responderMensagem(int indiceMensagemOriginal, Mensagem resposta){
        mensagens[indiceMensagemOriginal].responder(resposta);
        adicionarMensagem(resposta);
    }
    
    public Mensagem[] getMensagens(){
        Mensagem[] mens = new Mensagem[mensCount];

        for(int i =0; i < mensCount; i++){
            mens[i] = mensagens[i];
        }

        return mens;        
    }

    public String[] getMensagensString(){
        String[] mensString = new String[mensCount];
        for(int i =0; i < mensCount; i++){
            mensString[i] = mensagens[i].getRepresentacao();
        }

        return mensString;
        
    }

    public void like(int indiceMensagem){
        mensagens[indiceMensagem].like();
    }
    
}

