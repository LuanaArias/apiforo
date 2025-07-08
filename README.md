# 📚 ForoHub - API REST con Spring Boot

Este proyecto es una API RESTful construida con **Spring Boot 3**, cuyo objetivo es gestionar tópicos de discusión académica en una plataforma tipo foro. Incluye funcionalidades CRUD para tópicos, validaciones, autenticación con JWT y pruebas utilizando **Insomnia**.

---

## 🚀 Funcionalidades principales

### ✅ Registro de Tópico

- **Método**: `POST`
- **URL**: `/topicos`
- **Descripción**: Crea un nuevo tópico en la base de datos.
- **Validaciones**:
  - Todos los campos (`título`, `mensaje`, `autor`, `curso`) son obligatorios.
  - No se permiten duplicados (mismo título y mensaje).
- **Anotaciones clave**: `@RequestBody`, `@Valid`

---

### 🔍 Detalle de un Tópico

- **Método**: `GET`
- **URL**: `/topicos/{id}`
- **Descripción**: Muestra los datos completos de un tópico existente.
- **Validaciones**:
  - El `id` debe existir en la base de datos.
- **Anotación**: `@PathVariable`

---

### ✏️ Actualización de Tópico

- **Método**: `PUT`
- **URL**: `/topicos/{id}`
- **Descripción**: Actualiza un tópico existente.
- **Validaciones**:
  - Mismos requisitos que en la creación.
  - El `id` debe existir (`Optional.isPresent()`).
- **Anotaciones**: `@RequestBody`, `@Valid`, `@PathVariable`

---

### 🗑️ Eliminación de Tópico

- **Método**: `DELETE`
- **URL**: `/topicos/{id}`
- **Descripción**: Elimina un tópico existente por ID.
- **Validación**:
  - El `id` debe existir previamente.
- **Anotación**: `@PathVariable`

---

## 🔐 Autenticación y Seguridad

Esta API implementa **autenticación con JWT** mediante `Spring Security`.

### ✅ Login

- **Método**: `POST`
- **URL**: `/login`
- **Cuerpo (JSON)**:
  ```json
  {
    "login": "usuario",
    "clave": "123456"
  }
  
###🛠️ Tecnologías utilizadas
- Java 17
- Spring Boot 3
- Spring Data JPA
- Spring Security
- JWT (Auth0)
- MySQL
- Maven

##👤 Autora
Luana Arias Lavia
📧 [luanaariaaas@gmail.com]
