# Java Fundamentals

A concept-first Java 17 Maven module in **java-core-master**.

## Layout

- `src/main/java/com/lemini/javacore/fundamentals` — runnable examples and exercises.
- `src/test/java/com/lemini/javacore/fundamentals` — matching JUnit 5 test packages.
- Empty topic folders contain `.gitkeep` so GitHub retains the planned hierarchy.
- All Java package names are lowercase without hyphens, matching Java conventions.

## Topics

| Package | Coverage |
| --- | --- |
| `basics` | Variables, types, operators, control flow, loops, methods, packages, access |
| `oop` | Classes, encapsulation, inheritance, polymorphism, abstraction, nested classes |
| `strings` | Strings, pool, equality, builders, formatting, regex, Unicode |
| `arrays` | One/multidimensional arrays, copying, utilities |
| `exceptions` | Checked/unchecked, custom, hierarchy, resources, best practices |
| `generics` | Generic classes/methods, bounds, wildcards, erasure, PECS |
| `enums` | Simple enums, fields, interfaces, methods |
| `annotations` | Built-in, custom, meta-annotations, runtime processing |
| `reflection` | Metadata, fields, methods, constructors, instantiation |
| `objectclass` | `equals`, `hashCode`, `toString`, cloning |
| `io` | Basic Java I/O, files, paths, serialization |


## Build and test

This child POM inherits `com.lemini:java-core-master:1.0-SNAPSHOT` from `../pom.xml`.

## Organization decisions

- Modern Java version-specific features (such as virtual threads) should live outside this module.
- Collections, concurrency, design patterns, and JVM internals remain separate Maven modules.
- Keep tests adjacent conceptually via a *mirrored test package*, not next to main source files.
- Prefer one test class per example and document both usage and edge cases.
