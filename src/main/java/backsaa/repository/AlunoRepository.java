package backsaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backsaa.entity.AlunoEntity;


@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, Integer>  {
	
	
	
}
