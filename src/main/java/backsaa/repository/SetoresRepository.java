package backsaa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import backsaa.entity.SetoresEntity;

@Repository
public interface SetoresRepository extends JpaRepository<SetoresEntity, Integer> {
	
	@Query(value= "SELECT s FROM SetoresEntity s LEFT JOIN fetch s.horarios")
    public List<SetoresEntity> gethoraSetor();


}
