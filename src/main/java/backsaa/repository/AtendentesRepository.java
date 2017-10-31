package backsaa.repository;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import backsaa.entity.AtendentesEntity;


@Repository
public interface AtendentesRepository extends JpaRepository<AtendentesEntity, Integer> {
	
	//@Query(value = "Select a.*, s.setor from AtendentesEntity a INNER JOIN SetoresEntity s")
	//public List listAtendente();
  
	//public List<AtendentesEntity> getAll() {
		//return getSession().createQuery("from AtendentesEntity s inner join SetoresEntity s").list();
	
}
