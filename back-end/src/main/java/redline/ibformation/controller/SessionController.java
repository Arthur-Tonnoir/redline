package redline.ibformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import redline.ibformation.entity.Session;
import redline.ibformation.service.SessionService;

import java.util.List;

@RestController
@RequestMapping("/Session")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Session> findAll(){
        return this.sessionService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Session findById(@PathVariable Long id) {
        return this.sessionService.findById(id);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Session create(@RequestBody Session session) {
        return this.sessionService.create(session);
    }

    @PostMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Session update(@RequestBody Session session, @PathVariable Long id) {
        if (!id.equals(session.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Mauvaise session à mettre à jour");
        }
        return this.sessionService.update(session);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        this.sessionService.delete(id);
    }
}
