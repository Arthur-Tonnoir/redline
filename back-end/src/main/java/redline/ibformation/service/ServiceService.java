package redline.ibformation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import redline.ibformation.dao.ServiceDao;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceService {

    @Autowired
    private ServiceDao serviceDao;

    public List<redline.ibformation.entity.Service> findAll(){
        return this.serviceDao.findAll();
    }

    /**
     * Methode permettant de trouver le service grace à son id
     * @param id
     * @return Service
     */
    public redline.ibformation.entity.Service findById(Long id){
        Optional<redline.ibformation.entity.Service> optService = this.serviceDao.findById(id);
        if (optService.isPresent()) {
            return optService.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Methode permettant de créer un nouveau service
     * @param service
     * @return Service
     */
    public redline.ibformation.entity.Service create(redline.ibformation.entity.Service service) {
        return this.serviceDao.save(service);
    }

    /**
     * Methode qui permet de mettre à jour un service dans la table service
     * et qui renvoie une erreur si le service est introuvable
     * @param service
     * @return Service
     */
    public redline.ibformation.entity.Service update(redline.ibformation.entity.Service service) {
        if (!this.serviceDao.existsById(service.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver le service à mettre à jour");
        }
        return this.serviceDao.save(service);
    }

    /**
     * supprime un service par son id
     * @param id
     */
    public void delete(Long id) {
        if (!this.serviceDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver le service à supprimer");
        }
        this.serviceDao.deleteById(id);
        if (this.serviceDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED,
                    "Erreur lors de la suppression du service");
        }
    }
}
