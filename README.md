# Actividad2_EnzoGarcia

Este proyecto es una aplicación Java desarrollada con Maven que contiene el uso de las librerías Apache Commons CLI para el manejo de argumentos de línea de comandos y Apache Log4j 2 para la gestión de logs.
La estructura del proyecto es la siguiente:
## Estructura del Proyecto
Actividad2_EnzoGarcia/
├── src/
│   └── main/
│       └── java/
│           └── ar.edu.udeci.pv
│               ├── App.java
│               ├── CommandLineApp.java
│               └── LoggingExample.java
│       └── resources/
│           └── log4j2.xml
├── target/
│   ├── ... (archivos generados por Maven)
├── .gitignore
├── pom.xml
└── README.md

## Dependencias

El proyecto utiliza las siguientes dependencias, gestionadas con Maven:

* **Apache Commons CLI (1.5.0):** Para el manejo de argumentos de línea de comandos.
* **Apache Log4j 2 (2.22.1):** Para la implementación del sistema de logging (`log4j-api` y `log4j-core`).


## Ejecuto la aplicación
### Utilizando Maven

### Requisitos

* **Java Development Kit (JDK):** Necesario para compilar y ejecutar la aplicación Java.
* **Maven:** Utilizado para gestionar las dependencias, compilar y empaquetar el proyecto. 

### Ejecución con Maven

1.  Abre una terminal y navega al directorio raíz del proyecto (`Actividad2_EnzoGarcia`).
2.  Para ejecutar la clase `CommandLineApp` con los argumentos definidos en la configuración del plugin `exec-maven-plugin` en el `pom.xml`, utiliza el siguiente comando:
    ```bash
    mvn exec:java
    ```
   
### Ejecución como JAR Ejecutable

1.  Abre una terminal y navega al directorio raíz del proyecto.
2.  Genera un JAR ejecutable con todas las dependencias utilizando Maven:
    ```bash
    mvn clean package
    ```
    Esto creará el archivo `Actividad2_EnzoGarcia-1.0-SNAPSHOT.jar` en el directorio `target`.
3.  Para ejecutar `CommandLineApp` desde el JAR, utiliza:
    ```bash
    java -jar target/Actividad2_EnzoGarcia-1.0-SNAPSHOT.jar -i archivo_entrada.txt -o archivo_salida.txt -v
    ```
4.  Para ejecutar `LoggingExample` desde el JAR (si modificaste la `mainClass` al empaquetar), usa:
    ```bash
    java -jar target/Actividad2_EnzoGarcia-1.0-SNAPSHOT.jar
    ```

## Interacción con la Aplicación

### CommandLineApp

La aplicación `CommandLineApp` espera los siguientes argumentos al ejecutarse:

* `-i` o `--input`: Especifica la ruta del archivo de entrada.
* `-o` o `--output`: Especifica la ruta del archivo de salida.
* `-v` o `--verbose`: Activa el modo detallado, lo que puede hacer que la aplicación muestre más información en la consola.


### LoggingExample

La aplicación `LoggingExample` demuestra el uso de Log4j 2 para generar logs en diferentes niveles:

* **DEBUG:** Información detallada útil durante el desarrollo.
* **INFO:** Mensajes generales sobre el funcionamiento de la aplicación.
* **WARN:** Indicadores de posibles problemas o situaciones inesperadas.
* **ERROR:** Errores que impiden alguna funcionalidad, pero la aplicación puede continuar.
* **FATAL:** Errores graves que pueden llevar a la terminación de la aplicación.


## Desarrollo del Proyecto

### Creación del Proyecto Maven

El proyecto se creó utilizando el arquetipo `maven-archetype-quickstart` , investigué y para el proyecto que queria realizar la recomendación era este arquetipo.

Las dependencias para Apache Commons CLI y Apache Log4j 2 se añadieron al archivo `pom.xml` dentro de la etiqueta `<dependencies>`. 

### Implementación de CommandLineApp

La clase `CommandLineApp.java` utiliza la librería `commons-cli` para definir las opciones `-i`, `-o`, y `-v`. 

### Implementación de LoggingExample

La clase `LoggingExample.java` obtiene un logger utilizando `LogManager.getLogger()` y luego genera mensajes de log en cada uno de los niveles definidos por Log4j 2. Esto demuestra cómo utilizar la API de Log4j 2 para registrar eventos importantes dentro de la aplicación.

### Creación de un JAR Ejecutable

Para crear un JAR que contenga todas las dependencias necesarias para ejecutar la aplicación, se utilizó el plugin `maven-shade-plugin`. Este plugin empaqueta las dependencias dentro del archivo `Actividad2_EnzoGarcia-1.0-SNAPSHOT.jar` generado en el directorio `target`.

## Autor

Enzo Garcia
enzongarcia1@gmail.com
GitHub: https://github.com/enzgarcia
LinkedIn: https://www.linkedin.com/in/enzo-nicolas-garcia/
