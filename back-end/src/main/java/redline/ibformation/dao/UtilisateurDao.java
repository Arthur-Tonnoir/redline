package redline.ibformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import redline.ibformation.entity.Utilisateur;
@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {
}
