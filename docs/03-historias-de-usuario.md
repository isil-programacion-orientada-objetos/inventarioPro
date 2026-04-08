# Historias de usuario

## Convención
Formato:  
**Como** [tipo de usuario], **quiero** [necesidad], **para** [beneficio].

---

## HU-01 Registrar producto
**Como** administrador del sistema,  
**quiero** registrar un nuevo producto con código, nombre, categoría, precio y stock,  
**para** mantener actualizado el inventario.

**Criterios de aceptación**
- El sistema solicita los datos básicos del producto.
- El código del producto no debe repetirse.
- El producto queda disponible en el listado general.

---

## HU-02 Consultar productos
**Como** usuario del sistema,  
**quiero** visualizar el listado de productos registrados,  
**para** conocer qué artículos están disponibles.

**Criterios de aceptación**
- El sistema muestra una tabla de productos.
- Se visualiza código, nombre, precio, stock y estado.
- La información se muestra de forma ordenada.

---

## HU-03 Buscar producto
**Como** vendedor,  
**quiero** buscar un producto por código o nombre,  
**para** encontrarlo rápidamente durante una venta.

**Criterios de aceptación**
- La búsqueda puede hacerse por código o nombre.
- El sistema muestra coincidencias válidas.
- Si no existe el producto, el sistema informa el resultado.

---

## HU-04 Actualizar producto
**Como** administrador,  
**quiero** editar los datos de un producto,  
**para** corregir información o actualizar precios y stock.

**Criterios de aceptación**
- El sistema permite modificar campos del producto.
- Los cambios quedan guardados.
- El listado refleja la información actualizada.

---

## HU-05 Registrar cliente
**Como** usuario del sistema,  
**quiero** registrar clientes con sus datos básicos,  
**para** asociarlos a futuras ventas.

**Criterios de aceptación**
- El sistema solicita documento, nombres, teléfono y correo.
- No debe duplicarse el documento del cliente.
- El cliente queda disponible para seleccionarlo en ventas.

---

## HU-06 Consultar clientes
**Como** vendedor,  
**quiero** listar los clientes registrados,  
**para** identificar rápidamente a quién se realizará una venta.

**Criterios de aceptación**
- El sistema muestra todos los clientes registrados.
- La información principal del cliente es visible.
- Se pueden revisar registros sin modificar datos.

---

## HU-07 Registrar venta
**Como** vendedor,  
**quiero** registrar una venta asociando un cliente y uno o varios productos,  
**para** formalizar la operación comercial.

**Criterios de aceptación**
- Se puede seleccionar cliente.
- Se pueden agregar varios productos a la venta.
- El sistema calcula subtotal y total.
- La venta queda registrada correctamente.

---

## HU-08 Validar stock
**Como** vendedor,  
**quiero** que el sistema valide el stock antes de confirmar la venta,  
**para** evitar vender productos no disponibles.

**Criterios de aceptación**
- Si el stock es suficiente, la venta puede continuar.
- Si el stock es insuficiente, el sistema muestra un mensaje.
- No se registra la venta cuando el stock es insuficiente.

---

## HU-09 Calcular totales
**Como** vendedor,  
**quiero** que el sistema calcule automáticamente montos de la venta,  
**para** evitar errores manuales.

**Criterios de aceptación**
- El sistema calcula subtotal.
- El sistema puede aplicar descuentos si corresponde.
- El total final se muestra antes de confirmar la venta.

---

## HU-10 Generar resumen de venta
**Como** vendedor,  
**quiero** visualizar un resumen de la venta realizada,  
**para** confirmar la operación registrada.

**Criterios de aceptación**
- El resumen muestra cliente, productos, cantidades y total.
- Se puede consultar después de registrar la venta.
- La información coincide con los datos guardados.

---

## HU-11 Consultar productos con bajo stock
**Como** administrador,  
**quiero** identificar productos con stock bajo,  
**para** tomar decisiones de reposición.

**Criterios de aceptación**
- El sistema lista productos con stock menor al mínimo definido.
- La información está disponible en una consulta o reporte.
- Los productos de bajo stock se pueden distinguir visualmente.

---

## HU-12 Persistir datos
**Como** administrador del sistema,  
**quiero** guardar productos, clientes y ventas en base de datos,  
**para** no perder la información al cerrar la aplicación.

**Criterios de aceptación**
- Los datos se almacenan en la base de datos.
- La información puede recuperarse posteriormente.
- Los módulos principales usan persistencia funcional.

---

## HU-13 Acceder al sistema por interfaz web
**Como** usuario del sistema,  
**quiero** interactuar con una interfaz web básica,  
**para** gestionar la información de forma más amigable.

**Criterios de aceptación**
- El sistema cuenta con páginas JSP básicas.
- El usuario puede navegar entre módulos.
- La interfaz muestra formularios y tablas funcionales.

---

## HU-14 Aplicar diseño orientado a objetos
**Como** docente evaluador,  
**quiero** que el sistema evidencie herencia, encapsulamiento y polimorfismo,  
**para** validar el aprendizaje del curso.

**Criterios de aceptación**
- Existen clases con jerarquía definida.
- Los atributos sensibles están encapsulados.
- Se observan métodos sobrecargados o sobrescritos.
- El diseño orientado a objetos es coherente con el dominio.
