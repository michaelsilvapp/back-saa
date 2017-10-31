package backsaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import backsaa.entity.AlunoEntity;
import backsaa.entity.SolicitacaoEntity;

@Repository
public interface SolicitacaoRepository extends JpaRepository<SolicitacaoEntity, Integer>  {
   

	
	
	//@Query(value = "SELECT * FROM SolicitacaoEntity s INNER JOIN AlunoEntity a ON s.idAluno = :a.idAluno" ).setParameter
	//("idaluno", idaluno).getSingleResult()
	
    @Query(value="Select u.idAluno from AlunoEntity u where u.idAluno=:idaluno")
     public AlunoEntity buscaid(@Param("idaluno") int idAluno);
    
    
}
