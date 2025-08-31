# Atom Technologies Assignment

This project is a full-stack application built with **Spring Boot** (backend), **PostgreSQL** (database), and **React + Vite** (frontend).  
Follow the instructions carefully to set up and run the project.

---

## 🚀 Prerequisites

Make sure you have the following installed on your system:

- [Java 17+](https://adoptium.net/)
- [Maven](https://maven.apache.org/)
- [PostgreSQL](https://www.postgresql.org/download/)
- Git

---

## 📂 Project Structure Overview
atom-tech-server/
│
├── src/
│ ├── main/
│ │ ├── java/com/atomtech/server/ # Main Java source code
│ │ │ ├── controller/ # REST Controllers (API endpoints)
│ │ │ ├── service/ # Business logic
│ │ │ ├── repository/ # Database repositories (JPA interfaces)
│ │ │ ├── domain/ # Entity classes (mapped to DB tables)
│ │ │ ├── dto/ # Data Transfer Objects
│ │ │ └── AtomTechServerApplication.java # Main Spring Boot entry point
│ │ │
│ │ └── resources/
│ │ ├── application.properties # Configuration (DB, server, etc.)
│ │ └── static/ # Static files (if any)
│ │
│ └── test/ # Unit and Integration tests
│
├── .gitignore # Git ignored files
├── pom.xml # Maven dependencies & project config
└── README.md # Project documentation

---


## ⚙️ Backend Setup (Spring Boot + PostgreSQL)

1. **Create Database and User in PostgreSQL**

   Open `psql` and run the following commands:

   ```sql
      CREATE DATABASE atomtechnologies;
      CREATE USER atomtech WITH PASSWORD 'password';
      ALTER USER atomtech WITH SUPERUSER;
      GRANT CONNECT ON DATABASE atomtechnologies TO atomtech;
   ```
---

## 📂 Clone the Repository

Clone the repository from GitHub:

   ```bash
    git clone https://github.com/eagle-s-learner/atom-tech-server.git
    cd atom-tech-server
   ```
---

## Configure the application.properties file
```
   spring.application.name=entries

   # Database properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/atomtechnologies
   spring.datasource.username=atomtech
   spring.datasource.password=password

   # Hibernate
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
```
---

# 👉 Instruction:
Check which port your frontend is running on:

If using Vite, the default port is 5173.

If using Next.js, the default port is 3000.

If other, please check accordingly.
```
Update .allowedOrigins("http://localhost:<your_frontend_port>") accordingly.
```
---
# run these to stat server
```bash
mvn clean install

mvn spring-boot:run

```
---