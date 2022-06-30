package redline.ibformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import redline.ibformation.entity.Domaine;

@Repository
public interface DomaineDao extends JpaRepository<Domaine, Long> {
}
