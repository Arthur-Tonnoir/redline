import Formation from "./formation.model";

export default interface Session{
  id: number;
  lieuFormation: string;
  debutSession: Date;
  finSession: Date;
  typeSession: string;
  formation: Formation;
}
