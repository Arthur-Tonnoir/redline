package redline.ibformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import redline.ibformation.entity.Adresse;
import redline.ibformation.service.AdresseService;

import java.util.List;
@CrossOrigin()
@RestController
@RequestMapping("/Adresse")
public class AdresseController {
    @Autowired
    private AdresseService adresseService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Adresse> findAll(){
        return this.adresseService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Adresse findById(@PathVariable Long id) {
        return this.adresseService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Adresse create(@RequestBody Adresse adresse) {
        return this.adresseService.create(adresse);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Adresse update(@RequestBody Adresse adresse,@PathVariable Long id) {
        if (!id.equals(adresse.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Mauvaise adresse à mettre à jour");
        }
        return this.adresseService.update(adresse);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        this.adresseService.delete(id);
    }
}
