# Student API

A RESTful API for managing students, built with **Spring Boot** and **MySQL**.

---

## Database

<img width="962" height="557" alt="DATABASE" src="https://github.com/user-attachments/assets/c9155fa6-bfc5-4ec9-bcd2-11c54743aa06" />


**Database:** `studentsapi` — **Table:** `students`

| Column | Type |
|---|---|
| id | INT (PK, AUTO_INCREMENT) |
| first_name | VARCHAR |
| last_name | VARCHAR |
| email | VARCHAR |
| age | INT |
| major | VARCHAR |

---

## Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| POST | `/students` | Add a new student |
| PUT | `/students/{id}` | Update a student |
| DELETE | `/students/{id}` | Delete a student |

---

## Demo Videos

### ▶ Execution


https://github.com/user-attachments/assets/85f73ca6-8c95-4037-be32-6e5e50f2c119



### ▶ Get All Students


https://github.com/user-attachments/assets/7e9c4971-fc8d-4e11-ae4b-6a21c2834b1e



### ▶ Get Student by ID


https://github.com/user-attachments/assets/879dfe17-8c2e-451f-a2b4-e93878a03ec2



### ▶ Add Student


https://github.com/user-attachments/assets/7ae05d30-25d3-45f3-97a2-c7800e73ac04



### ▶ Update Student


https://github.com/user-attachments/assets/dcc5f1e6-850d-4b35-84f2-5ade6c193fc9



### ▶ Delete Student



https://github.com/user-attachments/assets/4e2dccd3-205e-4f88-b109-7c16a8996a7c


---

## Project Structure

```
src/main/java/ma/fst/studentapi
│
├── controller
│   └── StudentController.java
├── dto
│   ├── StudentRequestDTO.java
│   └── StudentResponseDTO.java
├── entity
│   └── Student.java
├── exception
│   ├── ResourceNotFoundException.java
│   └── GlobalExceptionHandler.java
├── mapper
│   └── StudentMapper.java
├── repository
│   └── StudentRepository.java
├── service
│   └── StudentService.java
└── StudentApiApplication.java
```

> Server runs on `http://localhost:8080`
