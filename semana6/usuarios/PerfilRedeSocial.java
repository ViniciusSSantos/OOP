package semana6.usuarios;

public class PerfilRedeSocial extends PerfilUsuario {
    private  String mensagemPaginaInicial ="Sem mensagem";
    public PerfilRedeSocial(String nome, String login){
        super(nome, login);
    }

    public PerfilRedeSocial(String nome, String login, String mensagemPaginaInicial){
        super(nome, login);
        this.mensagemPaginaInicial = mensagemPaginaInicial;
    }

    public String getPerfil(){
        return getNome() + " " + mensagemPaginaInicial;
    }
    
}
