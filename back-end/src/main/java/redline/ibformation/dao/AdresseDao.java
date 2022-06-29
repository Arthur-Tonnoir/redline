package redline.ibformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import redline.ibformation.entity.Adresse;
@Repository
public interface AdresseDao extends JpaRepository<Adresse, Long> {
}
