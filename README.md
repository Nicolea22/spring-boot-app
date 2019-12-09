# sprint-boot-app
API REST
hecha con Spring Boot y H2.

Para ejecutar la aplicación:
# Windows y Linux

- Ingresar al directorio root desde terminal.
- Ejecutar 'mvn clean package'.
- Luego, 'mvn spring-boot:run'.

# Cargar datos iniciales en Base de Datos

Ejemplo de formato JSON para cargar a base de datos.

![alt text](https://66.media.tumblr.com/e286134e53217fd51331e9306bbc668b/ddaf45a7655ee3e0-10/s500x750/2ab7e7f9a6efe24180ca4f593d405661438c9275.png)

Enviar body por método POST a la ruta "/admin/load" para cargar datos inicialmente.
