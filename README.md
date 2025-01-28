
# Java-Programme

Willkommen im Repository **Java-Programme**. Dieses Repository enthält eine Sammlung von Java-Projekten und -Übungen, die verschiedene Konzepte und Implementierungen der Java-Programmierung demonstrieren.

## Inhaltsverzeichnis

- [Java-Programme](#java-programme)
  - [Inhaltsverzeichnis](#inhaltsverzeichnis)
  - [Überblick](#überblick)
  - [Projekte](#projekte)
  - [Voraussetzungen](#voraussetzungen)
  - [Installation und Ausführung](#installation-und-ausführung)

## Überblick

Dieses Repository dient als Sammlung verschiedener Java-Programme, die im Rahmen von Praktika und persönlichen Projekten entwickelt wurden. Jedes Unterverzeichnis repräsentiert ein eigenständiges Projekt oder eine Übung mit spezifischen Zielen und Implementierungen.

## Projekte

Die folgenden Projekte sind in diesem Repository enthalten:

- **Avl_Tree**: Implementierung eines selbstbalancierenden AVL-Baums.
- **BinaryTree**: Implementierung eines binären Suchbaums.
- **Client_x_Server**: Beispiel für eine Client-Server-Kommunikation in Java.
- **Praktikum_1** bis **Praktikum_19**: Verschiedene Praktikumsaufgaben zu unterschiedlichen Themen der Java-Programmierung.
- **X_vs_O**: Umsetzung des Spiels "Tic-Tac-Toe".

Weitere Details zu jedem Projekt finden Sie in den jeweiligen Unterverzeichnissen.

## Voraussetzungen

Um die Projekte auszuführen, benötigen Sie:

- **Java Development Kit (JDK)**: Version 17 oder höher. Sie können das JDK von der offiziellen OpenJDK-Website herunterladen: [https://openjdk.org/projects/jdk/17](https://openjdk.org/projects/jdk/17)
- **Apache Maven**: Für Projekte, die Maven zum Build-Management verwenden. Maven kann von [https://maven.apache.org/](https://maven.apache.org/) bezogen werden.

## Installation und Ausführung

1. **Repository klonen**:
   ```bash
   git clone https://github.com/weski17/Java.git
   cd Java
   ```

2. **Projekt auswählen**:
   Navigieren Sie in das Verzeichnis des gewünschten Projekts:
   ```bash
   cd Projektverzeichnis
   ```

3. **Projekt bauen und ausführen**:
   - Für Projekte mit einer `pom.xml`-Datei (Maven-Projekte):
     ```bash
     mvn clean install
     java -jar target/Projektname.jar
     ```
   - Für andere Projekte:
     ```bash
     javac *.java
     java Hauptklasse
     ```

   Stellen Sie sicher, dass Sie die spezifischen Anweisungen in den einzelnen Projektverzeichnissen beachten, da einige Projekte zusätzliche Schritte oder Abhängigkeiten erfordern können.

