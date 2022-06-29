package redline.ibformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import redline.ibformation.entity.Formation;

@Repository
public interface FormationDao extends JpaRepository<Formation, Long> {
}
