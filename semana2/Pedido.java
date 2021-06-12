package semana2;


// package empresa;

public class Pedido {

    int[] pedidos = new int[5];
    int pedidosNum = 0;

    public boolean adicionarProduto(int codProduto){
        if(pedidosNum < 5 & pedidosNum > -1){
            pedidos[pedidosNum] = codProduto;
            pedidosNum++;
            return true;            
        }

        return false;
                

    }

    public int[] entregar(){
        if(pedidosNum > 0){
            pedidosNum = -1;
            int j = 0;
            for( int i = 0;  i < pedidos.length;  i++ ){
                if( pedidos[i] != 0 )
                    pedidos[j++] = pedidos[i];
            }
            int[] entrega = new int[j];
            System.arraycopy( pedidos, 0, entrega, 0, j);
            return entrega;
        }

        return null;        
    }

    public boolean cancelar(){
        if(pedidosNum != -1) {
            pedidosNum = -1;            
            return true;
        }

        return false;
    }

    private int busca(int[] pedidoTemp, int pedidosNum, int num){

        for(int i = 0; i < pedidosNum;i++){
            if(pedidoTemp[i] == num)
                return i;
        }
        return -1;
    }

    public boolean somarPedido(Pedido p){
        
        if(pedidosNum > 0 & p.pedidosNum > 0){
            int k = 0;
            int[] pedidoTemp = new int[pedidosNum + p.pedidosNum];
            for(int i = 0; i < pedidosNum; i++ ){
                pedidoTemp[k]= pedidos[i];
                k++;
            }
           
            for(int i = 0; i < p.pedidosNum; i++){

                if(busca(pedidoTemp, pedidosNum, p.pedidos[i]) == -1)
                    pedidoTemp[k] = p.pedidos[i];
                    k++;

            }

            int j = 0;
            for( int i = 0;  i < pedidoTemp.length;  i++ ){
                if( pedidoTemp[i] != 0 )
                    j++;
            }
           


            if(j <= 5){
                pedidos = pedidoTemp;
                return true;
            }
        }
        return false;
    }
}
