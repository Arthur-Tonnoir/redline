package redline.ibformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import redline.ibformation.entity.Utilisateur;

import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {

    /**
     * Retourne une liste d'utilisateur qui est client (estClient = true)
     * @return une liste d'utilisateur Client
     */
    public List<Utilisateur> findAllByEstClientIsTrue();

    /**
     * Retourne un utilisateur qui est client (estClient = true) est portant l'id (id)
     * @param id l'id du client à trouver
     * @return si un client porte l'id retourne un utilisateur, sinon retourne null
     */
    public Optional<Utilisateur> findByEstClientIsTrueAndId(Long id);

    /**
     * Retourne une liste d'utilisateur qui est formateur (estFormateur = true)
     * @return une liste d'utilisateur Formateur
     */
    public List<Utilisateur> findAllByEstFormateurIsTrue();

    /**
     * Retourne un utilisateur qui est Formateur (estFormateur = true) est portant l'id (id)
     * @param id l'id du formateur à trouver
     * @return si un formateur porte l'id retourne un utilisateur, sinon retourne null
     */
    public Optional<Utilisateur> findByEstFormateurIsTrueAndId(Long id);

    /**
     * Retourne une liste d'utilisateur qui est responsable (estResponsable = true)
     * @return une liste d'utilisateur Responsable
     */
    public List<Utilisateur> findAllByEstResponsableIsTrue();

    /**
     * Retourne un utilisateur qui est responsable (estResponsable = true) est portant l'id (id)
     * @param id l'id du responsable à trouver
     * @return si un responsable porte l'id retourne un utilisateur, sinon retourne null
     */
    public Optional<Utilisateur> findByEstResponsableIsTrueAndId(Long id);

}
