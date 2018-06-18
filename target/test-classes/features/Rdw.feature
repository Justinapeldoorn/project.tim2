#language:nl

@Rdw
Functionaliteit: Werking van de links op de homepage

  Achtergrond:
    Gegeven Ik ben op de homepage van het RDW

  Abstract Scenario: Links Auto, Motor, Brommer
    Als ik op de link "<Link Naam>" klik
    Dan verwacht ik dat de titel "<Titel Pagina>" | RDW is

    Voorbeelden:
      | Link Naam          | Titel Pagina |
      | Auto               | Auto         |
      | Motor              | Motor        |
      | Brommer of scooter | Brommer      |
      | Vaartuigen         | Vaartuigen   |
