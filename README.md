# Journal CRUD Application — journalbyszrthk

A self-made **Spring Boot CRUD application** for managing journal entries, built from scratch by **szrthk**. This project demonstrates core Spring Boot architecture concepts — Controller, Service, Repository layers with MongoDB database integration.

---

## 🚀 Features
- Add New Journal Entry (POST)
- View All Journal Entries (GET)
- Update Existing Entry (PUT)
- Delete Journal Entry (DELETE)
- Clean layered architecture (Controller → Service → Repository)
- HealthCheck API

---

## 🛠️ Tech Stack
- Java 1.8
- Spring Boot 2.7.18
- MongoDB
- Maven
- Lombok

---

## 📂 Project Structure
* taskmanagerbyszrthk/
  ├── src/
  │   └── main/
  │       └── java/
  │           └── com/
  │               └── szrthk/
  │                   └── taskmanager/
  │                       ├── controller/
  │                       │   └── TaskController.java
  │                       ├── entity/
  │                       │   └── Task.java
  │                       ├── service/
  │                       │   └── TaskService.java
  │                       ├── repo/
  │                       │   └── TaskRepo.java
  │                       └── TaskmanagerbyszrthkApplication.java
  │
  │   └── resources/
  │       ├── application.properties
  │       ├── static/
  │       └── templates/
  │
  ├── pom.xml
  ├── README.md
  └── .gitignore
---

## 🧑‍💻 How to Run Locally
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/journalbyszrthk.git
    ```
2. Navigate into the project directory:
    ```bash
    cd journalbyszrthk
    ```
3. Run Maven Install:
    ```bash
    mvn clean install
    ```
4. Start the Spring Boot Application:
    ```bash
    mvn spring-boot:run
    ```
5. Access API Endpoints at:
    ```
    http://localhost:8080/journal
    ```

---

## 📋 API Endpoints
| Method | Endpoint              | Description                      |
|--------|-----------------------|----------------------------------|
| POST   | /journal               | Add a new journal entry          |
| GET    | /journal               | Retrieve all journal entries     |
| PUT    | /journal/{id}          | Update an existing journal entry |
| DELETE | /journal/{id}          | Delete a journal entry           |
| GET    | /healthcheck           | Application Health Check         |

---

## 🔍 Key Concepts Used
- Controller → Service → Repository Architecture
- Dependency Injection using @Autowired
- Spring Boot Starter Web
- Spring Boot Starter Data MongoDB
- Lombok Annotations (@Getter, @Setter, @NoArgsConstructor, etc.)

---

## 📌 Future Enhancements
- Add User Authentication (JWT)
- Swagger/OpenAPI Documentation
- Deployment on Render/Heroku

---

## 👤 Author
- Sarthak (szrthk) — [GitHub Profile](https://github.com/szrthk)