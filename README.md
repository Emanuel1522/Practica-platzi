# 🛒 Platzi Market - Backend API

Este proyecto es una API REST de un sistema de supermercado hecha con **Spring Boot**, arquitectura **hexagonal (limpia)**, base de datos **PostgreSQL**, y construida con **Gradle**. Permite gestionar productos, compras y categorías.

---

## 🚀 Tecnologías utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Arquitectura Hexagonal (Clean Architecture)**
- **Gradle (con Wrapper)**
- **Swagger OpenAPI 3 para documentación**

---

## ⚙️ Configuración

### `application.properties`

```properties
spring.application.name=platzi
spring.profiles.active=dev
application-dev.properties
properties
Copiar
Editar
server.port=8090

# PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/platzi-market
spring.datasource.username=postgres
spring.datasource.password=leuname12
📦 Endpoints principales
🛍️ Productos /products
Método	Ruta	Descripción
GET	/products/all	Obtener todos los productos
GET	/products/{id}	Obtener producto por ID
GET	/products/category/{categoryId}	Obtener productos por categoría
GET	/products/scarse-products/{quantity}?active=	Obtener productos escasos
POST	/products/save	Guardar nuevo producto
DELETE	/products/delete/{id}	Eliminar producto por ID

🧾 Compras /purchases
Método	Ruta	Descripción
GET	/purchases/all	Obtener todas las compras
GET	/purchases/{id}	Obtener compras por ID de cliente
POST	/purchases/save	Guardar una compra nueva

📌 Notas
El proyecto no está desplegado en la nube ya que se encuentra en fase de desarrollo local.

Está documentado y estructurado con Gradle Wrapper para facilitar su ejecución.
