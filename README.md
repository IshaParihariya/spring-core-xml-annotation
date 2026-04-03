# Spring Core XML + Annotation Configuration

This project demonstrates the core concepts of the Spring Framework using a hybrid approach of XML and Annotation-based configuration. It follows a layered architecture similar to real-world applications.

---

## 🚀 Concepts Covered

* Inversion of Control (IoC)
* Dependency Injection (DI)
* XML Configuration
* Annotation-based Configuration
* Component Scanning
* Autowiring (`@Autowired`)
* Resolving ambiguity using `@Qualifier`
* Multiple beans of the same class (XML + Annotation)
* Stereotype Annotations

---

## 🏗️ Project Structure

```
com.isha
│
├── controller
│     └── MyController
│
├── service
│     ├── MyService
│     ├── Password
│     ├── Student
│     └── Config
│
├── dao
│     └── Dao
│
└── main
      └── LaunchApp
```

---

## 🧩 Stereotype Annotations Used

* `@Component` → General-purpose bean
* `@Controller` → Controller layer (handles request logic)
* `@Service` → Business logic layer
* `@Repository` → Data access layer

---

## ⚙️ Configuration

* `applicationconfig.xml` is used for:

  * Component scanning
  * Defining additional beans via XML

* Hybrid configuration:

  * XML + Annotations working together

---

## 🔧 Technologies Used

* Java 17
* Spring Core (5.3.30)
* Maven

---

## 💡 Key Learning

* Spring creates all singleton beans at container startup
* XML configuration overrides annotation if same bean ID is used
* Multiple beans of same type can exist and are resolved using `@Qualifier`
* Layered architecture improves code organization and readability

---

## ▶️ How to Run

1. Clone the repository
2. Open in IntelliJ IDEA / VS Code
3. Run `LaunchApp.java`
4. Observe bean creation and dependency injection in console

---

## 📌 Note

* All beans are managed by the Spring IoC container
* Default bean scope is Singleton
* Proper use of annotations helps in reducing XML configuration

---

## 🎯 Conclusion

This project builds a strong foundation in Spring Core concepts and prepares for advanced topics like Spring Boot and Spring MVC.
