# 🎟️ Online Movie Ticket Booking System

A backend application for booking movie tickets online, developed using **Spring Boot**. It includes secure user authentication, seat reservation logic, and integration with third-party payment gateways.

## 🚀 Features

- 🎬 Movie and Show Management
- 🪑 Seat Selection and Reservation Logic
- 🔐 Secure User Authentication with Spring Security
- 💳 Integration with Payment Gateway (Mock)
- 📊 Admin Panel APIs for Managing Listings
- ✅ Booking Confirmation and History

## 🛠 Tech Stack

- **Backend**: Java, Spring Boot, Spring MVC, Spring Data JPA, Spring Security
- **Database**: MySQL
- **Build Tool**: Maven
- **Version Control**: Git
- **Testing**: JUnit, Postman

## 📁 Project Structure

movie-ticket-booking/
│
├── controller/ # API endpoints
├── service/ # Business logic layer
├── model/ # Entity classes
├── repository/ # Data access layer
├── config/ # Security configuration
└── dto/ # Request/response models

### 1. Clone the Repository
```bash
git clone https://github.com/mrchilumula/Movie_Ticket_Booking.git
cd Movie_Ticket_Booking

Create a MySQL database movie_booking_db

Update src/main/resources/application.properties with your DB credentials

 Test API Endpoints
Use Postman to test APIs like:

POST /api/auth/register

POST /api/auth/login

GET /api/movies

POST /api/book

GET /api/bookings
