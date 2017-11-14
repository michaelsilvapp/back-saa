package backsaa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import backsaa.entity.AlunoEntity;
import backsaa.entity.SolicitacaoEntity;

@Repository
public interface SolicitacaoRepository extends JpaRepository<SolicitacaoEntity, Integer>  {
   

    @Query(value="SELECT s from SolicitacaoEntity s LEFT JOIN fetch s.alunos LEFT JOIN fetch s.setores")
    public List<SolicitacaoEntity> getSoliStudent();
    
	
    
    @Query(value="SELECT hr_atendimento, count(hr_atendimento) from SolicitacaoEntity group by hr_atendimento")
    public List<String[]> getHorarios();
    
    
}
