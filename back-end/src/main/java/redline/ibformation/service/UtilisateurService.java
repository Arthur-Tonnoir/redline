package redline.ibformation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import redline.ibformation.dao.SessionDao;
import redline.ibformation.dao.UtilisateurDao;
import redline.ibformation.entity.Session;
import redline.ibformation.entity.Utilisateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurDao utilisateurDao;

    public List<Utilisateur> findAll(){
        return this.utilisateurDao.findAll();
    }

    public List<Utilisateur> findAllByEstClientIsTrue(){
        return this.utilisateurDao.findAllByEstClientIsTrue();
    }

    public List<Utilisateur> findAllByEstFormateurIsTrue(){
        return this.utilisateurDao.findAllByEstFormateurIsTrue();
    }

    public List<Utilisateur> findAllByEstResponsableIsTrue(){
        return this.utilisateurDao.findAllByEstResponsableIsTrue();
    }

    /**
     * Methode permettant de trouver l'utilisateur grace à son id
     * @param id
     * @return Utilisateur
     */
    public Utilisateur findById(Long id){
        Optional<Utilisateur> optUtilisateur = this.utilisateurDao.findById(id);
        if (optUtilisateur.isPresent()) {
            return optUtilisateur.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Utilisateur findByEstClientIsTrueAndId(Long id){
        Optional<Utilisateur> optUtilisateur = this.utilisateurDao.findByEstClientIsTrueAndId(id);
        if (optUtilisateur.isPresent()) {
            return optUtilisateur.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Utilisateur findByEstFormateurIsTrueAndId(Long id){
        Optional<Utilisateur> optUtilisateur = this.utilisateurDao.findByEstFormateurIsTrueAndId(id);
        if (optUtilisateur.isPresent()) {
            return optUtilisateur.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Utilisateur findByEstResponsableIsTrueAndId(Long id){
        Optional<Utilisateur> optUtilisateur = this.utilisateurDao.findByEstResponsableIsTrueAndId(id);
        if (optUtilisateur.isPresent()) {
            return optUtilisateur.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Methode permettant de créer un nouvel utilisateur
     * @param utilisateur
     * @return Utilisateur
     */
    public Utilisateur create(Utilisateur utilisateur) {
        return this.utilisateurDao.save(utilisateur);
    }

    /**
     * Methode qui permet de mettre à jour l'utilisateur dans la table utilisateur
     * et qui renvoie une erreur si l'utilisateur est introuvable
     * @param utilisateur
     * @return Utilisateur
     */
    public Utilisateur update(Utilisateur utilisateur) {
        if (!this.utilisateurDao.existsById(utilisateur.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver l'utilisateur à mettre à jour");
        }
        return this.utilisateurDao.save(utilisateur);
    }

    /**
     * supprime un utilisateur par son id
     * @param id
     */
    public void delete(Long id) {
        if (!this.utilisateurDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver l'utilisateur à supprimer");
        }
        this.utilisateurDao.deleteById(id);
        if (this.utilisateurDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED,
                    "Erreur lors de la suppression de l'utilisateur");
        }
    }


}
