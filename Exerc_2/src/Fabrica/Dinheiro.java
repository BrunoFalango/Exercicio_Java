package Fabrica;

public class Dinheiro {

	public static void main(String[] args) {
		float Carro = 20000, NovoP;

		System.out.print(" Qual o custo de fabrica? ");
		scanf("%f", Carro);

		NovoP = (float) (Carro + (Carro * 0.28) + (Carro * 0.45));

		System.out.printf("\n Seu carro ira custar R$ %.2f ", NovoP);

		

	}

	private static void scanf(String string, float carro) {
		// TODO Auto-generated method stub
		
	}

}
