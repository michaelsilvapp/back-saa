package backsaa.repository;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import backsaa.entity.AtendentesEntity;


@Repository
public interface AtendentesRepository extends JpaRepository<AtendentesEntity, Integer> {
	

@Query(value = "select a from AtendentesEntity a LEFT JOIN fetch a.setores")
    public  List<AtendentesEntity> getatendentehorario();
	
}
