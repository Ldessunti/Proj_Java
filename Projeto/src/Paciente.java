import java.util.ArrayList;

public class Paciente extends Pessoa{
	
	ArrayList <Pessoa> pessoasp = new ArrayList<>();
	
	private String endereco;
	
	public Paciente(String nome, String cpf, String telefone, String email, String endereco) {
		super(nome, cpf, telefone, email); 
		this.endereco = endereco;
	}
	
	public void getDetalhes() {
		pessoasp.toString();
	}
	
	public void cadastraPaciente(Paciente paciente1) {
		//Valida se Paciente já esta adicionado
		boolean repetido = false;
		for(Pessoa p : pessoasp) {
			if(p.getNome().equalsIgnoreCase(paciente1.getNome())) {
				repetido = true;
			}
		}
		if(!repetido) {
			//Add Paciente
			pessoasp.add(new Paciente(getNome(), getCpf(), getTelefone(), getEmail(), getEndereco()));
			System.out.println(paciente1.getNome() + " foi cadastrado com sucesso!\n");
		}else {
			System.out.println("Paciente já cadastrado!\n");
		}
	}
	public void listaPaciente() {
		//Lista todos Pacientes
		System.out.println("--- Lista de Paciente ---\n");

		if(pessoasp.isEmpty()) {
			System.out.println("Nenhum paciente cadastrado!\n");
		}else {
			for(Pessoa p : pessoasp) {
				System.out.println(p.toString());
			}
		}
	}
	public void visualizaPaciente(String nomePessoa) {
		for(Pessoa p : pessoasp) {
			if(p.getNome().equals(nomePessoa)) {
				System.out.println(p.toString());
			}else {
				System.out.println("Nome digitado não encontrado!\n");
			}
		}
	}
	public boolean editaPaciente(String nomePessoa) {
		boolean flag = false;
	        for (Pessoa p : pessoasp) {
	            if (p.getNome() == getNome()) {
	                flag = true;
	            }
	        }
        return flag;
	}
	public void removePaciente (String nomePessoa) {
	    for(int i = 0; i < pessoasp.size(); i++) {
            	Pessoa p = pessoasp.get(i);
            	if(p.getNome().equals(nomePessoa)) {
                	pessoasp.remove(i);
            	}
       	    }
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nEndereço: " + endereco;
	}
}
