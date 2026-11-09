Sistema de Gestión, Llanquihue Tour 

Descripción del proyecto.
Este proyecto consiste en un sistema básico desarrollado en Java para digitalizar los registros de la agencia de turismo Llanquihue tour. El objetivo estructurar la información de las personas vinculadas a la empresa para evitar la duplicación de datos y dejar atrás la gestión manual de los procesos. En su desarrollo se aplicaron los principios fundamentales de la Programación orientada a objetos, tales como el encapsulamiento, la herencia y la composición. 

Estructura del código.
Para mantener el orden y separar la lógica, el código fuente se organizó de manera modular en dos paquetes:

Paquete model: Contiene las clases del dominio. Aquí se encuentra la clase base "Persona"; la clase "Empleado" (que hereda los atributos de Persona) y la clase "Direccion" (que se utiliza como atributo dentro de Persona para establecer una relación de composición). Todos los atributos fueron declaros de forma privada para asegurar el encapsulamiento, accediendo a ellos mediante métodos públicos.
Paquete app: Contiene la clase principal "Main", la cual sirve como punto de entrada del sistema para instanciar los objetos y poner a prueba el modelo. 

Instrucciones de ejecución.
Para compilar y probar el sustema localmente, se deben seguir los pasos:
- Abrir el proyecto completo en un entorno de desarrollo para Java (Apache NetBeans, Intellij IDEA, etc)
- Navegar en el panel de proyectos hasta el paquete "app" y abrir el archivo "Main.Java".
- Ejecutar el archivo (en NetBeans corriendo el programa con la opción "Run File" o presionando Shift + F6).
- Revisar la ventana de la consola (Output), donde se imprimirán correctamente formateados los datos de los objetos instanciados. 
