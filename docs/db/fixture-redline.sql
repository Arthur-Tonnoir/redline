insert into redline.adresse set id=1,codepostal='59000', complement='porte blanche', numero='18', rue='rue de la mer',ville='Lille';
insert into redline.adresse set id=2,codepostal='59000', complement='', numero='281', rue='rue bailly',ville='Lille';
insert into redline.adresse set id=3,codepostal='96500', complement='bis', numero='57', rue='rue de la barbade',ville='Paris';
insert into redline.adresse set id=4,codepostal='75400', complement='', numero='21', rue='rue de la plage',ville='Bordeaux';
insert into redline.adresse set id=5,codepostal='62360', complement='hyppodrome', numero='1', rue='rue de la bête',ville='Arras';

insert into redline.domaine set id=1,nom_domaine='Informatique';
insert into redline.domaine set id=2,nom_domaine='Bureautique';
insert into redline.domaine set id=3,nom_domaine='Management';
insert into redline.domaine set id=4,nom_domaine='Finance';

insert into redline.theme set id=1,nom_theme='Réseaux', domaine_id=1;
insert into redline.theme set id=2,nom_theme='Systèmes d’exploitation', domaine_id=1;
insert into redline.theme set id=3,nom_theme='Gestion de projets', domaine_id=1;
insert into redline.theme set id=4,nom_theme='Langages de développement', domaine_id=1;
insert into redline.theme set id=5,nom_theme='Télécommunications', domaine_id=1;
insert into redline.theme set id=6,nom_theme='Débuter avec la bureautique', domaine_id=2;
insert into redline.theme set id=7,nom_theme='Réussir son business plan', domaine_id=3;
insert into redline.theme set id=8,nom_theme='Tous savoir sur la bourse', domaine_id=4;

insert into redline.sous_theme set id=1,nom_soustheme='Langages du WEB',theme_id=4;
insert into redline.sous_theme set id=2,nom_soustheme='JAVA',theme_id=4;
insert into redline.sous_theme set id=3,nom_soustheme='C#',theme_id=4;
insert into redline.sous_theme set id=4,nom_soustheme='C/C++',theme_id=4;
insert into redline.sous_theme set id=5,nom_soustheme='XML',theme_id=4;
insert into redline.sous_theme set id=6,nom_soustheme='Administrateurs réseaux',theme_id=1;
insert into redline.sous_theme set id=7,nom_soustheme='Initiation à Linux',theme_id=2;
insert into redline.sous_theme set id=8,nom_soustheme='Recenser et analyser le besoin du client',theme_id=7;
insert into redline.sous_theme set id=9,nom_soustheme='Téléphonie sur IP',theme_id=5;
insert into redline.sous_theme set id=10,nom_soustheme='Powerpoint',theme_id=6;
insert into redline.sous_theme set id=11,nom_soustheme='Initiation au trading',theme_id=8;

