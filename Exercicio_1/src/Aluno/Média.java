package Aluno;

public class Média {

	public static void main(String[] args) {
		float n1 = 0, nota2 = 0, n3 = 0, p1 = 0, p2 = 0, p3 = 0, media;

		   System.out.print("Programa: Média ponderada. \n");

		   System.out.print("Insira o valor da primeira nota: \n");

		   scanf("%f", n1);

		   System.out.print("Insira o peso da primeira nota: \n");

		   scanf("%f", p1);

		   System.out.print("Insira o valor da segunda nota: \n");

		   scanf("%f", nota2);

		   System.out.print("Insira o peso da segunda nota: \n");

		   scanf("%f", p2);

		   System.out.print("Insira o valor da terceira nota: \n");

		   scanf("%f", n3);

		   System.out.print("Insira o peso da terceira nota: ");

		   scanf("%f", p3);

		   media = (n1 + nota2 + n3)/3 ; 

		   if ( media >= 6 ) {
		   System.out.print ("Aprovado");

		   } else {

		   if ( media <= 5 ) {
		   System.out.print ("Reprovado");

		   } else {

		   System.out.print ("Recuperação");
		   }}


		   return;

	}

	private static void scanf(String string, float p3) {
		// TODO Auto-generated method stub
		
	}

}
