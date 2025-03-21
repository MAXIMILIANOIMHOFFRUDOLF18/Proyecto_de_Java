# 🦆 Proyecto de Java: Clases de Ducks con 4 características

## 📌 Descripción
Este proyecto, fué desarrollado en **Visual Studio Code**, implementa el patrón de diseño **Estrategia** en el lengüaje de Java con la finalidad de modelar diferentes tipos de patos (**Duck**). Dentro se usan **interfaces** para definir su comportamiento de vuelo y quack, permitiendo flexibilidad y reutilización de código.

## 🏗️ Estructura del Código
El código se organiza de la siguiente manera:

📂 **Proyecto_de_Java/**
- 📄 `Duck.java` → Clase base con lógica común, en donde mandamos a llamar las 4 características de cada Duck.
- 📄 `FlyBehavior.java` → Interfaz para el vuelo.
  - 📄 `FlyWithWings.java` → Implementación de vuelo con alas.
  - 📄 `NoFlyWay.java` → Implementación sin vuelo.
- 📄 `QuackBehavior.java` → Interfaz para los sonidos.
  - 📄 `Quack.java` → Hace "Quack".
  - 📄 `Squeak.java` → Hace "Squeak" (sonido de pato de goma).
  - 📄 `MuteQuack.java` → No hace sonido.
- 📄 `Decoy.java` → Implementación de pato de madera.
- 📄 `Mallard.java` → Implementación de pato Mallard.
- 📄 `RubberDuck.java` → Implementación de pato de goma.
- 📄 `App.java` → Punto de entrada del programa.

## 🛠️ Tecnologías Utilizadas
- **Lenguaje:** Java ☕
- **IDE:** Visual Studio Code 🖥️
- **Patrón de Diseño:** Estrategia 🏗️

## 🚀 Instalación y Ejecución
1. Clona este repositorio:
   ```sh
   git clone https://github.com/usuario/Proyecto_de_Java.git
   ```
2. Accede al directorio del proyecto:
   ```sh
   cd Proyecto_de_Java
   ```
3. Compila los archivos:
   ```sh
   javac src/*.java
   ```
4. Ejecuta el programa:
   ```sh
   java src.Main
   ```

## 📄 Parte del Código de mayor relevancia
```java
// Clase Duck debe ser abstracta
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // Único método a sobreescribir en todas las subclases
    public Duck(){
    }

    public abstract void display();

    // Dependiendo del constructor de las subclases será el tipo de vuelo
    public void performFly(){
        flyBehavior.fly();
    }

    // Dependiendo del constructor de las subclases será el tipo de graznido
    public void performQuack(){
        quackBehavior.quack();
    }

    // Este método siempre es el mismo para todos, por lo que no utiliza una interface
    public void swim(){
        System.out.println("I'm swimming!");
    }

    // Mando a llamar las 4 acciones en mi terminal en este orden!
    public void showDuck(){
        display();
        performFly();
        performQuack();
        swim();
    } 
}

// Interface que conecta la clase Duck con los tipos de vuelos creados, en este caso tenemos 2 FlyNoWay & FlyWithWings

public interface FlyBehavior {
    public void fly();
}

// Interface que conecta la clase Duck con los tipos de quack creados, en este caso tenemos 3 Quack & Squeak & MuteQuack

public interface QuackBehavior {
    public void quack();
}

```

## ✅ Características Implementadas
- ✅ Uso del patrón **Estrategia** para comportamientos dinámicos.
- ✅ Su utiliza **interfaces** para vuelo y sonido.
- ✅ Comportamiento de nado igual para todos los patos.
- ✅ Fácil escalabilidad para agregar nuevos tipos de patos.

## 📌 Contribución
Si deseas contribuir, crea un **Pull Request** o reporta un problema en **Issues**.

## 📜 Licencia
Este proyecto está bajo la licencia MIT.

