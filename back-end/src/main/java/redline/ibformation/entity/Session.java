package redline.ibformation.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Session {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "lieu_formation")
    private String lieuFormation;
    @Column(name = "debut_session")
    private Date debutSession;
    @Column(name = "fin_session")
    private Date finSession;
    @Column(name = "type_session")
    private String typeSession;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "formation_id")
    private Formation formation;

   // @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
   // private List<Utilisateur> utilisateurList;

    //Constructeurs
    public Session() {
        super();
    }

    public Session(String lieuFormation, Date debutSession, Date finSession, String typeSession, Formation formation) {
        super();
        this.setLieuFormation(lieuFormation);
        this.setDebutSession(debutSession);
        this.setFinSession(finSession);
        this.setTypeSession(typeSession);
        this.setFormation(formation);
    }

    public Session(Long id, String lieuFormation, Date debutSession, Date finSession, String typeSession, Formation formation) {
        super();
        this.setId(id);
        this.setLieuFormation(lieuFormation);
        this.setDebutSession(debutSession);
        this.setFinSession(finSession);
        this.setTypeSession(typeSession);
        this.setFormation(formation);
    }

    //getters
    public Long getId() {
        return id;
    }

    public String getLieuFormation() {
        return lieuFormation;
    }

    public Date getDebutSession() {
        return debutSession;
    }

    public Date getFinSession() {
        return finSession;
    }

    public String getTypeSession() {
        return typeSession;
    }

    public Formation getFormation() {
        return formation;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setLieuFormation(String lieuFormation) {
        this.lieuFormation = lieuFormation;
    }

    public void setDebutSession(Date debutSession) {
        this.debutSession = debutSession;
    }

    public void setFinSession(Date finSession) {
        this.finSession = finSession;
    }

    public void setTypeSession(String typeSession) {
        this.typeSession = typeSession;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }
}
