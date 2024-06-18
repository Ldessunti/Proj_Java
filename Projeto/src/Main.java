import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		
		Paciente paciente1 = new Paciente(null, null, null, null, null);
		Medico medico1 = new Medico(null, null, null, null, null);
		Procedimento proced1 = new Procedimento(null, null, 0);
		Consulta consult1 = new Consulta(null, null, null);
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("--- Bem-Vindo ---");
		
		//Mostra Menu e Seleciona case
		int escolheMenu = 0;
		String itensMenu = "--- 1. Paciente ---\n"
						 + "--- 2. Médicos ---\n"
						 + "--- 3. Procedimentos ---\n"
						 + "--- 4. Consultas ---\n"
						 + "--- 5. Sair ---";
		
		do {
			
			System.out.println(itensMenu);	
			escolheMenu = leitor.nextInt();
			
			System.out.println("1. Cadastrar --- 2. Listar --- 3. Visualiza --- 4. Editar --- 5. Excluir\n");
			int escolheAcao = leitor.nextInt();
			
			switch(escolheMenu) {
			
			case 1: //Paciente
				if(escolheAcao == 1) {
					//Cadastro Paciente
					System.out.println("--- Cadastro de Paciente ---\n");
					System.out.print("Digite seu Nome Completo: ");
					paciente1.setNome(leitor.next());
					System.out.print("Digite seu CPF: ");
					paciente1.setCpf(leitor.next());
					System.out.print("Digite seu E-mail: ");
					paciente1.setEmail(leitor.next());
					System.out.print("Digite seu Telefone: ");
					paciente1.setTelefone(leitor.next());
					System.out.print("Digite seu CEP: ");
					paciente1.setEndereco(leitor.next());
					
					paciente1.cadastraPaciente(paciente1);
				}else if(escolheAcao == 2){
					//Lista Paciente
					paciente1.listaPaciente();
				}else if(escolheAcao == 3) {
					//Visualiza Paciente
					System.out.print("Digite o nome da pessoa: ");
					String nomePessoa = leitor.next();
					paciente1.visualizaPaciente(nomePessoa);
				}else if(escolheAcao == 4) {
					//Edita Paciente
					System.out.print("Digite o nome da pessoa: ");
					String nomePessoa = leitor.next();
					
					boolean edit = paciente1.editaPaciente(nomePessoa);
					
					if(edit) {
						System.out.print("Digite seu Nome Completo: ");
						paciente1.setNome(leitor.next());
						System.out.print("Digite seu CPF: ");
						paciente1.setCpf(leitor.next());
						System.out.print("Digite seu E-mail: ");
						paciente1.setEmail(leitor.next());
						System.out.print("Digite seu Telefone: ");
						paciente1.setTelefone(leitor.next());
						System.out.print("Digite seu CEP: ");
						paciente1.setEndereco(leitor.next());
						System.out.println("Paciente editado!");
					}else {
						System.out.println("Nome inválido!");
					}
				}else if(escolheAcao == 5) {
					//Remove Paciente
					System.out.print("Digite o nome da pessoa: ");
					String nomePessoa = leitor.next();
					
					paciente1.removePaciente(nomePessoa);
				}else {
					System.out.println("Número Digitado não Válido para opções!");
				}
				
				break;
				
			case 2: //Medico
				if(escolheAcao == 1) {
					//Cadastro Medico
					System.out.println("--- Cadastro de Médico ---\n");
					System.out.print("Digite seu Nome Completo: ");
					medico1.setNome(leitor.next());
					System.out.print("Digite seu CPF: ");
					medico1.setCpf(leitor.next());	
					System.out.print("Digite seu E-mail: ");
					medico1.setEmail(leitor.next());		
					System.out.print("Digite seu Telefone: ");
					medico1.setTelefone(leitor.next());						
					System.out.print("Digite sua Especialização: ");
					medico1.setEspecializacao(leitor.next());
					
					medico1.cadastraMedico(medico1);
				}else if(escolheAcao == 2){
					//Lista Medicos
					medico1.listaMedico();
				}else if(escolheAcao == 3) {
					//Visualiza Medico
					System.out.print("Digite o nome da pessoa: ");
					String nomePessoa = leitor.next();
					medico1.visualizaMedico(nomePessoa);
				}else if(escolheAcao == 4) {
					//Edita Medico
					System.out.print("Digite o nome da pessoa: ");
					String nomePessoa = leitor.next();
					
					boolean edit = medico1.editaMedico(nomePessoa);;
					
					if(edit) {
						System.out.print("Digite seu Nome Completo: ");
						medico1.setNome(leitor.next());
						System.out.print("Digite seu CPF: ");
						medico1.setCpf(leitor.next());	
						System.out.print("Digite seu E-mail: ");
						medico1.setEmail(leitor.next());		
						System.out.print("Digite seu Telefone: ");
						medico1.setTelefone(leitor.next());						
						System.out.print("Digite sua Especialização: ");
						medico1.setEspecializacao(leitor.next());
						System.out.println("Médico editado!");
					}else {
						System.out.println("Nome inválido!");
					}
				}else if(escolheAcao == 5) {
					//Remove Medico
					System.out.print("Digite o nome da pessoa: ");
					String nomePessoa = leitor.next();
					
					medico1.removeMedico(nomePessoa);
				}else {
					System.out.println("Número Digitado não Válido para opções!");
				}
				
				break;
				
			case 3://Procedimentos
				if(escolheAcao == 1) {
					//Cadastro Procedimento
					System.out.println("--- Cadastro de Procedimentos ---\n");	
					System.out.print("Digite o nome do Procedimento: ");
					proced1.setNome(leitor.next());
					System.out.print("Descreva o Procedimento: ");
					proced1.setDescricao(leitor.next());	
					System.out.print("Digite o valor: ");
					proced1.setPreco(leitor.nextDouble());
					
					proced1.cadastraProcedimento(proced1);
				}else if(escolheAcao == 2){
					//Lista Procedimentos
					proced1.listaProcedimento();
				}else if(escolheAcao == 3) {
					//Visualiza Procedimento
					System.out.print("Digite o nome do Procedimento: ");
					String nomeProc = leitor.next();
					
					proced1.visualizaProcedimentos(nomeProc);
				}else if(escolheAcao == 4) {
					//Edita Procedimento
					System.out.print("Digite o nome do Procedimento: ");
					String nomeProc = leitor.next();
					
					boolean edit = proced1.editaProcedimento(nomeProc);
					
					if(edit) {
						System.out.print("Digite o nome do Procedimento: ");
						proced1.setNome(leitor.next());
						System.out.print("Descreva o Procedimento: ");
						proced1.setDescricao(leitor.next());	
						System.out.print("Digite o valor: ");
						proced1.setPreco(leitor.nextDouble());
						System.out.println("Procedimento editado!");
					}else {
						System.out.println("Nome inválido!");
					}
				}else if(escolheAcao == 5) {
					//Remove Procedimento
					System.out.print("Digite o nome do Procediemento: ");
					String nomeProc = leitor.next();
					
					proced1.removeProcedimento(nomeProc);
				}else {
					System.out.println("Número Digitado não Válido para opções!");
				}
				
				break;
				
			case 4://Agendamentos
				if(escolheAcao == 1) {
					//Novo Agendamento
					System.out.println("--- Agendamento de Consultas ---\n");
					System.out.print("Nome do Paciente: ");
					String nomePaciente = leitor.next();
					System.out.print("Nome do Médico: ");
					String nomeMedico = leitor.next();
					System.out.print("Data da Consulta (dd/mm): ");
					consult1.setData(leitor.next());
					
					consult1.agendaConsulta(consult1, nomePaciente, nomeMedico);
				}else if(escolheAcao == 2){
					//Lista Agendamento
					consult1.listaConsulta();
				}else if(escolheAcao == 3) {
					//Visualiza Agendamento
					System.out.print("Qual a data agendada (dd/mm): ");
					String dataConsulta = leitor.next();
					
					consult1.visualizaConsulta(dataConsulta);
				}else if(escolheAcao == 4) {
					//Edita Agendamento
					System.out.print("Qual a data agendada (dd/mm): ");
					String dataConsulta = leitor.next();
					
					boolean edit = consult1.editaAgendamento(dataConsulta);
					
					if(edit) {
						System.out.print("Nome do Paciente: ");
						String nomePaciente = leitor.next();
						System.out.print("Nome do Médico: ");
						String nomeMedico = leitor.next();
						System.out.print("Data da Consulta (dd/mm): ");
						consult1.setData(leitor.next());
						consult1.agendaConsulta(consult1, nomePaciente, nomeMedico);
						System.out.println("Agendamento editado!");
					}else {
						System.out.println("Data inválida!");
					}
				}else if(escolheAcao == 5) {
					//Remove Agendamento
					System.out.print("Qual a data agendada (dd/mm): ");
					String dataConsulta = leitor.next();
					
					consult1.removeAgendamento(dataConsulta);
				}else {
					System.out.println("Número Digitado não Válido para opções!");
				}
				
				break;
				
			case 5:
				System.out.println("Saindo da Aplicação!");
				break;
				
			default:
				System.out.println("Número Digitado não Válido para opções!");
				break;
			}
			
			
		}while(escolheMenu != 5);
		
		leitor.close();
		
	}
}
