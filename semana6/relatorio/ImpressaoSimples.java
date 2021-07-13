package semana6.relatorio;

public class ImpressaoSimples implements PluginImpressao{

    @Override
    public void imprimir(Relatorio r) {
        Impressao.imprimirLinha(r.getTexto());        
    }
}
