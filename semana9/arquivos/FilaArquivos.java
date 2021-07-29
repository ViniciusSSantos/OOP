package semana9.arquivos;
import java.util.ArrayList;

public class FilaArquivos<T> implements Fila<T>{
    int n;
    ArrayList<T> fila = new ArrayList<T>();;


    FilaArquivos(int n){
        this.n = n;
    }

    @Override
    public boolean enfileirar(T arquivo){
        if(fila.size() < n){
            fila.add(arquivo);
            return true;
        }

        return false;
    }

    @Override
    public T desenfileirar() {
        if(fila.size() == 0)
            return null;
            
        T item = fila.get(0);
        fila.remove(0);
        return item;
    }
    
}
