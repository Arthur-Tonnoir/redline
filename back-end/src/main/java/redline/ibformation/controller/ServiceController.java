package redline.ibformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import redline.ibformation.entity.Service;
import redline.ibformation.service.ServiceService;

import java.util.List;
@RestController
@RequestMapping("/Service")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Service> findAll(){
        return this.serviceService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Service findById(@PathVariable Long id) {
        return this.serviceService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Service create(@RequestBody Service service) {
        return this.serviceService.create(service);
    }

    @PostMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Service update(@RequestBody Service service, @PathVariable Long id) {
        if (!id.equals(service.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Mauvais service à mettre à jour");
        }
        return this.serviceService.update(service);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        this.serviceService.delete(id);
    }
}
