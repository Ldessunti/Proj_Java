import java.util.ArrayList;

public class Consulta {
	
	ArrayList <Paciente> pacientes = new ArrayList<>();
	ArrayList <Medico> medicos = new ArrayList<>();
	ArrayList <Consulta> consultas = new ArrayList<>();

	private String data;
	private Paciente paciente;
	private Medico medico;
	
	public Consulta(Paciente paciente1, Medico medico1, String data) {
		this.paciente = paciente1;
		this.medico = medico1;
		this.data = data;
	}
	
	public void agendaConsulta(Consulta consult1, String nomePaciente, String nomeMedico) {
		
		for(Paciente p : pacientes) {
			if(!p.getNome().equals(nomePaciente)) {
				System.out.println("Nome do Paciente não encontrado!");
				return;
			}else {
				this.paciente.setNome(nomePaciente);
			}
		}
		
		for(Medico m : medicos) {
			if(!m.getNome().equals(nomeMedico)) {
				System.out.println("Nome do Médico não encontrado!");
				return;
			}else {
				this.medico.setNome(nomeMedico);
			}
		}
				
		consultas.add(consult1);
	}
	public void listaConsulta() {
		//Lista todas Consultas
		System.out.println("--- Lista de Consultas ---\n");
		
		if(consultas.isEmpty()) {
			System.out.println("Nenhuma Consulta agendada!");
		}else {
			for(Consulta c : consultas) {
				System.out.println(c.toString());
			}
		}
	}
	public void visualizaConsulta(String dataConsulta) {
		//Visualiza todas Consultas de um paciente ou medico
		
		for(Consulta c : consultas) {
			if(c.getData().equals(dataConsulta)) {
				System.out.println(c.toString());
			}else {
				System.out.println("Data digitada não encontrada!");
			}
		}
	}
	public boolean editaAgendamento(String dataConsulta) {
		boolean flag = false;
        for (Consulta c : consultas) {
            if (c.getData() == data) {
                flag = true;
            }
        }
        return flag;
	}
	public void removeAgendamento (String dataConsulta) {
		for(int i = 0; i < consultas.size(); i++) {
			Consulta c = consultas.get(i);
            if(c.getData().equals(dataConsulta)) {
            	consultas.remove(i);
            }
        }
	}

	
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	@Override
	public String toString() {
		return "Consulta de " + paciente.getNome() + " com o Dr. " + medico.getNome() + " foi agendada para dia " + getData() + "\n";

	}
	
	
	
	
	
	
}
