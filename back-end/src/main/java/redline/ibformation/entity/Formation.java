package redline.ibformation.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Formation {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nom_formation")
    private String nomFormation;
    @Column(name = "contenu",length = 65535, columnDefinition = "text")
    private String contenu;
    @Column(name = "prix_formation")
    private Integer prixFormation;

    //Constructeurs
    public Formation() {
        super();
    }

    public Formation(String nomFormation, String contenu, Integer prixFormation) {
        super();
        this.setNomFormation(nomFormation);
        this.setContenu(contenu);
        this.setPrixFormation(prixFormation);
    }

    public Formation(Long id, String nomFormation, String contenu, Integer prixFormation) {
        super();
        this.setId(id);
        this.setNomFormation(nomFormation);
        this.setContenu(contenu);
        this.setPrixFormation(prixFormation);
    }

    //getters
    public Long getId() {
        return id;
    }

    public String getNomFormation() {
        return nomFormation;
    }

    public String getContenu() {
        return contenu;
    }

    public Integer getPrixFormation() {
        return prixFormation;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomFormation(String nomFormation) {
        this.nomFormation = nomFormation;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setPrixFormation(Integer prixFormation) {
        this.prixFormation = prixFormation;
    }
}
