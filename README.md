<small>⚠️ El ReadMe fue realizado completamente por la IA</small>

<img src="https://c.tenor.com/QeyFuBQrWyYAAAAd/tenor.gif" width="100" alt="Logo">

---

# ActividadesAbstracfaces

Proyecto Java que implementa dos jerarquías de clases para practicar interfaces, clases abstractas.

---

## Actividad 1 — Figuras Geométricas

Programa que calcula el área y el perímetro de figuras geométricas. El usuario introduce los datos por consola y se muestran los resultados.

### `CalculoGeometrico`
Interfaz que define el contrato común para todas las figuras. Declara los métodos `calcularArea()` y `calcularPerimetro()`, ambos devuelven un `double`.

### `Rectangulo`
Implementa `CalculoGeometrico`. Representa un rectángulo a partir de su altura y ancho.

| Atributo | Tipo | Descripción |
|---|---|---|
| `altura` | `double` | Altura del rectángulo |
| `ancho` | `double` | Ancho del rectángulo |

### `Circulo`
Implementa `CalculoGeometrico`. Representa un círculo a partir de su radio.

| Atributo | Tipo | Descripción |
|---|---|---|
| `radio` | `double` | Radio del círculo |

---

## Actividad 2 — Coche de Combustión

Simulación del comportamiento de un coche: arrancar, moverse y gestionar el combustible. Muestra mensajes por consola según el estado del motor y el combustible disponible.

### `Vehiculo`
Clase abstracta que representa un vehículo genérico. Define los atributos comunes y declara como abstractos los métodos `arrancar()`, `pararMotor()` y `mover()`.

| Atributo | Tipo | Descripción |
|---|---|---|
| `color` | `String` | Color del vehículo |
| `modelo` | `String` | Modelo del vehículo |
| `matricula` | `String` | Matrícula del vehículo |
| `numeroPuertas` | `int` | Número de puertas |
| `numeroRuedas` | `int` | Número de ruedas |

### `CocheCombustion`
Extiende `Vehiculo`. Implementa la lógica de arranque, parada y movimiento teniendo en cuenta el estado del motor y los litros de combustible disponibles.

| Atributo | Tipo | Descripción |
|---|---|---|
| `motorCombustion` | `String` | Estado del motor (`"encendido"` / `"apagado"`) |
| `litrosCombustible` | `int` | Litros de combustible disponibles |
