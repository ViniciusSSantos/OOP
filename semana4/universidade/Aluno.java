package semana4.universidade;

public class Aluno extends Pessoa {

    @Override
    public String getEmail(){
        return nome + "." + sobrenome + "@aluno.ufabc.edu.br";
    }

    @Override
    public String getVinculo(){         
        return  "Aluno da UFABC";
    }
}
