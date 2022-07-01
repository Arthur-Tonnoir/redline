package redline.ibformation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import redline.ibformation.dao.DomaineDao;
import redline.ibformation.entity.Domaine;

import java.util.List;
import java.util.Optional;
@Service
public class DomaineService {

    @Autowired
    private DomaineDao domaineDao;

    public List<Domaine> findAll(){
        return this.domaineDao.findAll();
    }

    /**
     * Methode permettant de trouver le domaine grace à son id
     * @param id
     * @return Domaine
     */
    public Domaine findById(Long id){
        Optional<Domaine> optDomaine = this.domaineDao.findById(id);
        if (optDomaine.isPresent()) {
            return optDomaine.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Methode permettant de créer un nouveau domaine
     * @param domaine
     * @return Domaine
     */
    public Domaine create(Domaine domaine) {
        return this.domaineDao.save(domaine);
    }

    /**
     * Methode qui permet de mettre à jour le domaine dans la table domaine
     * et qui renvoie une erreur si le domaine est introuvable
     * @param domaine
     * @return Domaine
     */
    public Domaine update(Domaine domaine) {
        if (!this.domaineDao.existsById(domaine.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver le domaine à mettre à jour");
        }
        return this.domaineDao.save(domaine);
    }

    /**
     * supprime un domaine par son id
     * @param id
     */
    public void delete(Long id) {
        if (!this.domaineDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver le domaine à supprimer");
        }
        this.domaineDao.deleteById(id);
        if (this.domaineDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED,
                    "Erreur lors de la suppression du domaine");
        }
    }
}
