package semana4.universidade;

public class Pessoa {
    String nome;
    String sobrenome;

    public void setNomeSobrenome(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getEmail(){        
        return nome + "." + sobrenome + "@dominio.generico.com.br";
    }

    public String getVinculo(){         
        return "Sem vinculo com a UFABC";
    }
}
