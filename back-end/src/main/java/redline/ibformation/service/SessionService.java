package redline.ibformation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import redline.ibformation.dao.SessionDao;
import redline.ibformation.entity.Session;

import java.util.List;
import java.util.Optional;

@Service
public class SessionService {

    @Autowired
    private SessionDao sessionDao;

    public List<Session> findAll(){
        return this.sessionDao.findAll();
    }

    /**
     * Methode permettant de trouver la session grace à son id
     * @param id
     * @return Session
     */
    public Session findById(Long id){
        Optional<Session> optSession = this.sessionDao.findById(id);
        if (optSession.isPresent()) {
            return optSession.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Methode permettant de créer une nouvelle session
     * @param session
     * @return Session
     */
    public Session create(Session session) {
        return this.sessionDao.save(session);
    }

    /**
     * Methode qui permet de mettre à jour la session dans la table session
     * et qui renvoie une erreur si la session est introuvable
     * @param session
     * @return Session
     */
    public Session update(Session session) {
        if (!this.sessionDao.existsById(session.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver la session à mettre à jour");
        }
        return this.sessionDao.save(session);
    }

    /**
     * supprime une session par son id
     * @param id
     */
    public void delete(Long id) {
        if (!this.sessionDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver la session à supprimer");
        }
        this.sessionDao.deleteById(id);
        if (this.sessionDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED,
                    "Erreur lors de la suppression de la session");
        }
    }
}
