# Online Store

Microservice-based online store: Spring Boot 4.2, Gradle (multi-module, Kotlin DSL), Java 25.

## Modules

| Module | Port | Storage | Kafka |
|---|---|---|---|
| `api-gateway` | 8080 | — | — |
| `auth-service` | 8081 | PostgreSQL | publish |
| `user-service` | 8082 | PostgreSQL | consume |
| `catalog-service` | 8083 | MongoDB | — |
| `cart-service` | 8084 | MongoDB | — |
| `order-service` | 8085 | PostgreSQL | publish |
| `notification-service` | 8086 | — | consume |
| `common` | — | — | — |

## Tech stack

| Area | Technology |
|---|---|
| Language / build | Java 25, Gradle 9.9.2 (wrapper), version catalog `gradle/libs.versions.toml` |
| Framework | Spring Boot 4.2.0, Spring Cloud 2026.0.0 |
| Gateway | Spring Cloud Gateway (WebFlux), Spring Security OAuth2 Resource Server |
| REST | Spring Web MVC, Bean Validation, springdoc-openapi 3.2 |
| Service-to-service REST | Spring RestClient |
| Security | Spring Security, Spring Security OAuth2 JOSE |
| PostgreSQL | Spring Data JPA, Flyway, PostgreSQL 17 |
| MongoDB | Spring Data MongoDB, MongoDB 8.0 |
| Messaging | Apache Kafka 4.1, Spring for Apache Kafka |
| Email | Spring Mail; Mailpit for local development |
| Observability | Spring Boot Actuator |
| Testing | JUnit 5, Spring Boot Test, Testcontainers 2.0 |
| Other | Lombok |

## Infrastructure

```
docker compose up -d
```

PostgreSQL `:5432` (databases `auth_db`, `user_db`, `order_db`), MongoDB `:27017`, Kafka `:9092`, Mailpit `:1025` / http://localhost:8025.

## Build

```
./gradlew build
```
