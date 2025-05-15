# ☁️ CRUDUsingMongoDbCloud – Spring Boot REST API

A complete CRUD (Create, Read, Update, Delete) **RESTful API** built with **Spring Boot** and **MongoDB Cloud**. This project demonstrates how to connect your Spring Boot application with a remote MongoDB Atlas cluster and perform basic database operations using REST.

![MongoDB + Spring Boot](https://bitstogigs.com/wp-content/uploads/2023/12/MongoDB-CRUD.png)

---

## 📑 Table of Contents

- [📌 Overview](#-overview)
- [✨ Features](#-features)
- [🧰 Technologies Used](#-technologies-used)
- [🧪 API Endpoints](#-api-endpoints)
- [🚀 How to Run](#-how-to-run)
- [📬 Sample JSON Request](#-sample-json-request)
- [🤝 Contributing](#-contributing)
- [📜 License](#-license)

---

## 📌 Overview

This project allows you to perform **CRUD operations** on any entity (example: `Student`, `Product`, `Employee`, etc.) and stores the data in **MongoDB Cloud (MongoDB Atlas)**. It is suitable for backend learning, real-time projects, or testing APIs.

---

## ✨ Features

- 🔗 Connects to MongoDB Atlas Cloud
- 📁 RESTful CRUD operations
- 📚 Spring Data MongoRepository
- 🔍 Find by ID, name, etc.
- ☑️ Error handling for invalid input or not found
- 🧪 Tested with Postman/Insomnia
- 🌐 CORS-enabled for frontend integration

---

## 🧰 Technologies Used

- 🧠 Java 17
- ☕ Spring Boot 3.x
- 📦 Maven
- 🍃 Spring Data MongoDB
- ☁️ MongoDB Atlas
- 🛠️ Postman/Insomnia (API Testing)

---

## 🧪 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/students` | Create a new student |
| `GET` | `/api/students` | Get all students |
| `GET` | `/api/students/{id}` | Get student by ID |
| `PUT` | `/api/students/{id}` | Update student by ID |
| `DELETE` | `/api/students/{id}` | Delete student by ID |

> Replace `students` with your entity name if changed

---

## 🚀 How to Run

### ✅ Prerequisites

- Java 17 installed
- Maven installed
- MongoDB Atlas account (create one at [cloud.mongodb.com](https://cloud.mongodb.com))
- Create a free cluster and get the connection URI (replace `<password>` and `<dbname>`)

### 🔧 Steps

1. **Clone the repository**

```bash
git clone https://github.com/your-username/CRUDUsingMongoDbCloud.git
cd CRUDUsingMongoDbCloud
