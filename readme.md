# SP_UebungEinkaufliste

## Description

The **SP_UebungEinkaufliste** project is a Spring Boot-based backend application that provides a RESTful API for managing items in a shopping list. It allows users to perform CRUD operations on items, including retrieving all items, getting an item by ID, creating/updating items, and deleting items. Additionally, it supports updating the 'gekauft' (purchased) status of items.

## Features

- **Get all items**: Retrieve a list of all items in the shopping list.
- **Get item by ID**: Retrieve a specific item using its ID.
- **Create/Update item**: Add a new item or update an existing one.
- **Delete item**: Remove an item from the shopping list.
- **Update purchased status**: Change the 'gekauft' status of an item.

## API Endpoints

- **GET** `/api/v1/items` - Get all items
- **GET** `/api/v1/items/{id}` - Get item by ID
- **POST** `/api/v1/items/submit` - Create or update an item
- **DELETE** `/api/v1/items/{id}` - Delete an item
- **PUT** `/api/v1/items/{id}` - Update purchased status of an item

## Technologies Used

- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- postgres SQL
- Maven


Frontend: 
git@github.com:brokensea/springBack_JSFront_9_9_2024_Front.git



SP_UebungEinkaufliste
Beschreibung
Das SP_UebungEinkaufliste-Projekt ist eine auf Spring Boot basierende Backend-Anwendung, die eine RESTful-API zur Verwaltung von Artikeln in einer Einkaufsliste bereitstellt. Es ermöglicht Benutzern, CRUD-Operationen an Artikeln durchzuführen, einschließlich des Abrufs aller Artikel, des Zugriffs auf einen Artikel nach ID, der Erstellung/Aktualisierung von Artikeln und des Löschens von Artikeln. Darüber hinaus unterstützt es die Aktualisierung des Status „gekauft“ von Artikeln.

Funktionen
Alle Artikel abrufen: Abrufen einer Liste aller Artikel in der Einkaufsliste.
Artikel nach ID abrufen: Abrufen eines bestimmten Artikels mithilfe seiner ID.
Artikel erstellen/aktualisieren: Hinzufügen eines neuen Artikels oder Aktualisieren eines vorhandenen Artikels.
Artikel löschen: Entfernen eines Artikels aus der Einkaufsliste.
Gekauft-Status aktualisieren: Ändern des „gekauft“-Status eines Artikels.
API-Endpunkte
GET /api/v1/items - Alle Artikel abrufen
GET /api/v1/items/{id} - Artikel nach ID abrufen
POST /api/v1/items/submit - Artikel erstellen oder aktualisieren
DELETE /api/v1/items/{id} - Artikel löschen
PUT /api/v1/items/{id} - Gekauft-Status eines Artikels aktualisieren
Verwendete Technologien
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- postgres SQL
- Maven

Frontend: 
git@github.com:brokensea/springBack_JSFront_9_9_2024_Front.git
