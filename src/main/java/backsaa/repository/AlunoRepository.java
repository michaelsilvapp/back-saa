package backsaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import backsaa.entity.AlunoEntity;


@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, Integer>  {
	
	  @Query(value="select a from AlunoEntity a where a.email = :email and a.senha = :senha")
	    public AlunoEntity authenticate(@Param("email") String email, @Param("senha") String senha);
	
}
