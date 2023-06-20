
import java.util.Scanner;
public class DesafioControleFluxo {
	public static void main(String[] args) {
  
      int indice;

      try {
         Scanner entrada = new Scanner(System.in);

				
	 		System.out.println("Digite o primeiro parâmetro : ");
	 		int valor1 = entrada.nextInt();
	 		System.out.println("Digite o segundo parâmetro : ");
	 		int valor2 = entrada.nextInt();

         DesafioControleFluxo intervalo =  new DesafioControleFluxo();
         System.out.println("Intervalo(s) = " + intervalo.VerificaIntervalo(valor1, valor2));

         for ( indice = valor1 + 1; indice < valor2 ; indice++) {
            System.out.println( "Intervalo  = " + indice);
            }

        entrada.close();

        } catch (IntervaloException e) {
           System.out.println("O segundo par\u00E2metro deve ser maior que o primeiro ");
       //  System.out.println(e.getMessage());
 
         }

    }

    public int VerificaIntervalo (int entrada1, int entrada2) throws IntervaloException {
        if ( entrada1 >  entrada2) {
           throw new IntervaloException(); 
        }
       return (entrada2  -  entrada1) - 1 ;
    }
   
}
