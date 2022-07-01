package redline.ibformation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import redline.ibformation.dao.ThemeDao;
import redline.ibformation.entity.Theme;

import java.util.List;
import java.util.Optional;

@Service
public class ThemeService {
    @Autowired
    private ThemeDao themeDao;

    public List<Theme> findAll(){
        return this.themeDao.findAll();
    }

    /**
     * Methode permettant de trouver le theme grace à son id
     * @param id
     * @return Theme
     */
    public Theme findById(Long id){
        Optional<Theme> optTheme = this.themeDao.findById(id);
        if (optTheme.isPresent()) {
            return optTheme.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Methode permettant de créer un nouveau theme
     * @param theme
     * @return Theme
     */
    public Theme create(Theme theme) {
        return this.themeDao.save(theme);
    }

    /**
     * Methode qui permet de mettre à jour le theme dans la table theme
     * et qui renvoie une erreur si le theme est introuvable
     * @param theme
     * @return Theme
     */
    public Theme update(Theme theme) {
        if (!this.themeDao.existsById(theme.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver le thème à mettre à jour");
        }
        return this.themeDao.save(theme);
    }

    /**
     * supprime un thème par son id
     * @param id
     */
    public void delete(Long id) {
        if (!this.themeDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Impossible de trouver le thème à supprimer");
        }
        this.themeDao.deleteById(id);
        if (this.themeDao.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED,
                    "Erreur lors de la suppression du thème");
        }
    }
}
