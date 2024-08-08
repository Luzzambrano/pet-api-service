# Proyecto Punto929

## Descripción

El proyecto punto929.mx tiene como objetivo desarrollar un sistema de gestión de inventarios para productos con fechas de vencimiento. 
El sistema permitirá registrar productos, sus fechas de vencimiento y cantidades, generando alertas y reportes de productos próximos a vencer y con bajas cantidades de stock.

## Problema Identificado

La empresa enfrenta dificultades en la gestión manual de inventarios, lo que resulta en pérdidas de productos caducados y desabastecimiento de productos esenciales.

## Solución

Implementar un sistema automatizado que permita:
- Registro y actualización de productos.
- Registro de fechas de vencimiento y cantidades.
- Generación de alertas para productos próximos a vencer.
- Generación de reportes para productos con bajas cantidades de stock.

## Arquitectura
El sistema se basa en una arquitectura cliente-servidor con los siguientes componentes:
- **Frontend:** Interfaz de usuario desarrollada en React.
- **Backend:** API RESTful desarrollada en Node.js.
- **Base de Datos:** MySQL para el almacenamiento de datos.
- **Notificaciones:** Integración con servicios de correo electrónico y SMS para enviar alertas.

## Arquitectura
El sistema se basa en una arquitectura cliente-servidor con los siguientes componentes:
- **Frontend:** Interfaz de usuario desarrollada en React.
- **Backend:** API RESTful desarrollada en Node.js.
- **Base de Datos:** MySQL para el almacenamiento de datos.
- **Notificaciones:** Integración con servicios de correo electrónico y SMS para enviar alertas.

## Requerimientos

### Servidores
- Servidor de Aplicación: Node.js
- Servidor Web: Nginx
- Base de Datos: MySQL

### Paquetes Adicionales
- Express
- Sequelize
- React
- Axios

### Versión de Node.js
- Node.js v14.x

## Instalación

### Ambiente de Desarrollo
1. Clona el repositorio:
    ```sh
    git clone https://github.com/tu_usuario/punto929-product-management.git
    ```
2. Entra en el directorio del proyecto:
    ```sh
    cd punto929-product-management
    ```
3. Instala las dependencias:
    ```sh
    npm install
    ```

### Ambiente de Desarrollo
1. Clona el repositorio:
    ```sh
    git clone https://github.com/Luzzambrano/pet-client-app
    ```
2. Entra en el directorio del proyecto:
    ```sh
    cd punto929-product-management
    ```
3. Instala las dependencias:
    ```sh
    npm install
    ```

### Ejecutar Pruebas Manualmente
1. Corre las pruebas:
    ```sh
    npm test
    ```

### Implementación en Producción
1. Configura tu servidor para apuntar al directorio del proyecto.
2. Implementa el proyecto en un ambiente local o en la nube como Heroku.
3. Configura el despliegue continuo utilizando Travis CI.

## Configuración

### Archivos de Configuración
- `config/database.js`: Configuración de la base de datos.
- `config/server.js`: Configuración del servidor.

### Configuración de Requerimientos
1. Configura las variables de entorno necesarias:
    ```sh
    export DB_HOST=localhost
    export DB_USER=root
    export DB_PASS=password
    export DB_NAME=punto929
    ```

## Uso

### Manual del Usuario Final
- [Manual del Usuario Final](docs/ManualUsuarioFinal.md)

### Manual del Administrador
- [Manual del Administrador](docs/ManualAdministrador.md)

## Contribución

1. Clona el repositorio:
    ```sh
    git clone https://github.com/tu_usuario/punto929-product-management.git
    ```
2. Crea una nueva rama:
    ```sh
    git checkout -b feature/nueva-funcionalidad
    ```
3. Haz tus cambios y commitea:
    ```sh
    git commit -m "Descripción de los cambios"
    ```
4. Sube tu rama al repositorio remoto:
    ```sh
    git push origin feature/nueva-funcionalidad
    ```
5. Abre un Pull Request en GitHub.

## Roadmap
### Próximos Requerimientos
- Integración con sistemas de pago.
- Mejora en el sistema de notificaciones.
- Implementación de análisis predictivo para gestión de inventarios.
