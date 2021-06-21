package semana3;

public class Fracao {
    int numerador;
    int denominador;

    public Fracao(){
        this.numerador = 1;
        this.denominador =1;        
    }

    public Fracao(int numerador){
        this.numerador = numerador;
        this.denominador =1;

        
    }

    public Fracao(int numerador, int denominador){

       int mdc = mdc(numerador, denominador);

        this.numerador = numerador/mdc;
        this.denominador = denominador/mdc;
        
    }

    private static int mdc(int a, int b){
        if (a == 0)
            return b;
        return mdc(b % a, a);
    }

    private static int mmc(int a, int b){
        return (a / mdc(a, b)) * b;
    }

    public String getRepresentacao(){
        String fracao = String.valueOf(numerador) + "/" + String.valueOf(denominador);
        return fracao;
    }

    public Fracao somar(Fracao f2){
        Fracao soma = new Fracao();

        if(denominador == f2.denominador){
            soma.numerador = numerador + f2.numerador;
            soma.denominador = f2.denominador;

            return soma;
        }

        soma.denominador = mmc(denominador, f2.denominador);

        soma.numerador = (numerador*(soma.denominador/denominador))+(f2.numerador*(soma.denominador/f2.denominador));


        return soma;
    }

    public static Fracao somar(Fracao f1, Fracao f2){
        Fracao soma = new Fracao();
       

        soma.denominador = mmc(f1.denominador, f2.denominador);

        soma.numerador = (f1.numerador*(soma.denominador/f1.denominador))+(f2.numerador*(soma.denominador/f2.denominador));

        int mdc = mdc(soma.numerador, soma.denominador);

        soma.numerador = soma.numerador/mdc;
        soma.denominador = soma.denominador/mdc;


        return soma;

    }


    public static Fracao somar(Fracao[] fracoes){
        Fracao soma = new Fracao();
        soma.numerador = 0;
        soma.denominador = fracoes[0].denominador;

        for(int i = 1; i < fracoes.length; i++){
            soma.denominador =(((fracoes[i].denominador * soma.denominador))/(mdc(fracoes[i].denominador, soma.denominador)));
        }

        for(int i = 0; i < fracoes.length; i++){
            soma.numerador = soma.numerador + (fracoes[i].numerador)*(soma.denominador/fracoes[i].denominador);
        }


        int mdc = mdc(soma.numerador, soma.denominador);

        soma.numerador /= mdc;
        soma.denominador /= mdc;

        return soma;

    }


    public static Fracao multiplicar(Fracao f1, Fracao f2){
        Fracao produto = new Fracao();

        produto.numerador = f1.numerador * f2.numerador ;
        produto.denominador =f1.denominador * f2.denominador;
        
        int mdc = mdc(produto.numerador, produto.denominador);

        produto.numerador /= mdc;
        produto.denominador /= mdc;

        return produto;
    }




}
