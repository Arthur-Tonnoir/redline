package redline.ibformation.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Classe SousTheme
 */
@Entity
public class SousTheme {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nom_soustheme")
    private String nomSousTheme;
    @ManyToOne
    @JoinColumn(name = "theme_id")
    private Theme theme;
    @ManyToMany
    @JoinTable(name = "soustheme_formation", joinColumns = @JoinColumn(name = "soustheme_id"), inverseJoinColumns = @JoinColumn(name = "formation_id"))
    private List<Formation> listFormation;
    //voir si on doit utiliser set formation ou une seule formation
    //private Formation formation;

    //Constructeurs
    public SousTheme() {
        super();
    }

    public SousTheme(String nomSousTheme,Theme theme, List<Formation> formationSet) {
        super();
        this.setNomSousTheme(nomSousTheme);
        this.setTheme(theme);
        this.setFormations(formationSet);
    }

    public SousTheme(Long id, String nomSousTheme,Theme theme, List<Formation> formationSet) {
        super();
        this.setId(id);
        this.setNomSousTheme(nomSousTheme);
        this.setTheme(theme);
        this.setFormations(formationSet);
    }

    //getters
    public Long getId() {
        return id;
    }

    public String getNomSousTheme() {
        return nomSousTheme;
    }

    public Theme getTheme() {
        return theme;
    }

    public List<Formation> getFormations() {
        return listFormation;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomSousTheme(String nomSousTheme) {
        this.nomSousTheme = nomSousTheme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public void setFormations(List<Formation> formationSet) {
        this.listFormation = formationSet;
    }
}
