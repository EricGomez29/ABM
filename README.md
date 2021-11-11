# ABM Basico

## Tecnologías utilizadas:
 - Java 8
 - Springboot / Maven
 - Javascript
 - Postgresql

## Requisitos para correr el proyecto:
  - Descargar [postgresql](https://www.postgresql.org/) configurar e instalarlo.
  - IDE: Eclipse o similar (Spring Tool Suite 4 deseable)
  - Editar el archivo que se encuentra en ``src/main/resources/application.properties``
    con los datos de nuestra DB creada en postgresql: 
    ```
    spring.jpa.database=POSTGRESQL
    spring.jpa.show-sql=true                                    (Si no desea ver codigo sql en consola poner en false)
    spring.datasource.url=jdbc:postgresql://{HOST}/{DB}         (ejemplo: jdbc:postgresql://localhost/abm)
    spring.datasource.username=USER                             (ejemplo: postgres)
    spring.datasource.password=PASSWORD                         (ejemplo: 1234)
    spring.datasource.driver-class-name=org.postgresql.Driver

    spring.jpa.hibernate.ddl-auto=update
    ```
  - Para iniciarlo debemos dar click derecho sobre la carpeta madre del proyecto y clickear en la opción ``'Run as' -> 'Springboot App':``
  ![image](https://user-images.githubusercontent.com/66677808/141323943-3d1d2c46-7e81-430f-bea1-e5622f9310ce.png)
  
  - Si todo salió bien debemos dirigirnos a la direccion [http://localhost:8080/list](http://localhost:8080/list)
