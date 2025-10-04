# NeuroStack: Spring Boot Full Stack AI Microservices Project (Kafka, AWS, Keycloak, OAuth2)

**NeuroStack** is a comprehensive **full-stack microservices project** built with **Spring Boot**.
It is designed as a hands-on platform for mastering **Microservices Architecture, AI integration, Messaging with Kafka, Security with Keycloak & OAuth2, and Deployment on AWS**.

---

## 🎯 Objectives

* Build and understand **Spring Boot microservices architecture**.
* Use **Eureka Server** for service discovery and registry.
* Implement **User Service** and **Activity Service** as independent, scalable microservices.
* Secure services using **Keycloak** and **OAuth2**.
* Integrate **Apache Kafka** for asynchronous event-driven communication.
* Deploy microservices on **AWS Cloud** with CI/CD pipelines.
* Enhance features with **AI-powered modules**.

---

## 🛠 Tech Stack

* **Java 17+**, **Spring Boot 3+**
* **Spring Cloud Netflix Eureka** (Service Discovery)
* **Apache Kafka** (Messaging & Streaming)
* **Keycloak** & **OAuth2** (Authentication & Authorization)
* **MySQL / PostgreSQL** (Relational Database)
* **MongoDB** (NoSQL Database)
* **Docker & Kubernetes** (Containerization & Orchestration)
* **AWS Services** (Deployment, Scalability, Cloud-Native Tools)

---

## 📂 Project Structure

```
NeuroStack/
 ├── EurekaService/        # Eureka Server (service registry)
 │    └── src/main/java/com/neurostack/eureka
 │         └── EurekaServiceApplication.java
 │    └── resources/application.yml
 │
 ├── UserService/          # User management microservice
 ├── ActivityService/      # Activity/workout tracking microservice
 ├── GatewayService/       # API Gateway (routing & load balancing)
 ├── AIService/            # AI-powered recommendations & analysis
 ├── pom.xml               # Parent POM
```

---

## ▶️ Running the Eureka Server

1. Navigate to the `EurekaService` directory:

   ```bash
   cd EurekaService
   ```

2. Run the application using Maven:

   ```bash
   mvn spring-boot:run
   ```

   Or run the `EurekaServiceApplication` class directly from your IDE.

3. Access the Eureka Dashboard at:

   ```
   http://localhost:8761
   ```

---

## ⚙️ Example `application.yml` (Eureka Server)

```yaml
server:
  port: 8761

eureka:
  client:
    register-with-eureka: false
    fetch-registry: false
```

---

## 🚀 Key Features

* **Service Registry & Discovery** using Eureka.
* **Microservices Security** with Keycloak & OAuth2.
* **Asynchronous Communication** with Kafka.
* **Scalable Deployment** on AWS using Docker/Kubernetes.
* **AI Integration** for intelligent recommendations.

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome. Please open a pull request or raise an issue to get involved.

---

## 📄 License

This project is licensed under the MIT License.
