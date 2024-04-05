# Activité Pratique N° 1 - Injection des dépendances

### Ce projet est réalisé dans le cadre de l'Activité Pratique N° 1 sur Injection des dépendances.

##Objectif du Projet

L'objectif de ce projet était de mettre en pratique les concepts d'injection de dépendances avec Spring, en suivant les étapes définies par le professeur dans les vidéos de formation.

## Captures d'Écran :
### Structure du Projet

![Arborescence du Projet](https://github.com/BouzidiTheCoder/Spring-Dependency-Injection/assets/134173504/75db65a6-95da-4172-9ecd-778eb1787e09)

### 1. Interface IDao (dao.IDao) : 
####  Cette interface définit une méthode getData() qui doit être implémentée par les classes fournissant les données.

![IDao](https://github.com/BouzidiTheCoder/Spring-Dependency-Injection/assets/134173504/99821940-1550-415e-9a57-2e0c16e40454)

### 2. Implémentation DaoImpl (dao.DaoImpl):
#### Cette classe implémente l'interface IDao et fournit une implémentation concrète de la méthode getData().

![DaoImpl](https://github.com/BouzidiTheCoder/Spring-Dependency-Injection/assets/134173504/53dfac5b-4c93-4bc3-95c8-05867145104f)


### 3. Implémentation DaoImpl2 (ext.DaoImpl2) : 
#### -Cette classe implémente l'interface IDao et fournit une implémentation concrète de la méthode getData().
#### -Utilise l'annotation @Component pour être gérée par Spring.

![DaoImpl2](https://github.com/BouzidiTheCoder/Spring-Dependency-Injection/assets/134173504/196b56c1-83e5-44d0-afb6-e583a96b6156)

### 4. Implémentation DaoImplVWS (ext.DaoImplVWS):
#### - Une autre implémentation de l'interface IDao qui fournit une méthode getData() différente.
#### - Démontre comment plusieurs implémentations peuvent être gérées avec Spring.

![DaoImplVWS](https://github.com/BouzidiTheCoder/Spring-Dependency-Injection/assets/134173504/ac43d9e9-f259-40c8-9f08-c9aa60604005)

### 5. Interface IMetier (metier.IMetier):
#### Cette interface définit une méthode calcul() pour effectuer un calcul métier.

![IMetier](https://github.com/BouzidiTheCoder/Spring-Dependency-Injection/assets/134173504/03265e3b-f68a-4881-b12f-426fa7b58158)

### 6. Implémentation IMetierImpl (metier.IMetierImpl):
#### - Cette classe implémente l'interface IMetier et démontre l'injection de dépendances par couplage faible.
#### - Utilise l'annotation @Autowired pour injecter une instance de IDao.

![IMetierIml](https://github.com/BouzidiTheCoder/Spring-Dependency-Injection/assets/134173504/7214b340-2f44-4e1d-bf07-9ee3f3722ba1)


### 7. Injection de Dépendances avec Configuration statique (pres.Presentation):

![statique](https://github.com/BouzidiTheCoder/Spring-Dependency-Injection/assets/134173504/4fa64d20-b73b-48bc-b645-8f12d8b53cdd)


### 8. Injection de Dépendances avec Configuration Dynamique (pres.Presentation2):

![dynamique](https://github.com/BouzidiTheCoder/Spring-Dependency-Injection/assets/134173504/c1e81212-b290-4ae0-97c5-619131f701d9)

### 9. Injection de Dépendances avec Configuration Spring Annotations (pres.PresentationSpringAnnotation):

![3](https://github.com/BouzidiTheCoder/Spring-Dependency-Injection/assets/134173504/4451e75a-0e46-429e-8c07-80c48bb69a36)

### 10. Injection de Dépendances avec Configuration XML (pres.PresentationSpringXML):

![1](https://github.com/BouzidiTheCoder/Spring-Dependency-Injection/assets/134173504/41926df3-9b82-400e-96d3-2108a19f7340)

![2](https://github.com/BouzidiTheCoder/Spring-Dependency-Injection/assets/134173504/ff05b6e5-20b4-48f6-aca4-7a8421d0e8d3)



