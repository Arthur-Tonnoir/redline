package redline.ibformation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Service {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nom_service")
    private String nomService;

    //Constructeurs
    public Service() {
        super();
    }

    public Service(String nomService) {
        super();
        this.setNomService(nomService);
    }

    public Service(Long id, String nomService) {
        super();
        this.setId(id);
        this.setNomService(nomService);
    }

    //getters
    public Long getId() {
        return id;
    }

    public String getNomService() {
        return nomService;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomService(String nomService) {
        this.nomService = nomService;
    }
}
