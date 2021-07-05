package semana5;

public class CifraCesar implements Cifra {
    private int nShifts;
    
    public CifraCesar(int nShifts){
        this.nShifts = nShifts;
    }

    @Override
    public String cifrar(String mensagem){
        String men_cifrada = "";

        for(int i = 0; i <mensagem.length(); i++){
            if(mensagem.charAt(i) != ' '){
                // em ascii, a letra 'a' é 97, subtraimos 97 da letra em especifico para que possemos trabalhar entre 0-25 ao invés de 97-122
                int posInicialAscii = mensagem.charAt(i) - 'a';
                int letraAscii = (posInicialAscii + nShifts) % 26;
                //retornamos a 97-122 adicionando o 'a' novamente
                char letra = (char) ('a' + letraAscii);
                men_cifrada += letra;
            }
            else{
                men_cifrada += mensagem.charAt(i);
            } 
        }

        return men_cifrada;
    }

    @Override
    public String decifrar(String mensagem){
        String men_decifrada = "";

        for(int i = 0; i <mensagem.length(); i++){    
            if(mensagem.charAt(i) != ' '){
                // em ascii, a letra 'a' é 97, subtraimos 97 da letra em especifico para que possemos trabalhar entre 0-25 ao invés de 97-122
                int posInicialAscii = mensagem.charAt(i) - 'a';
                //decriptar algo com nShifts = 3 é a mesma coisa que encriptar algo com um nShifts = 26-3
                int shift = 26 - (nShifts % 26);
                int letraAscii = (posInicialAscii + shift)%26;
                //retornamos a 97-122 adicionando o 'a' novamente
                char letra = (char) ('a' + letraAscii);
                men_decifrada += letra;
            }
            else{
                men_decifrada += mensagem.charAt(i);
            } 
        }            
        return men_decifrada;
    }
        
}

    

