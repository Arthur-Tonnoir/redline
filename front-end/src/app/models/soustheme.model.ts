import Formation from "./formation.model";
import Theme from "./theme.model";

export default interface SousTheme extends Theme {
  id: number;
  nomSousTheme: string;
  theme: Theme;
  formations: Formation[];
}
