package redline.ibformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import redline.ibformation.entity.Domaine;
import redline.ibformation.service.DomaineService;

import java.util.List;

@RestController
@RequestMapping("/Domaine")
public class DomaineController {

    @Autowired
    private DomaineService domaineService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Domaine> findAll(){
        return this.domaineService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Domaine findById(@PathVariable Long id) {
        return this.domaineService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Domaine create(@RequestBody Domaine domaine) {
        return this.domaineService.create(domaine);
    }

    @PostMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Domaine update(@RequestBody Domaine domaine,@PathVariable Long id) {
        if (!id.equals(domaine.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Mauvaise domaine à mettre à jour");
        }
        return this.domaineService.update(domaine);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        this.domaineService.delete(id);
    }
}
