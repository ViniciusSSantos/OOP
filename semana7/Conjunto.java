package semana7;

public class Conjunto implements Lista{

	static class NoLista{
		int num;
		NoLista prox = null;
	
		public NoLista(int num){
			this.num = num;
		}	
	}	
	
    NoLista primeiro = null, ultimo = null;
    int qtd = 0;

    @Override
    public int getQtd(){
        return this.qtd;
    }


	@Override
	public void adicionar(int numero) {
		NoLista novo = new NoLista(numero);
		
		if(this.primeiro == null) {
			this.primeiro = novo;
			qtd++;
			
		}
		else if(buscar(numero) == -1){
			if(primeiro.prox == null) {
				primeiro.prox = novo;
				this.ultimo = novo;
			}
			else {
				this.ultimo.prox = novo;
				ultimo = novo;
			}
			qtd++;	
		}
		
	}


	@Override
	public void remover(int numero) {
		if (buscar(numero) == -1) return;
		
		NoLista atual = primeiro, anterior = primeiro;
		
		if(primeiro.num == numero) {
			atual = primeiro.prox;
			anterior = primeiro.prox;
			primeiro = null;
			primeiro = atual;
		} else {
			for(; atual != null; atual = atual.prox) {
				if(atual.num == numero) {
					anterior.prox = atual.prox;
				}
				anterior = atual;
			}
		}		
		qtd--;
	}


	@Override
	public int buscar(int numero) {
		int i = 0;
		for(NoLista atual = this.primeiro; atual != null; atual = atual.prox, i++) {
			if(atual.num == numero) return i;
		}
		return -1;
	}
	
	
	public String toString() {
		
		String uniao = "";
		if(qtd == 1) return uniao + this.primeiro.num;

		for(NoLista atual = this.primeiro; atual.prox != null; atual = atual.prox) {
			uniao += atual.num + " ";
		}
		return uniao + this.ultimo.num;		
	}

	
	public static Conjunto uniao(Conjunto a, Conjunto b) {
		Conjunto c = new Conjunto();
		for(NoLista atual = a.primeiro; atual != null; atual = atual.prox) {
			c.adicionar(atual.num);
		}
		
		for(NoLista atual = b.primeiro; atual != null; atual = atual.prox) {
			if(c.buscar(atual.num) == -1){
				c.adicionar(atual.num);
			}  
		}
		
		return c;
	}

	
	public static Conjunto intersecao(Conjunto a, Conjunto b) {
		Conjunto c = new Conjunto();
		
		for(NoLista atual = a.primeiro; atual != null; atual = atual.prox) {
			if(b.buscar(atual.num) != -1){
				c.adicionar(atual.num);
			}  
		}
		
		return c;
	}
	
}