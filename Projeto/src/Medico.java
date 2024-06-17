import java.util.ArrayList;


public class Medico extends Pessoa{
	
	ArrayList <Pessoa> pessoasm = new ArrayList <>();
	
	private String especializacao;
	
	public Medico(String nome, String cpf, String telefone, String email, String especializacao) {
		super(nome, cpf, telefone, email);
		this.especializacao = especializacao;
	}
	
	public void cadastraMedico(Medico medico1){	
		//Valida se Medico já esta adicionado
		boolean repetido = false;
		for(Pessoa m : pessoasm) {
			if(m.getNome().equalsIgnoreCase(medico1.getNome())) {
				repetido = true;
			}
		}
		if(!repetido) {
			//Add Medico
			pessoasm.add(medico1);
			System.out.println(medico1.getNome() + " foi cadastrado com sucesso!");
		}else {
			System.out.println("Médico já cadastrado!");
		}
			
	}
	public void listaMedico() {
		//Lista todos Medicos
		System.out.println("--- Lista de Médicos ---\n");

		if(pessoasm.isEmpty()) {
			System.out.println("Nenhum médico cadastrado!");
		}else {
			for(Pessoa m : pessoasm) {
				System.out.println(m.toString());
			}
		}
	}
	public void visualizaMedico(String nomePessoa) {
		for(Pessoa m : pessoasm) {
			if(m.getNome().equals(nomePessoa)) {
				System.out.println(m.toString());
			}else {
				System.out.println("Nome digitado não encontrado!");
			}
		}
	}
	public boolean editaMedico(String nomePessoa) {
		boolean flag = false;
        for (Pessoa m : pessoasm) {
            if (m.getNome() == nome) {
                flag = true;
            }
        }
        return flag;
	}
	public void removeMedico (String nomePessoa) {
		for(int i = 0; i < pessoasm.size(); i++) {
            Pessoa m = pessoasm.get(i);
            if(m.getNome().equals(nomePessoa)) {
            	pessoasm.remove(i);
            }
        }
	}
    
	
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nEspecialização: " + especializacao;
	}
}