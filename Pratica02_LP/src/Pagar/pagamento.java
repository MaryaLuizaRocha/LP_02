package Pagar;
import java.util.Scanner;
public class pagamento {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int opcional;
		double valtotal = 0, total, desc, parcela;
		
		
		do	{
			System.out.println("--PAGAMENTOS--");
			System.out.println("Insira o valor total da compra: ");
			valtotal = ler.nextDouble();
			
			System.out.println("---SELECIONE A FORMA DE PAGAMENTO---");
			System.out.println("1 - À Vista"); //10% de desconto
			System.out.println("2 - Parcelado 2x"); //em duas vezes (preço da etiqueta)
			System.out.println("3 - Parcelado de 3x a 6x"); //3 até 6 vezes com 3% de juros ao mês (somente para compras acima de R$ 500,00
			System.out.println("4 - Encerrar");
			opcional = ler.nextInt();
			
			
			switch (opcional)
			{
				case 1:
				{
					desc = valtotal*10/100;
					total = valtotal - desc;
					System.out.println("O valor total com desconto (à vista) é de: R$" + total + "\n");break;
				}
				case 2:
				{
					parcela = valtotal/2;
					System.out.println("O valor total é de: R$" + valtotal + " dividido em duas parcelas de: R$" + parcela + "\n");break;
				}
				case 3:
				{
					if (valtotal < 500)
					{
						System.out.println("Este valor não pode ser parcelado acima de 2x.");
						System.out.println("Selecione outra forma de pagamento.\n");
					}
					else
					{
						System.out.println("Selecione a quantidade de parcelas desejada: ");
						System.out.println("3x");
						System.out.println("4x");
						System.out.println("5x");
						System.out.println("6x");
						opcional = ler.nextInt();
						
						if (opcional == 3)
						{
						System.out.println("PARCELAMENTO DE 3x");
						double taxa = 0.03;
						int meses = 3;
						double juros = valtotal * taxa * meses;
						double fim;
						fim = valtotal+juros;
						System.out.println("(3x) - O valor ser pago ao fim do pagamento será de: R$" + fim+ "\n");break;
						}
						if (opcional == 4)
						{
						System.out.println("PARCELAMENTO DE 4x");
						double taxa = 0.03;
						int meses = 4;
						double juros = valtotal * taxa * meses;
						double fim;
						fim = valtotal+juros;
						System.out.println("(4x) - O valor ser pago ao fim do pagamento será de: R$" + fim+ "\n");break;
						}
						if (opcional == 5)
						{
						System.out.println("PARCELAMENTO DE 5x");
						double taxa = 0.03;
						int meses = 5;
						double juros = valtotal * taxa * meses;
						double fim;
						fim = valtotal+juros;
						System.out.println("(5x) - O valor ser pago ao fim do pagamento será de: R$" + fim+ "\n");break;
						}
						if (opcional == 6)
						{
						System.out.println("PARCELAMENTO DE 6x");
						double taxa = 0.03;
						int meses = 6;
						double juros = valtotal * taxa * meses;
						double fim;
						fim = valtotal+juros;
						System.out.println("(6x) - O valor ser pago ao fim do pagamento será de: R$" + fim + "\n");break;
						}
					}
				}break;
				case 4:
					System.out.println("Finalizado!");break;
				default:
					System.out.println("Opção inválida, digite outra por gentileza.\n");break;
			}
		}while (opcional != 4);

	}

}
