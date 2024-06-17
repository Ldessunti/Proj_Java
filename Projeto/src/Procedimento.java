import java.util.ArrayList;

public class Procedimento {
	
	ArrayList <Procedimento> procedimentos = new ArrayList<>();
	
	private String nome;
	private String descricao;
	private double preco;
	
	public Procedimento(String nome, String descricao, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public void cadastraProcedimento(Procedimento proced1){
		//Valida se Procedimento já esta adicionado
		boolean repetido = false;
		for(Procedimento proc : procedimentos) {
			if(proced1.getNome().equalsIgnoreCase(proc.getNome())) {
				repetido = true;
			}
		}
		if(!repetido) {
			//Add Procedimento
			procedimentos.add(proced1);
			System.out.println(proced1.getNome() + " foi cadastrado com sucesso!");
		}else {
			System.out.println("Procedimento já cadastrado!");
		}
	}
	public void listaProcedimento() {
		//Lista todos Procedimentos
		System.out.println("--- Lista de Procedimentos ---");
		
		if(procedimentos.isEmpty()) {
			System.out.println("Nenhum procedimento cadastrado!");
		}else {
			for(Procedimento prod : procedimentos) {
				System.out.println(prod.toString());
			}
		}
	}
	public void visualizaProcedimentos(String nomeProc) {
		//Visualiza Procedimento
		for(Procedimento proc : procedimentos) {
			if(proc.getNome().equals(nomeProc)) {
				proc.toString();
			}else {
				System.out.println("Nome digitado não encontrado!");
			}
		}
	}
	public boolean editaProcedimento(String nomeProc) {
		boolean flag = false;
        for (Procedimento prod : procedimentos) {
            if (prod.getNome() == nome) {
                flag = true;
            }
        }
        return flag;
	}
	public void removeProcedimento (String nomeProc) {
		for(int i = 0; i < procedimentos.size(); i++) {
			Procedimento proc = procedimentos.get(i);
            if(proc.getNome().equals(nomeProc)) {
            	procedimentos.remove(i);
            }
        }
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "\n" + "\nNome" + nome + "\nDescricao" + descricao + "\nPreco" + preco 
			 + "____________________________________";
	}

	
	
	

	
	
}
