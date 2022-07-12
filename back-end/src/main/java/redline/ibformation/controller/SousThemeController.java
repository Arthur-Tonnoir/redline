package redline.ibformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import redline.ibformation.entity.SousTheme;
import redline.ibformation.service.SousThemeService;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("/SousTheme")
public class SousThemeController {

    @Autowired
    private SousThemeService sousThemeService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<SousTheme> findAll(){
        return this.sousThemeService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public SousTheme findById(@PathVariable Long id) {
        return this.sousThemeService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public SousTheme create(@RequestBody SousTheme sousTheme) {
        return this.sousThemeService.create(sousTheme);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public SousTheme update(@RequestBody SousTheme sousTheme,@PathVariable Long id) {
        if (!id.equals(sousTheme.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Mauvais Sousthème à mettre à jour");
        }
        return this.sousThemeService.update(sousTheme);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        this.sousThemeService.delete(id);
    }
}
