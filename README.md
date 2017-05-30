### Objetivo de la aplicación
El objetivo de la aplicación es proporcionar una herramienta a trabajadores  y comensales dentro de un restaurante para facilitar la consulta, toma de pedidos y realización de los mismos.

### Descripción de la aplicación
La aplicación proporciona a la persona el menú y la información que requiere de un restaurante; a los meseros, la distribución y sus tareas correspondientes; a los cocineros, las ordenes a preparar y facilidades para indicar que ya están listas; y a los jefes, el control de todas las características relacionadas con el establecimiento.

### Clases principales y sus características
1. Usuario
* nombre : String
* correoElectronico : String
* restaurantes : ArrayList<Restaurante>

2. Restaurante
* nombre : String
* direccion : String
* telefono : String
* horarioInicio: String 
* horarioFin : String
* empleados :  ArrayList<Empleado>
* menu : Menu
* mesas : ArrayList <Mesa>

3. Menu
* menu : ArrayList<Platillo>

4. Empleado
* horInicio : String 
* horFin: String  
* disponibilidad : Boolean

5. Platillo
* nombre : String
* tipo : String
* costo : float
* descripcion : String

6. Mesero
* mesasCorrespondientes : ArrayList<Mesa> 

7. Cocinero
* pedidos : ArrayList<Pedido>

8. Mesa
* pedido : Pedido
* capacidad : int
* identificador : int
* estaOcupada : Boolean

9. Pedido
* orden : ArrayList <Platillo>
* estaListo : boolean  
* nota : String

### Diagrama de clases
![Diagrama de clases](https://github.com/acominf/AppRestaurante/blob/master/imágenes/Diagrama-UML.png)

### Autor(es)
El autor(es) del proyecto son:
- Mayra Lucero García Ramírez (@mayralgr)
- Víctor Andrián Suárez  Ruiz (@BigThor)

### Materia(s)
- Programación Orientada a Objetos

### Semestre
- 2016-2017/II

### Video
Video demostrativo de la aplicación: 
<iframe width="560" height="315" src=https://youtu.be/729xTBdL9Io> </iframe>

### Markdown
El contenido de esta página está escrito en un lenguaje de marcado sencillo llamado *Markdown*. Para más detalles consulta la página de [Markdown para GitHub](https://guides.github.com/features/mastering-markdown/).

### Temas de Jekyll
El estilo y presentación de esta página utiliza el tema de Jekyll seleccionado en la configuración del repositorio. El nombre de este tema está almacenado en el archivo de configuración `_config.yml`. Para más información acerca de los temas de Jekyll soportados por GitHub [haz click en este enlace](https://pages.github.com/themes/).
