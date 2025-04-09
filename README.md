# jsp-servlet-examples
jsp-servlet-examples 

# JSP & Servlet Login System

A simple user authentication system built using **JSP**, **Servlets**, **JDBC**, and **MySQL**, following the **MVC architecture** with layers: Controller, Service, Repository (DAO), and Model.

---

## 📁 Project Structure
LoginSystem/
│ ├── src/ 
│└── com/shreya/jspservlet/ 
│ ├── controller/
│ │ └── UserLoginController.java 
│ ├── model/
│ │ └── User.java 
│ ├── service/
│ │ └── UserService.java 
│ ├── repository/ 
│ │ └── UserRepository.java
│ └── util/
│ └── DBConnection.java 
│ ├── WebContent/
│ ├── login.jsp 
│ ├── success.jsp
│ ├── error.jsp 
│ └── WEB-INF/ 
│ └── web.xml
│ └── README.md


---

## ✅ Features

- 🔐 User authentication with username and password
- 💡 MVC Architecture with separate service and DAO layers
- ⚙️ JDBC connection pooling using `DBConnection`
- 🌐 Clean JSP pages with form validation
- 🛠️ Easily extendable to register, logout, or roles

---

## 🧑‍💻 Technologies Used

- Java (Servlets, JSP)
- MySQL Database
- JDBC
- Apache Tomcat 10+
- MVC Design Pattern

---

## 🧾 Database Setup

### 📌 Step 1: Create Database & Table

Open your MySQL console or tool and run:

```sql
CREATE DATABASE login_db;

USE login_db;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL
);

### 📌 Step 2: Insert Sample User

