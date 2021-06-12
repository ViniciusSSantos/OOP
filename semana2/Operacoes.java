package semana2;

public class Operacoes {
    public int a, b, c;
    private int min = 90000;
    private int max = -90000;


    public void setA(int a){
        this.a = a;
    }
    
    public void setB(int b){
        this.b = b;
    }
    
    public void setC(int c){
        this.c = c;
    }
    
    
    public int soma2(){
        if(a+b > max)
            max = a+b;
        if(a+b < min)
            min = a+b;
        return a+b;
    }

    public int soma3(){
        if(a+b+c > max)
            max = a+b+c;
        if(a+b+c < min)
            min = a+b+c;
        return a+b+c;
    }

    public int multiplica(){
        if(a*b > max)
            max = a*b;
        if(a*b < min)
            min = a*b;
        return a*b;
    }

    public int getMin(){
        return min;
    }

    public int getMax(){
        return max;
    }   
}
