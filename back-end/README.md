## Installation

Avant de la lancer le l'application, veuiller modifier les fichiers de configuration, pour installer la base de donnée.
```/src/main/resources/application.properties```

Les lignes à modifier sont : 

```
spring.datasource.url=jdbc:mysql: L'URL de votre serveur Sql + la base donnée (exemple: //localhost:3306/redline)
spring.datasource.username= L'utilisateur
spring.datasource.password= Le mot de passe
```

## Execute 

Se rendre a la racine ```src/main/java/``` et lancer le ```RedLineApplication``` 