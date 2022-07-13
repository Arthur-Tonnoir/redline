package redline.ibformation.entity;

import javax.persistence.*;

@Entity
public class Theme {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nom_theme")
    private String nomTheme;
    @ManyToOne//(cascade = CascadeType.ALL)
    @JoinColumn(name = "domaine_id")
    private Domaine domaineFormation;

    //Constructeurs
    public Theme() {
        super();
    }

    public Theme(String nomTheme, Domaine domaineFormation) {
        this.setNomTheme(nomTheme);
        this.setDomaineFormation(domaineFormation);
    }

    public Theme(Long id, String nomTheme, Domaine domaineFormation) {
        this.setId(id);
        this.setNomTheme(nomTheme);
        this.setDomaineFormation(domaineFormation);
    }

    //getters
    public Long getId() {
        return id;
    }

    public String getNomTheme() {
        return nomTheme;
    }

    public Domaine getDomaineFormation() {
        return domaineFormation;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomTheme(String nomTheme) {
        this.nomTheme = nomTheme;
    }

    public void setDomaineFormation(Domaine domaineFormation) {
        this.domaineFormation = domaineFormation;
    }
}
