package backsaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backsaa.entity.SetoresEntity;

@Repository
public interface SetoresRepository extends JpaRepository<SetoresEntity, Integer> {

}
