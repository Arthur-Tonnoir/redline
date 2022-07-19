package redline.ibformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import redline.ibformation.entity.Evaluation;

@Repository
public interface EvaluationDao extends JpaRepository<Evaluation, Long> {
}
