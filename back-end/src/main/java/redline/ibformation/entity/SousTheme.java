package redline.ibformation.entity;

import javax.persistence.*;
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
    Set<Formation> formationSet;
    //voir si on doit utiliser set formation ou une seule formation
    //private Formation formation;

    //Constructeurs
    public SousTheme() {
        super();
    }

    public SousTheme(String nomSousTheme,Theme theme, Set<Formation> formationSet) {
        super();
        this.setNomSousTheme(nomSousTheme);
        this.setTheme(theme);
        this.setFormationSet(formationSet);
    }

    public SousTheme(Long id, String nomSousTheme,Theme theme, Set<Formation> formationSet) {
        super();
        this.setId(id);
        this.setNomSousTheme(nomSousTheme);
        this.setTheme(theme);
        this.setFormationSet(formationSet);
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

    public Set<Formation> getFormationSet() {
        return formationSet;
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

    public void setFormationSet(Set<Formation> formationSet) {
        this.formationSet = formationSet;
    }
}
