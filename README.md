# jsp-servlet-examples
jsp-servlet-examples 

# JSP & Servlet Login System

A simple user authentication system built using **JSP**, **Servlets**, **JDBC**, and **MySQL**, following the **MVC architecture** with layers: Controller, Service, Repository (DAO), and Model.

---

## 📁 Project Structure
```
LoginSystem/
├── .classpath
├── .project
├── .settings/
│   └── org.eclipse.jdt.core.prefs
├── build/
├── src/
│   └── com/shreya/jspservlet/
│       ├── controller/
│       │   └── UserLoginController.java
│       ├── model/
│       │   └── User.java
│       ├── repository/
│       │   └── UserRepository.java
│       ├── service/
│       │   └── UserService.java
│       └── util/
│           └── DBConnection.java
├── WebContent/
│   ├── login.jsp
│   ├── success.jsp
│   ├── error.jsp
│   ├── css/
│   │   └── style.css (optional)
│   ├── js/
│   │   └── login.js (optional)
│   └── WEB-INF/
│       ├── web.xml
│       └── lib/ (JDBC jar goes here)
├── README.md
```
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
```
### 📌 Step 2: Insert Sample User
```sql
INSERT INTO users (username, password) VALUES ('admin', 'admin123');

```
### ⚙️ Configuration
### 1. Update DB credentials
   
- In DBConnection.java, update your MySQL details:
- private static final String URL = "jdbc:mysql://localhost:3306/login_db";
- private static final String USER = "root";
- private static final String PASSWORD = "your_password";

### 🧪 How It Works
- login.jsp → User submits login form

- UserLoginController (Servlet) handles POST

- UserService checks credentials using UserRepository

- If valid → redirect to success.jsp

- Else → redirect to error.jsp

### 📌 To Do / Improvements
- Add user registration page

- Add password hashing

- Session management and logout

- Role-based dashboard (Admin/User)

- Front-end UI improvement with Bootstrap


---

## 👨‍💻 Author

Shreya Mahalle  
[GitHub](https://github.com/shreyamahalle) | [LinkedIn](https://linkedin.com/in/shreyamahalle)
🔗 JSP Servlet Projects | Java EE Enthusiast

---



