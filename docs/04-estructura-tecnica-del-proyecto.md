# Estructura técnica del proyecto

## 1. Arquitectura sugerida
Para fines académicos, se propone una estructura por capas simple:

- **model:** representa las entidades del negocio.
- **dao:** acceso a datos.
- **service:** lógica del negocio.
- **controller:** controladores o servlets.
- **webapp:** vistas JSP y recursos estáticos.
- **util:** clases de apoyo.

## 2. Entidades principales
### Producto
Representa un artículo del inventario.  
Campos sugeridos:
- id
- codigo
- nombre
- categoria
- precio
- stock
- estado

### Cliente
Representa a la persona asociada a una venta.  
Campos sugeridos:
- id
- documento
- nombres
- apellidos
- telefono
- correo
- estado

### Venta
Representa una operación de venta.  
Campos sugeridos:
- id
- numeroVenta
- fecha
- subtotal
- total
- cliente

### DetalleVenta
Representa cada producto incluido en una venta.  
Campos sugeridos:
- id
- cantidad
- precioUnitario
- subtotal
- producto

### Usuario
Representa al operador del sistema.  
Campos sugeridos:
- id
- username
- password
- rol

## 3. Posible aplicación de herencia
```text
Persona
├── Cliente
└── Usuario
```

## 4. Posible aplicación de encapsulamiento
Todos los atributos sensibles deben declararse como `private` y exponerse mediante getters y setters.

## 5. Posible aplicación de polimorfismo
Se puede usar polimorfismo para:
- mostrar información distinta según el tipo de usuario
- calcular promociones según reglas diferentes
- sobrescribir métodos de presentación o validación

## 6. Colecciones sugeridas
- `ArrayList<Producto>` para listado de productos
- `ArrayList<Cliente>` para clientes
- `ArrayList<Venta>` para ventas
- `HashSet<String>` para validación de códigos únicos
- `Collections.sort()` para ordenamientos

## 7. Clases utilitarias sugeridas
### CalculadoraVentas
Responsable de:
- calcular subtotal
- calcular total
- aplicar descuentos
- redondear montos

### ValidadorTexto
Responsable de:
- validar cadenas vacías
- limpiar espacios
- comparar textos
- validar longitud o formato básico

### GeneradorCodigo
Responsable de:
- generar códigos de producto
- generar números de venta

## 8. Estructura SQL sugerida
### Tabla producto
- id
- codigo
- nombre
- categoria
- precio
- stock
- estado

### Tabla cliente
- id
- documento
- nombres
- apellidos
- telefono
- correo
- estado

### Tabla venta
- id
- numero_venta
- fecha
- subtotal
- total
- cliente_id

### Tabla detalle_venta
- id
- venta_id
- producto_id
- cantidad
- precio_unitario
- subtotal

## 9. Flujo funcional básico
1. Registrar productos y clientes.
2. Consultar datos disponibles.
3. Iniciar una venta.
4. Seleccionar cliente.
5. Agregar productos.
6. Validar stock.
7. Calcular total.
8. Registrar venta.
9. Guardar información en base de datos.
10. Consultar reportes básicos.

## 10. Entregable recomendado
El proyecto final debe incluir:
- código fuente organizado
- vistas JSP funcionales
- clases del dominio
- uso de colecciones
- evidencia de herencia y polimorfismo
- conexión a base de datos
- documentación básica del sistema
