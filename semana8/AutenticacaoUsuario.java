package semana8;
import java.util.Scanner;
import acesso.Usuario;
import acesso.Impressao;
import acesso.UsuarioBloqueado;
import acesso.SenhaInvalida;

public class AutenticacaoUsuario {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        Usuario[] usuarios = new Usuario[n];
        Impressao impressao = new Impressao();

        for(int i =0; i < n; i++){
            String login = leitor.next();
            String senha = leitor.next();

            usuarios[i] = new Usuario(login, senha);
        }

        int k = leitor.nextInt();
        
        for(int i =0; i < k; i++){
            String login = leitor.next();
            String senha = leitor.next();
            for(int j =0; j < n; j++){
                if(usuarios[j].getLogin().equals(login)){
                    try{
                        usuarios[j].autenticar(senha);
                        impressao.imprimirUsuarioAutenticado(usuarios[j].getLogin());
                    } catch(SenhaInvalida err){
                        impressao.imprimirSenhaInvalida(err.getLogin());
                    } catch(UsuarioBloqueado err){
                        impressao.imprimirUsuarioBloqueado(err.getLogin());
                    }
                }    
            }
        }

    }
}
