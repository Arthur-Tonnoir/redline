import Formation from "./formation.model";

export default interface Session{
  id: number;
  lieuFormation: string;
  dateDebut: Date;
  dateFin: Date;
  type: string;
  idFormation: Formation;
}