insert into redline.formation set id=1,nom_formation='JAVA',contenu="Parce que les applications développées en Java sont très facilement portables sur différents systèmes d'exploitation tels que Windows, Mac OS, UNIX ou encore Linux, ce langage orienté Objet qui reprend en grande partie la syntaxe du C++ est toujours très prisé par les équipes de développement. Ce cursus métier vise à faire découvrir aux participants comment bien programmer en Java, et à les rendre autonomes pour développer des applications Web avec Angular, TypeScript et Bootstrap. A l'issue de ce parcours de 14 jours, les participants disposeront des compétences nécessaires prendre en charge des projets de développement d'applications web en Java.",prix_formation=1500;
insert into redline.formation set id=2,nom_formation='PHP',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=3600;
insert into redline.formation set id=3,nom_formation='XML',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1300;
insert into redline.formation set id=4,nom_formation='Ajax',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1200;
insert into redline.formation set id=5,nom_formation='Javascript',contenu="Parce que les applications développées en Java sont très facilement portables sur différents systèmes d'exploitation tels que Windows, Mac OS, UNIX ou encore Linux, ce langage orienté Objet qui reprend en grande partie la syntaxe du C++ est toujours très prisé par les équipes de développement. Ce cursus métier vise à faire découvrir aux participants comment bien programmer en Java, et à les rendre autonomes pour développer des applications Web avec Angular, TypeScript et Bootstrap. A l'issue de ce parcours de 14 jours, les participants disposeront des compétences nécessaires prendre en charge des projets de développement d'applications web en Java.",prix_formation=5500;
insert into redline.formation set id=6,nom_formation='HTML/CSS',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=5500;
insert into redline.formation set id=7,nom_formation='Initition aux langages C#',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1500;
insert into redline.formation set id=8,nom_formation='principes de bases',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=3600;
insert into redline.formation set id=9,nom_formation='VBA',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1300;
insert into redline.formation set id=10,nom_formation='.NET',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1200;
insert into redline.formation set id=11,nom_formation='J#',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=5500;
insert into redline.formation set id=12,nom_formation='C',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1500;
insert into redline.formation set id=13,nom_formation='C++',contenu="C++ est un langage de choix pour réaliser des applications évolutives, robustes et efficaces. Cette performance a cependant un prix : elle suppose de la part du développeur une réelle maîtrise, tant au niveau de la syntaxe que des concepts sous-jacents tels que les modèles mémoire, l'orientation objet ou encore la généricité. Cette formation permettra aux participants d'appréhender les principes fondamentaux de la conception objet et de les appliquer de façon effective en C++.",prix_formation=3600;
insert into redline.formation set id=14,nom_formation='Développement sous Linux',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1300;
insert into redline.formation set id=15,nom_formation='Introduction aux POO',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1200;
insert into redline.formation set id=16,nom_formation='Les classes en C++',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=5500;
insert into redline.formation set id=17,nom_formation='Solution pour des applications réparties',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1500;
insert into redline.formation set id=18,nom_formation='La valiadation de structure (DTD, XML-Schema)',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=3600;
insert into redline.formation set id=19,nom_formation='Les transformations (XSL, XSLT, XSL-FO)',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1300;
insert into redline.formation set id=20,nom_formation='Les parseurs (Dom et Sax)',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1200;
insert into redline.formation set id=21,nom_formation='Les fondamentaux de powerpoint',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1500;
insert into redline.formation set id=22,nom_formation='Linux/Unix',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=3600;
insert into redline.formation set id=23,nom_formation='Introduction aux marchés boursiers',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1300;
insert into redline.formation set id=24,nom_formation='Gérer les émotions et les conflits',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1200;
insert into redline.formation set id=25,nom_formation='Introduction aux téléphonies sur IP',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1300;
insert into redline.formation set id=26,nom_formation='Sécurité des réseaux privés',contenu="La formation professionnelle est le processus d'apprentissage qui permet à un salarié ou un demandeur d'emploi d'acquérir le savoir, le savoir-faire et le savoir-être (capacité et aptitude) nécessaires à l'exercice d'un métier ou d'une activité professionnelle",prix_formation=1200;

insert into redline.soustheme_formation set soustheme_id=1,formation_id=1;
insert into redline.soustheme_formation set soustheme_id=1,formation_id=2;
insert into redline.soustheme_formation set soustheme_id=1,formation_id=5;
insert into redline.soustheme_formation set soustheme_id=1,formation_id=6;
insert into redline.soustheme_formation set soustheme_id=1,formation_id=15;
insert into redline.soustheme_formation set soustheme_id=1,formation_id=16;

insert into redline.soustheme_formation set soustheme_id=2,formation_id=1;
insert into redline.soustheme_formation set soustheme_id=2,formation_id=3;
insert into redline.soustheme_formation set soustheme_id=2,formation_id=4;
insert into redline.soustheme_formation set soustheme_id=2,formation_id=5;

insert into redline.soustheme_formation set soustheme_id=3,formation_id=7;
insert into redline.soustheme_formation set soustheme_id=3,formation_id=8;
insert into redline.soustheme_formation set soustheme_id=3,formation_id=9;
insert into redline.soustheme_formation set soustheme_id=3,formation_id=10;
insert into redline.soustheme_formation set soustheme_id=3,formation_id=11;

insert into redline.soustheme_formation set soustheme_id=4,formation_id=12;
insert into redline.soustheme_formation set soustheme_id=4,formation_id=13;
insert into redline.soustheme_formation set soustheme_id=4,formation_id=14;
insert into redline.soustheme_formation set soustheme_id=4,formation_id=15;
insert into redline.soustheme_formation set soustheme_id=4,formation_id=16;

insert into redline.soustheme_formation set soustheme_id=5,formation_id=17;
insert into redline.soustheme_formation set soustheme_id=5,formation_id=18;
insert into redline.soustheme_formation set soustheme_id=5,formation_id=19;
insert into redline.soustheme_formation set soustheme_id=5,formation_id=20;
insert into redline.soustheme_formation set soustheme_id=5,formation_id=3;

