package semana6.relatorio;

public class RelatorioComPlugins extends Relatorio{
    PluginImpressao p;
    public RelatorioComPlugins(String autor){
        super(autor);
    }

    public void aplicarPluginTexto(PluginTexto plugin){
        super.setTexto(plugin.aplicar(getTexto()));
    }

    public void setPluginImpressao(PluginImpressao p){
        this.p = p;        
    }

    @Override
    public void imprimirRelatorio(){
        p.imprimir((this));
        
    }
    
}
