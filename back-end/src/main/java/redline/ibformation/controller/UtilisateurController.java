package redline.ibformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import redline.ibformation.entity.Utilisateur;
import redline.ibformation.service.UtilisateurService;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Utilisateur> findAll(){
        return this.utilisateurService.findAll();
    }

    @GetMapping("/Client")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Utilisateur> findAllByEstClientIsTrue(){
        return this.utilisateurService.findAllByEstClientIsTrue();
    }

    @GetMapping("/Formateur")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Utilisateur> findAllByEstFormateurIsTrue(){
        return this.utilisateurService.findAllByEstFormateurIsTrue();
    }

    @GetMapping("/Responsable")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Utilisateur> findAllByEstResponsableIsTrue(){
        return this.utilisateurService.findAllByEstResponsableIsTrue();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Utilisateur findById(@PathVariable Long id) {
        return this.utilisateurService.findById(id);
    }

    @GetMapping("/Client/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Utilisateur findByEstClientIsTrueAndId(@PathVariable Long id) {
        return this.utilisateurService.findByEstClientIsTrueAndId(id);
    }

    @GetMapping("/Formateur/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Utilisateur findByEstFormateurtIsTrueAndId(@PathVariable Long id) {
        return this.utilisateurService.findByEstFormateurIsTrueAndId(id);
    }

    @GetMapping("/Responsable/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Utilisateur findByEstResponsableIsTrueAndId(@PathVariable Long id) {
        return this.utilisateurService.findByEstResponsableIsTrueAndId(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Utilisateur create(@RequestBody Utilisateur utilisateur) {
        return this.utilisateurService.create(utilisateur);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Utilisateur update(@RequestBody Utilisateur utilisateur, @PathVariable Long id) {
        if (!id.equals(utilisateur.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Mauvaise session à mettre à jour");
        }
        return this.utilisateurService.update(utilisateur);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        this.utilisateurService.delete(id);
    }
}
