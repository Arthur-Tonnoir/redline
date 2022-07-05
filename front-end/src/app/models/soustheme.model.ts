import Theme from "./theme.model";

export default interface SousTheme extends Theme {
  id: number;
  nomSousTheme: string;
  theme: Theme;
}
