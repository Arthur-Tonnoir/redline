import Domaine from "./domaine.model";

export default interface Theme extends Domaine{
  id: number;
  nomTheme: string;
  id_domaine: number;
}
