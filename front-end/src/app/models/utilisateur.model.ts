import Adresse from "./adresse.model";
import Session from "./session.model";

export default interface Utilisateur{
  id: number;
  nom: string;
  prenom: string;
  email: string;
  telephone: string;
  adresse: Adresse;
  fonctionResponsable: string;
  serviceAssocie: string;
  nomEntreprise: string;
  session: Session;
  experience: number;
  noteFormateur: number;
  estClient: boolean;
  estFormateur: boolean;
  estResponsable: boolean;
}
