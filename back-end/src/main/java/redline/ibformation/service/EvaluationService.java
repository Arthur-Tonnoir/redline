package redline.ibformation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import redline.ibformation.dao.EvaluationDao;
import redline.ibformation.entity.Evaluation;

import java.util.List;
import java.util.Optional;
@Service
public class EvaluationService {

    @Autowired
    private EvaluationDao evaluationDao;

    public List<Evaluation> findAll(){
        return this.evaluationDao.findAll();
    }

    /**
     * Methode permettant de trouver l'évaluation grace à son id
     * @param id
     * @return Evaluation
     */
    public Evaluation findById(Long id){
        Optional<Evaluation> optEvaluation = this.evaluationDao.findById(id);
        if (optEvaluation.isPresent()) {
            return optEvaluation.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Methode permettant de créer une nouvelle evaluation
     * @param evaluation
     * @return Evaluation
     */
    public Evaluation create(Evaluation evaluation) {
        return this.evaluationDao.save(evaluation);
    }

    /**
     * Methode qui permet de mettre à jour l'évaluation dans la table evaluation
     * et qui renvoie une erreur si l'évaluation est introuvable
     * @param evaluation
     * @return Evaluation
     */
    public Evaluation update(Evaluation evaluation) {
        if (!this.evaluationDao.existsById(evaluation.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver l'évaluation à mettre à jour");
        }
        return this.evaluationDao.save(evaluation);
    }

    /**
     * supprime une évaluation par son id
     * @param id
     */
    public void delete(Long id) {
        if (!this.evaluationDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver l'évaluation à supprimer");
        }
        this.evaluationDao.deleteById(id);
        if (this.evaluationDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED,
                    "Erreur lors de la suppression de l'évaluation");
        }
    }
}
