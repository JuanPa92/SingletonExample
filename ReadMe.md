# Singleton
## ¿Qué es?

Singleton es un patrón de diseño creativo que le permite asegurarse de que una clase tenga solo una instancia, mientras proporciona un punto de acceso global a esta instancia.

## ¿Qué hace?
Asegura que una clase tenga una sola instancia y proporciona un punto de acceso global a esa instancia

## ¿Cómo lo hace?

Se hace que el constructor predeterminado sea privado y se crea un método de creación estática que actúa como un constructor.

## Ventajas

Puedes estar seguro de que una clase tiene una sola instancia.
Obtienes un punto de acceso global a esa instancia.
El objeto singleton se inicializa solo cuando se solicita por primera vez.

## Desventajas

Viola el principio de responsabilidad única.
El patrón Singleton puede enmascarar un mal diseño.
El patrón requiere un tratamiento especial en un entorno multiproceso.
Puede ser difícil realizar una prueba unitaria del código de cliente del Singleton

## Explicación de codigo

Tenemos dos clases, Main donde se va a tratar de crear dos instancias de la clase Singleton y la clase Singleton que solo permite instanciar una sola vez el objeto si es que antes no se ha instanciado.

### Clase Singleton

En esta clase primero se genera una instancia de la siguiente forma de Singleton:

	private static Singleton instance;

Esto para que solo pueda modificarse dentro de la misma clase Singleton y ninguna extarna la pueda modificar. La variable String value solo se pone para asegurarnos que el objeto Singleton no sea modificado.

El constructor Singleton igualmente tiene que ser privado ya que debemos recordar que la clase Main (ni ninguna otra para el caso) podrá mandarlo a llamar y solo se ejetara UNA SOLA VEZ si es que no hay una instancia previa; el try y catch solo se utilizan para emular un inicio lento así que no es necesario prestar atención.

Finalmente el metodo 

	public static Singleton getInstance(String value)

Es el que se utiliza dentro de las otras clases para poder acceder la instancia unica del objeto o inicializarla la primera vez. 

### Clase Main

Aquí tratamos de crear dos instancias de la clase Singleton con los comandos 

	Singleton singleton = Singleton.getInstance("FOO");
	Singleton anotherSingleton = Singleton.getInstance("BAR");

Para lo cual solamente se creara la instancia con el valor FOO y aunque anotherSingleton trate de hacer una segunda instancia con el valor BAR, el metodo getInstance solamente le dejara consultar la instancia ya creada.

## Enlace externo

Dentro de la siguiente ruta podrás encontrar la documentación
[Documentacion Refactoring Guru](https://refactoring.guru/design-patterns/singleton)