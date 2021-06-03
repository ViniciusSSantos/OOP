package semana1;

import java.util.*;


public class Estatisticas {

		public static int soma(Vector<Integer> vetor){
			int soma = 0;
			for(int i =0; i< vetor.size(); i++){
				soma += vetor.get(i);
			}
			return soma;
		}
		public static int minimo(Vector<Integer> vetor){
			int minimo = vetor.get(0);
			for(int i =1; i< vetor.size(); i++){
				if(vetor.get(i) < minimo)
					minimo = vetor.get(i);
			}
			return minimo;
		}

		public static int maximo(Vector<Integer> vetor){
			int maximo = vetor.get(0);
			for(int i =1; i< vetor.size(); i++){
				if(vetor.get(i) > maximo)
					maximo = vetor.get(i);
			}
			return maximo;
		}



		public static double media(Vector<Integer> vetor){
			double soma = 0;
			for(int i =0; i< vetor.size(); i++){
				soma += vetor.get(i);
			}
			double media = soma/vetor.size();
			return media;
		}

		public static void main(String[] args){
			int num = 1;
			Vector<Integer> vetor = new Vector<Integer>(10,1);
			Scanner leitor = new Scanner(System.in);

			while(num > 0){
				num = leitor.nextInt();
				if(num > 0)
					vetor.add(num);
			}
			int sum = soma(vetor);
			System.out.println(sum);
			double med = media(vetor);
			System.out.println(String.format("%.2f", med));
			int min = minimo(vetor);
			System.out.println(min);
			int max = maximo(vetor);
			System.out.println(max);





			


			
			



	}

}
