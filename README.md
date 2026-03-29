[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)

# PCCCS495 – Term II Project

## Project Title
**Movie Ticket Booking System**

---

## Problem Statement (max 150 words)

The objective of this project is to develop a console-based Movie Ticket Booking System that allows users to browse movies, select a show, and book seats. In real-world booking systems, maintaining seat availability and preventing duplicate bookings is critical. This project addresses that challenge by implementing the State Design Pattern, where each seat maintains its own state and transitions between available and booked dynamically.

The system updates seat availability in real time, prevents double booking, and handles invalid user inputs gracefully. It demonstrates the practical use of object-oriented programming concepts and design patterns in building scalable and maintainable software. The modular architecture separates user interaction, business logic, and data models, making the system easy to extend with future features such as multiple showtimes, pricing, and user authentication.

---

## Target User

- Students learning object-oriented programming and design patterns
- Beginners developing console-based Java applications
- Developers exploring practical implementation of the State Design Pattern

---

## Core Features

- Display list of available movies
- Show seat layout for a selected movie
- Book seats dynamically through user input
- Prevent duplicate seat booking using state transitions
- Real-time update of seat availability after booking

---

## OOP Concepts Used

- **Abstraction:** Implemented using the `SeatState` interface to define seat behavior.
- **Inheritance:** `AvailableState` and `BookedState` classes implement the `SeatState` interface.
- **Polymorphism:** Seat behavior changes dynamically at runtime based on its current state object.
- **Exception Handling:** The system handles invalid seat selections and incorrect user inputs using try–catch blocks.
- **Collections / Threads:** `ArrayList` is used to manage movie and seat data efficiently.

---

## Proposed Architecture Description

The system follows a layered and modular architecture:

- **Presentation Layer:** The `Main` class handles all user interaction and console input/output.
- **Service Layer:** `MovieService` and `BookingService` manage application logic, including movie retrieval and seat booking.
- **Model Layer:** Core entities such as `Movie`, `Show`, and `Seat` represent the system's data structure.

The State Design Pattern is used to manage seat behavior. Each `Seat` object contains a reference to a `SeatState` object that determines its current behavior. This approach eliminates complex conditional statements and improves scalability, extensibility, and maintainability.

---

## How to Run

### Prerequisites
- Java JDK 17 or above installed
- Git installed
- Terminal or Command Prompt

### Steps to Execute

