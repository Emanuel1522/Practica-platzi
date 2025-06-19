# 🛒 Platzi Market - API REST - Practica con curso de platzi

Backend desarrollado con **Spring Boot** y **arquitectura limpia (hexagonal)** que simula un sistema de compras para un supermercado digital llamado **Platzi Market**. El sistema permite realizar operaciones CRUD sobre productos, categorías y compras.

---

## ⚙️ Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Gradle (con Wrapper)
- Swagger OpenAPI 3 (para documentación)

---

## 🧱 Arquitectura

El proyecto sigue los principios de **arquitectura hexagonal**, separando responsabilidades en:

- `domain`  
  - `model`: entidades del dominio (Product, Category, Purchase, etc.).
  - `repository`: interfaces para casos de uso.
  - `service`: lógica del negocio.
- `persistence`  
  - `entity`: entidades JPA mapeadas.
  - `crud`: interfaces de repositorio que extienden `JpaRepository`.
  - `mapper`: conversores entre entidades JPA y entidades del dominio.
  - `repository`: implementación de interfaces del dominio.
- `web.controller`: controladores REST.
- `resources`: configuración, documentación, etc.

---

## ⚙️ Configuración de base de datos


###properties
spring.application.name=platzi
spring.profiles.active=dev

server.port=8090

# PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/platzi-market
spring.datasource.username=postgres
spring.datasource.password=leuname12

### 📦 Productos (`/products`)
## 🔄 Endpoints disponibles

| Método  | Ruta                                       | Descripción                                 |
|---------|--------------------------------------------|---------------------------------------------|
| GET     | `/products/all`                            | Obtener todos los productos                 |
| GET     | `/products/{id}`                           | Obtener un producto por ID                  |
| GET     | `/products/category/{categoryId}`          | Obtener productos por categoría             |
| GET     | `/products/scarse-products/{quantity}`     | Obtener productos con stock bajo            |
| POST    | `/products/save`                           | Guardar un nuevo producto                   |
| DELETE  | `/products/delete/{id}`                    | Eliminar un producto por ID                 |

---

### 🧾 Compras (`/purchases`)

| Método  | Ruta                | Descripción                                  |
|---------|---------------------|----------------------------------------------|
| GET     | `/purchases/all`    | Obtener todas las compras                    |
| GET     | `/purchases/{id}`   | Obtener compras por ID de cliente            |
| POST    | `/purchases/save`   | Guardar una nueva compra                     |


## 👨‍💻 Autor

Desarrollado por Emanuel Rojas Ramirez — Proyecto de portafolio personal.
