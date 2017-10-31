package backsaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backsaa.entity.HorariosEntity;

@Repository
public interface HorariosRepository extends JpaRepository<HorariosEntity, Integer>  {

}
