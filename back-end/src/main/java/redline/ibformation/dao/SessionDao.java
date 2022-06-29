package redline.ibformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import redline.ibformation.entity.Session;
@Repository
public interface SessionDao extends JpaRepository<Session, Long> {
}
