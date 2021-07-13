package semana6.relatorio;

public class TextoTitulo implements PluginTexto{
    private String titulo;

    public TextoTitulo(String titulo){
        this.titulo = titulo;
    }

    @Override
    public String aplicar(String texto) {
        return String.format("(TITULO: %s) %s",titulo ,texto);
    }
    
}
