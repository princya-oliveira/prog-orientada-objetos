package fatecfranca.edu.br.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import fatecfranca.edu.br.model.Paciente;

// a interface vai herdar os métodos da classe JPARepository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
	
	// esta interface terá todos os métodos para operar com o paciente no BD
	//inserir, remover, consultar e atualizar
	
}
