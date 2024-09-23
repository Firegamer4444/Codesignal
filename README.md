# CodeSignal 

Este repositorio contiene una colección de los ejercicios que he resuelto en la plataforma **CodeSignal** utilizando **Java**. Cada ejercicio está organizado en paquetes que corresponden a las diferentes secciones de la plataforma, y los nombres de las clases corresponden a los títulos de los ejercicios en CodeSignal. Además, se incluyen los **test unitarios** proporcionados por la propia plataforma para verificar la corrección de los ejercicios.

## Estructura del Proyecto

La organización de los ejercicios y tests sigue la siguiente estructura:

```
src/
│
├─── main/
│    └─── java/
│         ├─── edgeoftheocean/
│         ├─── exploringTheWaters/
│         ├─── islandOfKnowledge/
│         ├─── rainsOfReason/
│         ├─── smoothSailing/
│         └─── thejourneybegins/
│
└─── test/
     └─── java/
          ├─── edgeoftheocean/
          ├─── exploringTheWaters/
          ├─── islandOfKnowledge/
          ├─── rainsOfReason/
          ├─── smoothSailing/
          └─── thejourneybegins/
```

### Paquetes por Sección

Cada uno de los paquetes (por ejemplo, `edgeoftheocean`, `thejourneybegins`) corresponde a una sección o "zona" de CodeSignal, y dentro de estos paquetes, las clases tienen el nombre del ejercicio según aparece en la plataforma.

Por ejemplo:

- En el paquete `edgeoftheocean/`, encontrarás ejercicios como `almostIncreasingSequence.java` o `makeArrayConsecutive2.java`.
- En el paquete `thejourneybegins/`, puedes encontrar clases como `add.java` o `centuryFromYear.java`.

### Test Unitarios

En la carpeta `test/`, se encuentran los test unitarios que validan la solución de cada ejercicio. Los tests están organizados en los mismos paquetes que las soluciones, y cada clase de test corresponde a un ejercicio, añadiendo el sufijo `Test`. Por ejemplo, `addTest.java` valida el ejercicio `add.java`.

## Cómo ejecutar el proyecto

### Requisitos previos

- **Java** JDK 8 o superior.
- **JUnit** para ejecutar los tests unitarios.

### Compilar los ejercicios

Para compilar las clases de los ejercicios puedes usar el siguiente comando en la raíz del proyecto:

```bash
javac -d out/ src/main/java/**/*.java
```
