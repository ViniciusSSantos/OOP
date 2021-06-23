package semana4.universidade;

public class Professor extends Pessoa {

    @Override
    public String getEmail(){
        return nome + "." + sobrenome + "@ufabc.edu.br";
    }

    @Override
    public String getVinculo(){         
        return "Professor da UFABC";
    }
    
}
