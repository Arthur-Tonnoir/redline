package redline.ibformation.entity;

import javax.persistence.*;

@Entity
public class Evaluation {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "note_formateur")
    private int noteFormateur;
    @Column(name = "note_formation")
    private int noteFormation;
    @OneToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
    @ManyToOne
    @JoinColumn(name = "session_id")
    private Session session;

    //Constructeurs

    public Evaluation() {
        super();
    }

    public Evaluation(int noteFormateur, int noteFormation, Utilisateur utilisateur, Session session) {
        super();
        this.setNoteFormateur(noteFormateur);
        this.setNoteFormation(noteFormation);
        this.setUtilisateur(utilisateur);
        this.setSession(session);
    }

    public Evaluation(Long id, int noteFormateur, int noteFormation, Utilisateur utilisateur, Session session) {
        super();
        this.setId(id);
        this.setNoteFormateur(noteFormateur);
        this.setNoteFormation(noteFormation);
        this.setUtilisateur(utilisateur);
        this.setSession(session);
    }
    //getters

    public Long getId() {
        return id;
    }

    public int getNoteFormateur() {
        return noteFormateur;
    }

    public int getNoteFormation() {
        return noteFormation;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public Session getSession() {
        return session;
    }

    //setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setNoteFormateur(int noteFormateur) {
        this.noteFormateur = noteFormateur;
    }

    public void setNoteFormation(int noteFormation) {
        this.noteFormation = noteFormation;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
