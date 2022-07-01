insert into redline.adresse set id=1,codepostal='59000', complement='porte blanche', numero='18', rue='rue de la mer',ville='Lille';
insert into redline.adresse set id=2,codepostal='59000', complement='', numero='281', rue='rue bailly',ville='Lille';
insert into redline.adresse set id=3,codepostal='96500', complement='bis', numero='57', rue='rue de la barbade',ville='Paris';
insert into redline.adresse set id=4,codepostal='75400', complement='', numero='21', rue='rue de la plage',ville='Bordeaux';
insert into redline.adresse set id=5,codepostal='62360', complement='hyppodrome', numero='1', rue='rue de la bête',ville='Arras';

insert into redline.domaine set id=1,nom_domaine='Informatique';
insert into redline.domaine set id=2,nom_domaine='Bureautique';
insert into redline.domaine set id=3,nom_domaine='Management';
insert into redline.domaine set id=4,nom_domaine='Finance';
insert into redline.domaine set id=5,nom_domaine='Ressources humaines';

insert into redline.theme set id=1,nom_theme='Réseaux', domaine_id=1;
insert into redline.theme set id=2,nom_theme='Systèmes d’exploitation', domaine_id=1;
insert into redline.theme set id=3,nom_theme='Gestion de projets', domaine_id=1;
insert into redline.theme set id=4,nom_theme='Langages de développement', domaine_id=1;
insert into redline.theme set id=5,nom_theme='Télécommunications', domaine_id=1;

insert into redline.sous_theme set id=1,nom_soustheme='JAVA',theme_id=4;
insert into redline.sous_theme set id=2,nom_soustheme='Langages du WEB',theme_id=4;
insert into redline.sous_theme set id=3,nom_soustheme='C#',theme_id=4;
insert into redline.sous_theme set id=4,nom_soustheme='C++',theme_id=4;
insert into redline.sous_theme set id=5,nom_soustheme='XML',theme_id=4;

insert into redline.formation set id=1,nom_formation='JAVA',contenu="text",prix_formation=1500;
insert into redline.formation set id=2,nom_formation='PHP',contenu="text",prix_formation=3600;
insert into redline.formation set id=3,nom_formation='XML',contenu="text",prix_formation=1300;
insert into redline.formation set id=4,nom_formation='Ajax',contenu="text",prix_formation=1200;
insert into redline.formation set id=5,nom_formation='Javascript',contenu="text",prix_formation=5500;

insert into redline.soustheme_formation set soustheme_id=2,formation_id=1;
insert into redline.soustheme_formation set soustheme_id=2,formation_id=2;
insert into redline.soustheme_formation set soustheme_id=2,formation_id=3;
insert into redline.soustheme_formation set soustheme_id=2,formation_id=4;
insert into redline.soustheme_formation set soustheme_id=2,formation_id=5;

insert into redline.service set id=1,nom_service='Service commercial';
insert into redline.service set id=2,nom_service='Service logistique';
insert into redline.service set id=3,nom_service='Service SAV';
insert into redline.service set id=4,nom_service='Service monitoring';
insert into redline.service set id=5,nom_service='Service planning';

insert into redline.session set id=1,lieu_formation='Lille',debut_session='2022-05-24',fin_session='2022-08-23',type_session='inter',formation_id=3;
insert into redline.session set id=2,lieu_formation='Lille',debut_session='2022-08-24',fin_session='2022-12-23',type_session='inter',formation_id=3;
insert into redline.session set id=3,lieu_formation='Lille',debut_session='2022-12-24',fin_session='2023-03-23',type_session='inter',formation_id=3;
insert into redline.session set id=4,lieu_formation='Lille',debut_session='2023-03-24',fin_session='2023-06-23',type_session='inter',formation_id=3;
insert into redline.session set id=5,lieu_formation='Lille',debut_session='2023-06-24',fin_session='2023-09-23',type_session='inter',formation_id=3;

insert into redline.utilisateur set id=1,nom='TONNOIR',prenom='Arthur',email='arthurtonnoir@yahoo.cr',telephone='0618254789',adresse_id=1,fonction='',nom_entreprise='',experience=5,note_formateur=4,est_client=false,est_formateur=true,est_responsable=false;
insert into redline.utilisateur set id=2,nom='Vasseur',prenom='Christophe',email='christophevasseur@yahoo.cr',telephone='0718253989',adresse_id=2,fonction='Responsable commercial',service_id=1,nom_entreprise='itTraining',est_client=false,est_formateur=false,est_responsable=true;
insert into redline.utilisateur set id=3,nom='Barre',prenom='Thomas',email='thomasbarre@yahoo.cr',telephone='0622254589',adresse_id=3,fonction='',nom_entreprise='Boulot&co',session_id=1,est_client=true,est_formateur=false,est_responsable=false;
insert into redline.utilisateur set id=4,nom='Lahroussi',prenom='Amine',email='aminelahroussi@yahoo.cr',telephone='0610251709',adresse_id=4,fonction='',nom_entreprise='',est_client=false,est_formateur=false,est_responsable=false;
insert into redline.utilisateur set id=5,nom='Deschamps',prenom='Sebastien',email='sebastiendeschamps@yahoo.cr',telephone='0741254781',adresse_id=5,fonction='',nom_entreprise='Galette&co',session_id=2,est_client=true,est_formateur=false,est_responsable=false;

insert into redline.evaluation set id=1,note_formateur=3,note_formation=2,utilisateur_id=5;
insert into redline.evaluation set id=2,note_formateur=5,note_formation=4,utilisateur_id=3;