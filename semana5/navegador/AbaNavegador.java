package semana5.navegador;

public abstract class AbaNavegador {
    static int countHist = 0;
    static String[] historico = new String[100];
    protected String titulo;

    public String getTitulo(){
        return this.titulo;
    }

    public abstract String getTipo();
    
}
