package redline.ibformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import redline.ibformation.entity.Service;

@Repository
public interface ServiceDao extends JpaRepository<Service, Long> {
}
