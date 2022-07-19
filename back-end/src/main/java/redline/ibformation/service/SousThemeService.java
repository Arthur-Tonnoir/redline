package redline.ibformation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import redline.ibformation.dao.SousThemeDao;
import redline.ibformation.entity.SousTheme;

import java.util.List;
import java.util.Optional;

@Service
public class SousThemeService {

    @Autowired
    private SousThemeDao sousThemeDao;

    public List<SousTheme> findAll(){
        return this.sousThemeDao.findAll();
    }

    /**
     * Methode permettant de trouver le theme grace à son id
     * @param id
     * @return Theme
     */
    public SousTheme findById(Long id){
        Optional<SousTheme> optSousTheme = this.sousThemeDao.findById(id);
        if (optSousTheme.isPresent()) {
            return optSousTheme.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Methode permettant de créer un nouveau SousTheme
     * @param sousTheme
     * @return SousTheme
     */
    public SousTheme create(SousTheme sousTheme) {
        return this.sousThemeDao.save(sousTheme);
    }

    /**
     * Methode qui permet de mettre à jour le soustheme dans la table soustheme
     * et qui renvoie une erreur si le soustheme est introuvable
     * @param sousTheme
     * @return SousTheme
     */
    public SousTheme update(SousTheme sousTheme) {
        if (!this.sousThemeDao.existsById(sousTheme.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver le sousthème à mettre à jour");
        }
        return this.sousThemeDao.save(sousTheme);
    }

    /**
     * supprime un thème par son id
     * @param id
     */
    public void delete(Long id) {
        if (!this.sousThemeDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver le sousthème à supprimer");
        }
        this.sousThemeDao.deleteById(id);
        if (this.sousThemeDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED,
                    "Erreur lors de la suppression du sousthème");
        }
    }
}
