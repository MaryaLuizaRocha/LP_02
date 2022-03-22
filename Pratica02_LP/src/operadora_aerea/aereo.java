package operadora_aerea;
import java.util.Scanner;
import java.util.Random;
public class aereo {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner ver = new Scanner (System.in);
		
		int opcional, nmrpolt;
		String nome, CPF, data, hora, nmrvoo;
		int[] poltrona = new int[100];
		
		int ticket = random.nextInt(100);
		
		do	{
			System.out.println("---COMPANHIA AÉREA---");
			System.out.println("O que deseja fazer?");
			System.out.println("1 - (Cadastro de passageiros)");
			System.out.println("2 - (Realizar Check-in)");
			System.out.println("3 - (Cancelamento de Vôo)");
			System.out.println("4 - (Sair)");
			opcional = ver.nextInt();
			
			
			switch (opcional)
			{
				case 1:
					System.out.println("--CADASTRO DE PASSAGEIROS--");
						System.out.println("Nome do passageiro: ");
						nome = ver.next();
						System.out.println("CPF: ");
						CPF = ver.next();
						System.out.println("Data do vôo: ");
						data = ver.next();
						System.out.println("Hora do vôo: ");
						hora = ver.next();
					
						System.out.println("--CADASTRO EFETUADO COM SUCESSO--");
						System.out.println("Nome do passageiro: " + nome);
						System.out.println("CPF do passageiro: " + CPF);
						System.out.println("Data do Vôo: " + data);
						System.out.println("Hora do Vôo: " + hora);
						System.out.println("Ticket de embarque é: " + random.nextInt(999)); break;
				case 2:
					System.out.println("--REALIZAR CHECK IN--");
						System.out.println("Nome do passageiro: ");
						nome = ver.next();
						System.out.println("Informe o número do vôo: ");
						nmrvoo = ver.next();
						System.out.println("Informe o número da poltrona: ");
						nmrpolt = ver.nextInt();
						while(1)
						for(int i=0; i<100; i++)
						{
							if (poltrona[i] != nmrpolt)
							{
								System.out.println("Poltrona válida!");
							}
						}
						if (poltrona[cont] == nmrpolt);
						{
							System.out.println("Poltrona inválida!");
						}
					
						System.out.println("--CHECK IN EFETUADO COM SUCESSO--"); break;
				case 3:
					System.out.println("--CANCELAMENTO DE VOO--");
					System.out.println("Nome do passageiro: ");
					nome = ver.next();
					System.out.println("Informe o número do vôo: ");
					nmrvoo = ver.next();	
					
						System.out.println("--CANCELAMENTO EFETUADO COM SUCESSO--"); break;
				case 4:
					System.out.println("Finalizando!");break;
				case 5:
					System.out.println("Por Favor, digite uma opção válida!"); break;
			}
		}while (opcional != 4);
    	}
	}