insert into redline.soustheme_formation set soustheme_id=6,formation_id=26;
insert into redline.soustheme_formation set soustheme_id=7,formation_id=22;
insert into redline.soustheme_formation set soustheme_id=8,formation_id=24;
insert into redline.soustheme_formation set soustheme_id=9,formation_id=25;
insert into redline.soustheme_formation set soustheme_id=10,formation_id=21;
insert into redline.soustheme_formation set soustheme_id=11,formation_id=23;

insert into redline.service set id=1,nom_service='Service commercial';
insert into redline.service set id=2,nom_service='Service logistique';
insert into redline.service set id=3,nom_service='Service SAV';
insert into redline.service set id=4,nom_service='Service monitoring';
insert into redline.service set id=5,nom_service='Service planning';

insert into redline.session set id=1,lieu_formation='Lille',debut_session='2022-05-24',fin_session='2022-06-23',type_session='inter',formation_id=1;
insert into redline.session set id=2,lieu_formation='Lille',debut_session='2022-06-24',fin_session='2022-07-23',type_session='inter',formation_id=1;
insert into redline.session set id=3,lieu_formation='Lille',debut_session='2022-07-24',fin_session='2022-08-23',type_session='inter',formation_id=1;
insert into redline.session set id=4,lieu_formation='Lille',debut_session='2022-08-24',fin_session='2022-09-23',type_session='inter',formation_id=1;
insert into redline.session set id=5,lieu_formation='Lille',debut_session='2022-09-24',fin_session='2022-10-23',type_session='inter',formation_id=1;
insert into redline.session set id=6,lieu_formation='Lille',debut_session='2022-06-24',fin_session='2022-08-23',type_session='inter',formation_id=2;
insert into redline.session set id=7,lieu_formation='Lille',debut_session='2022-09-24',fin_session='2022-11-23',type_session='inter',formation_id=2;
insert into redline.session set id=8,lieu_formation='Lille',debut_session='2022-12-24',fin_session='2023-02-23',type_session='inter',formation_id=2;
insert into redline.session set id=9,lieu_formation='Lille',debut_session='2023-04-24',fin_session='2023-06-23',type_session='inter',formation_id=2;
insert into redline.session set id=10,lieu_formation='Lille',debut_session='2023-07-24',fin_session='2023-09-23',type_session='inter',formation_id=2;
insert into redline.session set id=11,lieu_formation='Lille',debut_session='2022-07-24',fin_session='2022-11-23',type_session='inter',formation_id=3;
insert into redline.session set id=12,lieu_formation='Lille',debut_session='2023-01-24',fin_session='2023-05-23',type_session='inter',formation_id=3;
insert into redline.session set id=13,lieu_formation='Lille',debut_session='2023-07-24',fin_session='2023-11-23',type_session='inter',formation_id=3;
insert into redline.session set id=14,lieu_formation='Lille',debut_session='2024-01-24',fin_session='2024-05-23',type_session='inter',formation_id=3;
insert into redline.session set id=15,lieu_formation='Lille',debut_session='2024-07-24',fin_session='2024-11-23',type_session='inter',formation_id=3;
insert into redline.session set id=16,lieu_formation='Lille',debut_session='2022-05-24',fin_session='2022-07-23',type_session='inter',formation_id=5;
insert into redline.session set id=17,lieu_formation='Lille',debut_session='2022-07-24',fin_session='2022-09-23',type_session='inter',formation_id=5;
insert into redline.session set id=18,lieu_formation='Lille',debut_session='2022-09-24',fin_session='2022-11-23',type_session='inter',formation_id=5;
insert into redline.session set id=19,lieu_formation='Lille',debut_session='2022-11-24',fin_session='2023-01-23',type_session='inter',formation_id=5;
insert into redline.session set id=20,lieu_formation='Lille',debut_session='2023-01-24',fin_session='2023-03-23',type_session='inter',formation_id=5;
insert into redline.session set id=21,lieu_formation='Lille',debut_session='2022-08-24',fin_session='2023-02-23',type_session='inter',formation_id=4;
insert into redline.session set id=22,lieu_formation='Lille',debut_session='2023-08-24',fin_session='2024-02-23',type_session='inter',formation_id=4;
insert into redline.session set id=23,lieu_formation='Lille',debut_session='2024-08-24',fin_session='2025-02-23',type_session='inter',formation_id=4;
insert into redline.session set id=24,lieu_formation='Lille',debut_session='2025-03-24',fin_session='2026-02-23',type_session='inter',formation_id=4;
insert into redline.session set id=25,lieu_formation='Lille',debut_session='2026-06-24',fin_session='2027-02-23',type_session='inter',formation_id=4;  

