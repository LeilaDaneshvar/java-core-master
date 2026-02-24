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