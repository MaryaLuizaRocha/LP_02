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
			System.out.println("---COMPANHIA A�REA---");
			System.out.println("O que deseja fazer?");
			System.out.println("1 - (Cadastro de passageiros)");
			System.out.println("2 - (Realizar Check-in)");
			System.out.println("3 - (Cancelamento de V�o)");
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
						System.out.println("Data do v�o: ");
						data = ver.next();
						System.out.println("Hora do v�o: ");
						hora = ver.next();
					
						System.out.println("--CADASTRO EFETUADO COM SUCESSO--");
						System.out.println("Nome do passageiro: " + nome);
						System.out.println("CPF do passageiro: " + CPF);
						System.out.println("Data do V�o: " + data);
						System.out.println("Hora do V�o: " + hora);
						System.out.println("Ticket de embarque �: " + random.nextInt(999)); break;
				case 2:
					System.out.println("--REALIZAR CHECK IN--");
						System.out.println("Nome do passageiro: ");
						nome = ver.next();
						System.out.println("Informe o n�mero do v�o: ");
						nmrvoo = ver.next();
						System.out.println("Informe o n�mero da poltrona: ");
						nmrpolt = ver.nextInt();
						while(1)
						for(int i=0; i<100; i++)
						{
							if (poltrona[i] != nmrpolt)
							{
								System.out.println("Poltrona v�lida!");
							}
						}
						if (poltrona[cont] == nmrpolt);
						{
							System.out.println("Poltrona inv�lida!");
						}
					
						System.out.println("--CHECK IN EFETUADO COM SUCESSO--"); break;
				case 3:
					System.out.println("--CANCELAMENTO DE VOO--");
					System.out.println("Nome do passageiro: ");
					nome = ver.next();
					System.out.println("Informe o n�mero do v�o: ");
					nmrvoo = ver.next();	
					
						System.out.println("--CANCELAMENTO EFETUADO COM SUCESSO--"); break;
				case 4:
					System.out.println("Finalizando!");break;
				case 5:
					System.out.println("Por Favor, digite uma op��o v�lida!"); break;
			}
		}while (opcional != 4);
    	}
	}