package redline.ibformation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe Domaine
 */
@Entity
public class Domaine {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nom_domaine")
    private String nomDomaine;

    //Constructeurs
    public Domaine() {
        super();
    }

    public Domaine(String nomDomaine) {
        super();
        this.setNomDomaine(nomDomaine);
    }

    public Domaine(Long id, String nomDomaine) {
        super();
        this.setId(id);
        this.setNomDomaine(nomDomaine);
    }

    //getters
    public Long getId() {
        return id;
    }

    public String getNomDomaine() {
        return nomDomaine;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomDomaine(String nomDomaine) {
        this.nomDomaine = nomDomaine;
    }
}
