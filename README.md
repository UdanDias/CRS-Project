# Course Registration System (CRS)

## Project Overview

The **Course Registration System (CRS)** is a Java-based application designed to facilitate course enrollment and academic record management. It enables students to register for courses, view schedules, and track academic progress. Admins and faculty can manage students, courses, and enrollment data efficiently.

## Features

### 1. **User Management**

- Admins can add, update, and remove users.
- Role-based access for Admin, Faculty, and Students.

### 2. **Student Management**

- Add, update, and delete student records.
- Store student details including ID, name, DOB, program, year, and contact information.

### 3. **Course Management**

- CRUD operations for courses.
- Course details include ID, title, credit hours, department, prerequisites, and maximum enrollment.

### 4. **Course Enrollment**

- Students can search, view, and register for courses.
- Real-time availability updates and prerequisite enforcement.
- Option to add/drop courses within a designated period.

### 5. **Academic Records**

- Track enrolled courses and grades.
- Generate student reports and academic progress.

### 6. **Reporting & Dashboards**

- Generate course enrollment statistics.
- View student schedules and enrollment history.
- Admin and faculty dashboards for management.

## System Architecture

The project follows a **layered architecture**:

1. **Presentation Layer**: Java Swing GUI.
2. **Business Logic Layer**: Service classes handling logic and validations.
3. **Persistence Layer**: DAO classes interacting with the MySQL database.
4. **Database Layer**: MySQL database for storing all records.

## Technologies Used

- **Programming Language**: Java (JDK 17+)
- **Frontend**: Java Swing
- **Backend**: Java (Service Layer)
- **Database**: MySQL
- **IDE**: Apache NetBeans 23
- **Version Control**: GitHub
- **Design Pattern**: Factory Pattern

## Project Structure

```
CRS-Project/
├── src/
│   ├── edu.uijse.crs.controller/   # Controllers for business logic
│   ├── edu.uijse.crs.dao/          # Data Access Objects
│   ├── edu.uijse.crs.dto/          # Data Transfer Objects
│   ├── edu.uijse.crs.entity/       # Entity classes representing database tables
│   ├── edu.uijse.crs.service/      # Service Layer (Business Logic)
│   ├── edu.uijse.crs.view/         # Java Swing UI Components
│   ├── edu.uijse.crs.dashboard/    # Dashboards for admin and faculty
│   ├── edu.uijse.crs.report/       # Reporting module
│   ├── edu.uijse.crs.db/           # Database connection class
│   ├── edu.uijse.crs.lib/          # Utility classes
├── database/                       # MySQL database scripts
├── README.md                       # Project Documentation
├── CRS-Project.iml                  # NetBeans Project File
└── pom.xml                          # Dependencies (if using Maven)
```

## Installation & Setup

### Prerequisites

1. **Install Java JDK 17+**
2. **Install Apache NetBeans 23**
3. **Install MySQL Server & Workbench**
4. **Clone the Repository**:
   ```bash
   git clone https://github.com/UdanDias/CRS-Project.git
   ```

### Database Setup

1. Open MySQL Workbench and create a database:
   ```sql
   CREATE DATABASE new_crs_db;
   ```
2. Import the provided SQL dump file (`database/crs_db.sql`).
3. Update the `DBConnection.java` file with your MySQL credentials.

### Running the Application

1. Open the project in NetBeans.
2. Build the project.
3. Run `Main.java` to start the login screen.

## Usage Guide

### Admin Features:

- Login with admin credentials.
- Manage students, courses, and faculty.
- View reports and generate statistics.

### Faculty Features:

- Login with faculty credentials.
- Manage student grades.
- View enrolled students and schedules.

### Student Features:

- Login with student credentials.
- Search and register for courses.
- View course schedule and academic progress.

## Contributors

- **Your Name** – Developer & Project Lead
- **Team Members (if applicable)**

## License

This project is licensed under the MIT License.



