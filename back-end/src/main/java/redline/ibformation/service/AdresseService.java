package redline.ibformation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import redline.ibformation.dao.AdresseDao;
import redline.ibformation.entity.Adresse;

import java.util.List;
import java.util.Optional;

@Service
public class AdresseService {
    @Autowired
    private AdresseDao adresseDao;

    /**
     * Methode qui renvoie la liste de toutes les adresses da la table adresse
     * @return List<Adresse>
     */
    public List<Adresse> findAll(){
        return this.adresseDao.findAll();
    }

    /**
     * Methode permettant de trouver l'adresse grace à son id
     * @param id
     * @return Adresse
     */
    public Adresse findById(Long id){
        Optional<Adresse> optAdresse = this.adresseDao.findById(id);
        if (optAdresse.isPresent()) {
            return optAdresse.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Methode permettant de créer une nouvelle adresse
     * @param adresse
     * @return Adresse
     */
    public Adresse create(Adresse adresse) {
        return this.adresseDao.save(adresse);
    }

    /**
     * Methode qui permet de mettre à jour l'adresse dans la table adresse
     * et qui renvoie une erreur si l'adresse est introuvable
     * @param adresse
     * @return Adresse
     */
    public Adresse update(Adresse adresse) {
        if (!this.adresseDao.existsById(adresse.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver l'adresse à mettre à jour");
        }
        return this.adresseDao.save(adresse);
    }

    public void delete(Long id) {
        if (!this.adresseDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver l'adresse à supprimer");
        }
        this.adresseDao.deleteById(id);
        if (this.adresseDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED,
                    "Erreur lors de la suppression de l'adresse");
        }
    }
}
