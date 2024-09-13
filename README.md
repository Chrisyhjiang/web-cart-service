# web-cart-service

This repository contains a RESTful API for managing an online shopping cart, built using the Spring Boot framework. It provides endpoints for adding, removing, and managing items in a user's cart.

## Features

- Add items to the shopping cart.
- Remove items from the shopping cart.
- View the contents of the shopping cart.
- Update quantities of items in the cart.
- Clear the cart.
- Calculate total price of items in the cart.

## Technologies

- **Spring Boot** - Framework used to build the RESTful API.
- **Maven** - Dependency management and build tool.
- **Java** - Programming language used.
- **Database** - In-memory database for testing purposes (optional).
- **JUnit** - Unit testing framework.

## Prerequisites

Make sure you have the following installed:

- Java 17 or later
- Maven 3.6+
- Git

## Getting Started

### Clone the repository

```bash
git clone https://github.com/Chrisyhjiang/web-cart-service.git

### build the project 
cd /path/to/web-cart-service
mvn clean install

### run the application
mvn spring-boot:run

### test the service
install postman to test the api endpoint.

