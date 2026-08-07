# Learnix

A student learning management backend built with Spring Boot and MySQL.

## Overview
Learnix provides backend APIs for managing students, courses, and enrollments. It demonstrates a clean, layered Spring Boot architecture with relational data modeling.

## Tech Stack
- Java
- Spring Boot
- XAMPP
- MySQL
- Maven

## Features
- CRUD operations for students and courses
- Student–course enrollment management
- Layered architecture (Controller → Service → Repository)
- Input validation and structured error handling

## Getting Started

### Prerequisites
- Java 17+
- Maven
- MySQL 8+

### Setup
```bash
git clone https://github.com/Jessikag07/Learnix.git
cd Learnix
```

Update `application.properties` with your database details:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/learnix_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

Run the application:
```bash
mvn spring-boot:run
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|--------------|
| GET | `/api/students` | Get all students |
| POST | `/api/students` | Add a new student |
| GET | `/api/courses` | Get all courses |
| POST | `/api/courses/{id}/enroll` | Enroll a student in a course |


## Status
Completed — core CRUD functionality implemented.

## Author
Jesika Ghaghada — [GitHub](https://github.com/Jessikag07)
