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

    //Constructeurs

    public Evaluation() {
        super();
    }

    public Evaluation(int noteFormateur, int noteFormation, Utilisateur utilisateur) {
        super();
        this.setNoteFormateur(noteFormateur);
        this.setNoteFormation(noteFormation);
        this.setUtilisateur(utilisateur);
    }

    public Evaluation(Long id, int noteFormateur, int noteFormation, Utilisateur utilisateur) {
        super();
        this.setId(id);
        this.setNoteFormateur(noteFormateur);
        this.setNoteFormation(noteFormation);
        this.setUtilisateur(utilisateur);
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

}
