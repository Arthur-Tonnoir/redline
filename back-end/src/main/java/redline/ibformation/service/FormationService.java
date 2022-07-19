package redline.ibformation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import redline.ibformation.dao.FormationDao;
import redline.ibformation.entity.Formation;

import java.util.List;
import java.util.Optional;

@Service
public class FormationService {

    @Autowired
    private FormationDao formationDao;

    public List<Formation> findAll(){
        return this.formationDao.findAll();
    }

    /**
     * Methode permettant de trouver la formation grace à son id
     * @param id
     * @return Theme
     */
    public Formation findById(Long id){
        Optional<Formation> optFormation = this.formationDao.findById(id);
        if (optFormation.isPresent()) {
            return optFormation.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Methode permettant de créer une nouvelle formation
     * @param formation
     * @return Formation
     */
    public Formation create(Formation formation) {
        return this.formationDao.save(formation);
    }

    /**
     * Methode qui permet de mettre à jour le theme dans la table theme
     * et qui renvoie une erreur si le theme est introuvable
     * @param formation
     * @return Formation
     */
    public Formation update(Formation formation) {
        if (!this.formationDao.existsById(formation.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver la formation à mettre à jour");
        }
        return this.formationDao.save(formation);
    }

    /**
     * supprime une formation par son id
     * @param id
     */
    public void delete(Long id) {
        if (!this.formationDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver le thème à supprimer");
        }
        this.formationDao.deleteById(id);
        if (this.formationDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED,
                    "Erreur lors de la suppression du thème");
        }
    }
}
