# 🛡️ User Authentication Service

A secure, scalable user authentication API built with **Node.js**, **Express**, **MySQL (hosted on AWS RDS)**, and **JWT**. Deployed on **AWS EC2**.

---

## 📁 Project Structure

user-auth-service/
├── config/ # Database connection config
├── controllers/ # Auth logic (register, login)
├── middleware/ # JWT auth middleware
├── routes/ # API route definitions
├── .env # Environment variables
├── .gitignore
├── package.json
├── server.js # Entry point
└── README.md

yaml
Copy
Edit

---

## 🚀 Features

- ✅ User registration with encrypted password (bcrypt)
- ✅ Login with JWT token generation
- ✅ Protected routes using JWT verification
- ✅ MySQL database hosted on AWS RDS
- ✅ Fully deployed on AWS EC2

---

## 🔧 Tech Stack

| Layer        | Technology           |
|--------------|----------------------|
| Backend      | Node.js, Express.js  |
| Authentication | JWT, bcrypt.js     |
| Database     | MySQL (AWS RDS)      |
| Deployment   | AWS EC2              |

---

## 🌐 API Endpoints

| Method | Endpoint        | Description         | Protected |
|--------|------------------|---------------------|-----------|
| POST   | `/api/auth/register` | Register new user   | ❌        |
| POST   | `/api/auth/login`    | Login and get token | ❌        |
| GET    | `/api/protected`     | Example protected route | ✅ |

---

## 🛠️ Installation

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/user-auth-service.git
cd user-auth-service
2. Install Dependencies
bash
Copy
Edit
npm install
3. Configure Environment Variables
Create a .env file:

env
Copy
Edit
PORT=3000
DB_HOST=your-rds-endpoint.amazonaws.com
DB_USER=admin
DB_PASSWORD=yourpassword
DB_NAME=user_auth
JWT_SECRET=your_jwt_secret
🗃️ Database Setup (MySQL on AWS RDS)
Login to your RDS instance using a MySQL client.

Run this SQL:

sql
Copy
Edit
CREATE DATABASE IF NOT EXISTS user_auth;

USE user_auth;

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(100) NOT NULL UNIQUE,
  password VARCHAR(255) NOT NULL
);
▶️ Run Locally
bash
Copy
Edit
npm start
# OR for development with auto-restart
npm run dev
🛡️ Token Authentication Middleware
Send token via Authorization header:

http
Copy
Edit
Authorization: Bearer <your_jwt_token>
☁️ Deployment Guide (AWS EC2)
SSH into your EC2 instance.

Install Node.js, MySQL client, and Git.

Clone the repo and install dependencies.

Configure .env with RDS and JWT values.

Run your app using:

bash
Copy
Edit
npm install -g pm2
pm2 start server.js --name auth-service
Setup Nginx or AWS ALB if needed for reverse proxy.

📦 Example Request: Register
json
Copy
Edit
POST /api/auth/register
{
  "username": "tabrez",
  "password": "securepass"
}
📦 Example Request: Login
json
Copy
Edit
POST /api/auth/login
{
  "username": "tabrez",
  "password": "securepass"
}
Successful Login Response
json
Copy
Edit
{
  "token": "eyJhbGciOiJIUzI1NiIsInR..."
}
📜 License
This project is licensed under the MIT License.

✍️ Author
Made with ❤️ by Shaik Tabrez

LinkedIn | GitHub

yaml
Copy
Edit

---

✅ **Next Step:** Save this as `README.md` in the root of your project directory and push to GitHub using:

```bash
git add README.md
git commit -m "Add systematic README"
git push origin main
Let me know if you'd like the full zipped project for upload, or want to include a Dockerfile/CI setup too.








You said:
can you give it to me as a single chat


ChatGPT said:
Sure, Tabrez! Here's the complete README.md for your User Authentication Service project—all in one message, ready to upload to GitHub:

markdown
Copy
Edit
# 🛡️ User Authentication Service

A secure, scalable user authentication API built with **Node.js**, **Express**, **MySQL (hosted on AWS RDS)**, and **JWT**. Deployed on **AWS EC2**.

---

## 📁 Project Structure

user-auth-service/
├── config/ # Database connection config
├── controllers/ # Auth logic (register, login)
├── middleware/ # JWT auth middleware
├── routes/ # API route definitions
├── .env # Environment variables
├── .gitignore
├── package.json
├── server.js # Entry point
└── README.md

yaml
Copy
Edit

---

## 🚀 Features

- ✅ User registration with encrypted password (bcrypt)
- ✅ Login with JWT token generation
- ✅ Protected routes using JWT verification
- ✅ MySQL database hosted on AWS RDS
- ✅ Fully deployed on AWS EC2

---

## 🔧 Tech Stack

| Layer        | Technology           |
|--------------|----------------------|
| Backend      | Node.js, Express.js  |
| Authentication | JWT, bcrypt.js     |
| Database     | MySQL (AWS RDS)      |
| Deployment   | AWS EC2              |

---

## 🌐 API Endpoints

| Method | Endpoint        | Description         | Protected |
|--------|------------------|---------------------|-----------|
| POST   | `/api/auth/register` | Register new user   | ❌        |
| POST   | `/api/auth/login`    | Login and get token | ❌        |
| GET    | `/api/protected`     | Example protected route | ✅ |

---

## 🛠️ Installation

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/user-auth-service.git
cd user-auth-service
2. Install Dependencies
bash
Copy
Edit
npm install
3. Configure Environment Variables
Create a .env file:

env
Copy
Edit
PORT=3000
DB_HOST=your-rds-endpoint.amazonaws.com
DB_USER=admin
DB_PASSWORD=yourpassword
DB_NAME=user_auth
JWT_SECRET=your_jwt_secret
🗃️ Database Setup (MySQL on AWS RDS)
Login to your RDS instance using a MySQL client.

Run this SQL:

sql
Copy
Edit
CREATE DATABASE IF NOT EXISTS user_auth;

USE user_auth;

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(100) NOT NULL UNIQUE,
  password VARCHAR(255) NOT NULL
);
▶️ Run Locally
bash
Copy
Edit
npm start
# OR for development with auto-restart
npm run dev
🛡️ Token Authentication Middleware
Send token via Authorization header:

h
Copy
Edit
Authorization: Bearer <your_jwt_token>
☁️ Deployment Guide (AWS EC2)
SSH into your EC2 instance.

Install Node.js, MySQL client, and Git.

Clone the repo and install dependencies.

Configure .env with RDS and JWT values.

Run your app using:

bash
Copy
Edit
npm install -g pm2
pm2 start server.js --name auth-service
Setup Nginx or AWS ALB if needed for reverse proxy.

📦 Example Request: Register
json
Copy
Edit
POST /api/auth/register
{
  "username": "tabrez",
  "password": "securepass"
}
📦 Example Request: Login
json
Copy
Edit
POST /api/auth/login
{
  "username": "tabrez",
  "password": "securepass"
}
Successful Login Response
json
Copy
Edit
{
  "token": "eyJhbGciOiJIUzI1NiIsInR..."
}
