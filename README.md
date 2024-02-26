# Database Data Import-Export

This project is a Java Spring Boot application for importing and exporting data from a database table to various file formats such as JSON.

## Features

- Import data from a JSON file into a database table.
- Export data from a database table to a JSON file.

## Prerequisites

- Java 11 or higher
- PostgreSQL database

## Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/MZNTask/Database-Data-Import-Export.git
    ```

2. Navigate to the project directory:

    ```bash
    cd Database-Data-Import-Export
    ```

## Usage

1. Ensure that the PostgreSQL database is running.
2. Ensure that the `application.properties` file contains the database connection information, including the database name, username, and password:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/Data-Import-Export
   spring.datasource.username=farah
   spring.datasource.password=0000
   spring.jpa.hibernate.ddl-auto=update
   spring.mvc.hiddenmethod.filter.enabled=true
   
```
```

## Endpoints

- `POST /import`: Imports data from a JSON file into the database table. Use Postman with the request body as form-data, including the file to be imported.
- `GET /export`: Exports data from the database table to a JSON file. Use Postman to send a GET request.
