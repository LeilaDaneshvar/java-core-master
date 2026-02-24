#  Java Core Master

A comprehensive, multi-module repository documenting the evolution of Java. This project serves as a technical reference for Core Java concepts, from legacy fundamentals to modern Java 17 features.

---

##  Project Architecture
This repository uses a **Maven Multi-Module** structure to isolate different eras and features of the Java language.

| Module | Focus Area | Key Concepts |
| :--- | :--- | :--- |
| **01-fundamentals** | Language Basics | JVM Architecture, Memory Management, Data Types. |
| **02-oop-design** | Object Orientation | Polymorphism, Interfaces (Default/Static), Solid Principles. |
| **03-modern-java** | Java 8 to 11 | Streams API, Lambdas, Optional, Var, HTTP Client. |
| **04-java-17-plus** | Modernization | **Records**, **Sealed Classes**, Pattern Matching, Text Blocks. |

---

##  Tech Stack
* **Language:** Java 17 (LTS)
* **Build Tool:** Maven 3.8+
* **Testing:** JUnit 5 (Jupiter)
* **CI/CD:** GitHub Actions

---

##  Getting Started

### Prerequisites
* **JDK 17** installed (`java -version` should report 17).
* **Maven** installed (`mvn -version`).

### Installation
1. Clone the repository:
   ```bash
   git clone [https://github.com/LeilaDaneshvar/java-core-master.git](https://github.com/LeilaDaneshvar/java-core-master.git)

---

## Java Core Master: Learning Roadmap

### Module 01: Language Fundamentals (The "Slow Burn")
*Focus on JVM internals and memory management.*
- [ ] **JVM Architecture:** Understanding Stack vs. Heap memory allocation.
- [ ] **Garbage Collection:** Basics of G1 and ZGC algorithms.
- [ ] **Primitives vs. Wrappers:** Memory implications and Auto-boxing.
- [ ] **String Pool:** String interning and why Strings are immutable.
- [ ] **Exception Handling:** Hierarchy (Checked vs. Unchecked) and `try-with-resources`.

---

### Module 02: OOP & Design Patterns
*Building extensible and maintainable microservice architectures.*
- [ ] **Interfaces:** Default and Static methods (Java 8+ additions).
- [ ] **Abstraction:** Abstract Classes vs. Interfaces in modern design.
- [ ] **Solid Principles:** Single Responsibility, Open/Closed, etc., in Java.
- [ ] **Generics:** Type erasure, bounded wildcards (`<? extends T>`).
- [ ] **Enums:** Advanced usage with fields and methods.

---

### Module 03: Modern Java (8, 11)
*The daily drivers for Microservice development.*
- [ ] **Lambda Expressions:** Functional interfaces and method references.
- [ ] **Streams API:** Intermediate (`filter`, `map`) and Terminal (`collect`, `forEach`) operations.
- [ ] **Optional API:** Practical patterns to avoid `NullPointerException`.
- [ ] **Var Keyword:** Local Variable Type Inference (Java 11).
- [ ] **New HTTP Client:** Building asynchronous and reactive requests.

---

### Module 04: Java 17+ Modernization (The "Fast Track")
*The cutting-edge features for clean DTOs and domain logic.*
- [ ] **Records:** Immutable data carriers to replace boilerplate POJOs.
- [ ] **Sealed Classes:** Restricting class hierarchies for better domain modeling.
- [ ] **Switch Expressions:** Using `yield` and the new arrow `->` syntax.
- [ ] **Pattern Matching:** Simplified `instanceof` checks and Record patterns.
- [ ] **Text Blocks:** Clean handling of multi-line strings (JSON, SQL).

---

### Cross-Cutting: Testing & Build Tools
*Professional environment setup.*
- [ ] **JUnit 5:** Lifecycle hooks (`@BeforeEach`, `@AfterAll`) and Assertions.
- [ ] **Parameterized Tests:** Using `@ValueSource` and `@CsvSource`.
- [ ] **Maven Multi-Module:** Managing parent-child `pom.xml` relationships.
- [ ] **GitHub Actions:** Automating your build and test suite.


---

## Contact & Socials

I'm always open to discussing Java architecture, microservices, or potential collaborations!

* **Name:** Leila Daneshvar
* **LinkedIn:** [linkedin.com/in/leila-daneshvar](https://linkedin.com/in/leila-daneshvar-tarigh)
* **GitHub:** [@LeilaDaneshvar](https://github.com/LeilaDaneshvar)

