package redline.ibformation.entity;

import javax.persistence.*;

@Entity
public class Adresse {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "numero")
    private Long numero;
    @Column(name = "rue")
    private String rue;
    @Column(name = "complement")
    private String complement;
    @Column(name = "codepostal")
    private Long codePostal;
    @Column(name = "ville")
    private String ville;

    //Costructeurs (vide, sans id, avec id)

    /**
     * permet de créer une adresse vide
     */
    public Adresse() {
        super();
    }
    /**
     * permet de créer une adresse sans son numéro d'identification id
     * @param numero Long
     * @param rue String
     * @param complement String
     * @param codePostal Long
     * @param ville String
     */
    public Adresse(Long numero, String rue, String complement, Long codePostal, String ville) {
        super();
        this.setNumero(numero);
        this.setRue(rue);
        this.setComplement(complement);
        this.setCodePostal(codePostal);
        this.setVille(ville);
    }

    /**
     * permet de créer une adresse avec son numéro d'identification id
     * @param id Long
     * @param numero Long
     * @param rue String
     * @param complement String
     * @param codePostal Long
     * @param ville String
     */
    public Adresse(Long id, Long numero, String rue, String complement, Long codePostal, String ville) {
        this.setId(id);
        this.setNumero(numero);
        this.setRue(rue);
        this.setComplement(complement);
        this.setCodePostal(codePostal);
        this.setVille(ville);
    }

    //getters

    /**
     * permet de récupérer l'id d'une adresse
     * @return id : Long
     */
    public Long getId() {
        return id;
    }
    /**
     * permet de récupérer le numéro de la rue d'une adresse
     * @return numero : Long
     */
    public Long getNumero() {
        return numero;
    }
    /**
     * permet de récupérer le nom de la rue d'une adresse
     * @return rue : String
     */
    public String getRue() {
        return rue;
    }
    /**
     * permet de récupérer le complement de la rue d'une adresse
     * @return complement : String
     */
    public String getComplement() {
        return complement;
    }
    /**
     * permet de récupérer le code postal de la rue d'une adresse
     * @return codePostal : Long
     */
    public Long getCodePostal() {
        return codePostal;
    }
    /**
     * permet de récupérer la ville d'une adresse
     * @return ville : String
     */
    public String getVille() {
        return ville;
    }

    // setters

    /**
     * permet de changer l'id d'adresse avec celui qu'on lui a mis en paramètre
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * permet de changer le numero de la rue avec celui qu'on lui a mis en paramètre
     * @param numero
     */
    public void setNumero(Long numero) {
        this.numero = numero;
    }
    /**
     * permet de changer le nom de la rue avec celui qu'on lui a mis en paramètre
     * @param rue
     */
    public void setRue(String rue) {
        this.rue = rue;
    }
    /**
     * permet d'ajouter un complement d'adresse (s'il yen a) avec celui qu'on lui a mis en paramètre
     * @param complement
     */
    public void setComplement(String complement) {
        this.complement = complement;
    }
    /**
     * permet de changer le code postal de l'adresse celui qu'on lui a mis en paramètre
     * @param codePostal
     */
    public void setCodePostal(Long codePostal) {
        this.codePostal = codePostal;
    }
    /**
     * permet de changer la ville de l'adresse celle qu'on lui a mis en paramètre
     * @param ville
     */
    public void setVille(String ville) {
        this.ville = ville;
    }
}
