package semana5;

public class ZenitPolar implements Cifra{


    @Override
    public String cifrar(String mensagem){
        String men_cifrada = "";

        for(int i = 0; i < mensagem.length(); i++){
            switch(mensagem.charAt(i)){
                case 'z':
                    men_cifrada += 'p';
                    break;

                case 'e':
                    men_cifrada += 'o';
                    break;

                case 'n':
                    men_cifrada += 'l';
                    break;

                case 'i':
                    men_cifrada += 'a';
                    break;
                case 't':
                    men_cifrada += 'r';
                    break;

                case 'p':
                    men_cifrada += 'z';
                    break;

                case 'o':
                    men_cifrada += 'e';
                    break;

                case 'l':
                    men_cifrada += 'n';
                    break;


                case 'a':
                    men_cifrada += 'i';
                    break;

                case 'r':
                    men_cifrada += 't';
                    break;

                default:
                    men_cifrada += mensagem.charAt(i);

            }

        }

        return men_cifrada;
       
    }

    @Override
    public String decifrar(String mensagem){
        return cifrar(mensagem);
       
    }
        

    
}