insert into redline.session set id=26,lieu_formation='Lille',debut_session='2022-08-24',fin_session='2022-09-23',type_session='inter',formation_id=6;
insert into redline.session set id=27,lieu_formation='Lille',debut_session='2022-09-24',fin_session='2022-10-23',type_session='inter',formation_id=7;
insert into redline.session set id=28,lieu_formation='Lille',debut_session='2022-10-24',fin_session='2022-11-23',type_session='inter',formation_id=8;
insert into redline.session set id=29,lieu_formation='Lille',debut_session='2022-11-24',fin_session='2022-12-23',type_session='inter',formation_id=9;
insert into redline.session set id=30,lieu_formation='Lille',debut_session='2022-12-24',fin_session='2023-01-23',type_session='inter',formation_id=10;
insert into redline.session set id=31,lieu_formation='Lille',debut_session='2023-01-24',fin_session='2023-02-23',type_session='inter',formation_id=11;
insert into redline.session set id=32,lieu_formation='Lille',debut_session='2023-02-24',fin_session='2023-03-23',type_session='inter',formation_id=12;
insert into redline.session set id=33,lieu_formation='Lille',debut_session='2023-03-24',fin_session='2023-04-23',type_session='inter',formation_id=13;
insert into redline.session set id=34,lieu_formation='Lille',debut_session='2023-04-24',fin_session='2023-05-23',type_session='inter',formation_id=14;
insert into redline.session set id=35,lieu_formation='Lille',debut_session='2023-05-24',fin_session='2023-06-23',type_session='inter',formation_id=15;
insert into redline.session set id=36,lieu_formation='Lille',debut_session='2023-06-24',fin_session='2023-07-23',type_session='inter',formation_id=16;
insert into redline.session set id=37,lieu_formation='Lille',debut_session='2023-07-24',fin_session='2023-08-23',type_session='inter',formation_id=17;
insert into redline.session set id=38,lieu_formation='Lille',debut_session='2023-08-24',fin_session='2023-09-23',type_session='inter',formation_id=18;
insert into redline.session set id=39,lieu_formation='Lille',debut_session='2023-09-24',fin_session='2023-10-23',type_session='inter',formation_id=19;
insert into redline.session set id=40,lieu_formation='Lille',debut_session='2023-10-24',fin_session='2023-11-23',type_session='inter',formation_id=20;
insert into redline.session set id=41,lieu_formation='Lille',debut_session='2023-11-24',fin_session='2023-12-23',type_session='inter',formation_id=21;
insert into redline.session set id=42,lieu_formation='Lille',debut_session='2023-12-24',fin_session='2024-01-23',type_session='inter',formation_id=22;
insert into redline.session set id=43,lieu_formation='Lille',debut_session='2024-01-24',fin_session='2024-02-23',type_session='inter',formation_id=23;
insert into redline.session set id=44,lieu_formation='Lille',debut_session='2024-02-24',fin_session='2024-03-23',type_session='inter',formation_id=24;

insert into redline.utilisateur set id=1,nom='TONNOIR',prenom='Arthur',email='arthurtonnoir@yahoo.cr',telephone='0618254789',adresse_id=1,fonction='',nom_entreprise='',experience=5,note_formateur=4,est_client=false,est_formateur=true,est_responsable=false;
insert into redline.utilisateur set id=2,nom='Vasseur',prenom='Christophe',email='christophevasseur@yahoo.cr',telephone='0718253989',adresse_id=2,fonction='Responsable commercial',service_id=1,nom_entreprise='itTraining',est_client=false,est_formateur=false,est_responsable=true;
insert into redline.utilisateur set id=3,nom='Barre',prenom='Thomas',email='thomasbarre@yahoo.cr',telephone='0622254589',adresse_id=3,fonction='',nom_entreprise='Boulot&co',session_id=1,est_client=true,est_formateur=false,est_responsable=false;
insert into redline.utilisateur set id=4,nom='Lahroussi',prenom='Amine',email='aminelahroussi@yahoo.cr',telephone='0610251709',adresse_id=4,fonction='',nom_entreprise='',est_client=false,est_formateur=false,est_responsable=false;
insert into redline.utilisateur set id=5,nom='Deschamps',prenom='Sebastien',email='sebastiendeschamps@yahoo.cr',telephone='0741254781',adresse_id=5,fonction='',nom_entreprise='Galette&co',session_id=2,est_client=true,est_formateur=false,est_responsable=false;

insert into redline.evaluation set id=1,note_formateur=3,note_formation=2,utilisateur_id=5;
insert into redline.evaluation set id=2,note_formateur=5,note_formation=4,utilisateur_id=3;