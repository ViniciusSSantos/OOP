package semana6.relatorio;

public class TextoData implements PluginTexto {
    int dia;
    int mes;
    int ano;

    public TextoData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }
    
    @Override
    public String aplicar(String texto) {
        String data = " (" + "DATA: " + dia +"/"+ mes +"/"+ ano + ")"; 

        return texto + data;
    }


    
}
