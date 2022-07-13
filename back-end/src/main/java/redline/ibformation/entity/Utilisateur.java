package redline.ibformation.entity;

import javax.persistence.*;

/**
 * Classe utilisateur contenant tous les utilisateurs (client, responsable, formateur)
 */
@Entity
public class Utilisateur {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "email")
    private String email;
    @Column(name = "telephone")
    private String telephone;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;

    //Pour le responsable on donne sa fonction et le service auquel il est associé
    @Column(name = "fonction")
    private String fonctionResponsable;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "service_id")
    private Service serviceAssocie;

    //Pour le client on donne le nom de l'entreprise pour laquelle il travaille  et la session à laquelle il est inscrit
    @Column(name = "nom_entreprise")
    private String nomEntreprise;
    @ManyToOne//(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name = "session_id")
    private Session session;

    //Pour le formateur on donne ses années d'expériences et sa note
    @Column(name = "experience")
    private Integer experience;
    @Column(name = "note_formateur")
    private Integer noteFormateur;

    //On ajoute des booléens pour vérifier à quel type d'utilisateur on a affaire
    @Column(name = "est_client")
    private boolean estClient;
    @Column(name = "est_formateur")
    private boolean estFormateur;
    @Column(name = "est_responsable")
    private boolean estResponsable;


    //Constructeurs
    public Utilisateur() {
        super();
    }

    public Utilisateur(String nom, String prenom, String email, String telephone, Adresse adresse, String fonctionResponsable, Service serviceAssocie, String nomEntreprise, Session session, Integer experience, Integer noteFormateur, boolean estClient, boolean estFormateur, boolean estResponsable) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setEmail(email);
        this.setTelephone(telephone);
        this.setAdresse(adresse);
        this.setFonctionResponsable(fonctionResponsable);
        this.setServiceAssocie(serviceAssocie);
        this.setNomEntreprise(nomEntreprise);
        this.setSession(session);
        this.setExperience(experience);
        this.setNoteFormateur(noteFormateur);
        this.setEstClient(estClient);
        this.setEstFormateur(estFormateur);
        this.setEstResponsable(estResponsable);
    }

    public Utilisateur(Long id, String nom, String prenom, String email, String telephone, Adresse adresse, String fonctionResponsable, Service serviceAssocie, String nomEntreprise,Session session, Integer experience, Integer noteFormateur, boolean estClient, boolean estFormateur, boolean estResponsable) {
        this.setId(id);
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setEmail(email);
        this.setTelephone(telephone);
        this.setAdresse(adresse);
        this.setFonctionResponsable(fonctionResponsable);
        this.setServiceAssocie(serviceAssocie);
        this.setNomEntreprise(nomEntreprise);
        this.setSession(session);
        this.setExperience(experience);
        this.setNoteFormateur(noteFormateur);
        this.setEstClient(estClient);
        this.setEstFormateur(estFormateur);
        this.setEstResponsable(estResponsable);
    }

    //getters
    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public String getFonctionResponsable() {
        return fonctionResponsable;
    }

    public Service getServiceAssocie() {
        return serviceAssocie;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public Session getSession() {
        return session;
    }

    public Integer getExperience() {
        return experience;
    }

    public Integer getNoteFormateur() {
        return noteFormateur;
    }

    public boolean isEstClient() {
        return estClient;
    }

    public boolean isEstFormateur() {
        return estFormateur;
    }

    public boolean isEstResponsable() {
        return estResponsable;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setFonctionResponsable(String fonctionResponsable) {
        this.fonctionResponsable = fonctionResponsable;
    }

    public void setServiceAssocie(Service serviceAssocie) {
        this.serviceAssocie = serviceAssocie;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public void setNoteFormateur(Integer noteFormateur) {
        this.noteFormateur = noteFormateur;
    }

    public void setEstClient(boolean estClient) {
        this.estClient = estClient;
    }

    public void setEstFormateur(boolean estFormateur) {
        this.estFormateur = estFormateur;
    }

    public void setEstResponsable(boolean estResponsable) {
        this.estResponsable = estResponsable;
    }
}
