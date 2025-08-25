# Proyecto Sistema de Préstamos de Libros

## Descripción
Este proyecto implementa un sistema simple de gestión de préstamos de libros.  
Permite crear usuarios con préstamos activos o inactivos, agregar libros a cada préstamo,  
mostrar los detalles de los préstamos y calcular el costo total de reemplazo de los libros.

---
## Estructura del Proyecto

```
JAVA0078_M4_PrestamoLibros/
│
├─ src/
│  └─ clases/
│     └─ Aplicacion.java
│     └─ Libro.java
│     └─ Prestamo.java
├─ diagrama.png
├─ diagrama.puml
└─ README.md
```

- **Aplicacion.java**  
  Clase principal que contiene el método `main`.  
  Se encarga de crear objetos `Prestamo` y `Libro`, asignar libros a préstamos y probar la funcionalidad de los métodos.

- **Libro.java**  
  Representa un libro con los atributos:
  - `titulo`
  - `autor`
  - `precioDeReemplazo`

- **Prestamo.java**  
  Representa un préstamo de libros.  
  Contiene los atributos:
  - `nombre`: nombre del usuario.
  - `libros`: lista de libros asociados al préstamo.
  - `estatus`: indica si el préstamo está activo o inactivo.  

  Incluye métodos para:
  - Agregar libros al préstamo.
  - Mostrar los detalles del préstamo.
  - Mostrar el estado del préstamo.
  - Calcular el costo total de reemplazo de los libros.

---
## Requisitos
- **Java JDK 8** o superior.
- IDE recomendado: **Spring Tool Suite (STS)** o **Visual Studio Code**.

---
## Ejecución
Desde la consola, compilar y ejecutar:

```bash
javac src/clases/*.java -d bin
java -cp bin clases.Aplicacion
```

---
## Generar Javadoc

```bash
javadoc -d javadoc src/clases/*.java
```

---
## Ejemplo de salida esperada
```
Prestamo 1:
Usuario: Invitado
Libro: Tu admiradora secreta, autor: Tessa Bailey
Libro: Happy Place, autor: Emily Henry
Préstamo activo
...
```

---
## Autor
- Laura Duhalde Ulloa