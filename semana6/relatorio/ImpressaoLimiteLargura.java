package semana6.relatorio;

public class ImpressaoLimiteLargura implements PluginImpressao {
    int largura;
    String[] linhasTexto;

    public ImpressaoLimiteLargura(int largura){
        this.largura = largura;

    }

	public void imprimir(Relatorio r){
		int tamPalavra=0;
		int tamPalavraNext =0;
		String text = r.getTexto();
       linhasTexto = new String[r.getTexto().length()];

	   for(int i = 0; i < linhasTexto.length; i++){
		    linhasTexto[i] = "";
	   }

	   for(int i =0, j = 0; i < r.getTexto().length(); i++){

			if(text.charAt(i) != ' '){
				linhasTexto[j] += text.charAt(i);
			    tamPalavra++;
			}

			if(text.charAt(i) == ' '){
				for(int k = i+1;k < text.length() && text.charAt(k) != ' ' ; k++){
					tamPalavraNext++;
				}

				if(tamPalavra + tamPalavraNext + 1 > largura){
					j++;
					tamPalavra = 0;
				}

				else{ 
					linhasTexto[j] += text.charAt(i);
					tamPalavraNext = 0;
				}
			}
	   }
	   for(int i = 0; linhasTexto[i] != null && linhasTexto[i] != "" && i < linhasTexto.length; i++) {
			Impressao.imprimirLinha(linhasTexto[i]);
		}
	}

}






