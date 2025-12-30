# 📘 Conversor de Monedas — Java + ExchangeRate API

Un conversor de monedas desarrollado en **Java 17**, utilizando:

- `HttpClient` para consumir la API ExchangeRate
- `Gson` para parsear JSON (importado manualmente mediante archivo `.jar`)
- Manejo robusto de errores de la API
- Menú interactivo por consola

Este proyecto es ideal para practicar consumo de APIs, manejo de JSON, validación de datos y buenas prácticas de arquitectura en Java.

---

## 🚀 Características

- Conversión entre múltiples monedas (USD, ARS, BRL, COP, etc.)
- Manejo de errores de la API:
  - `unsupported-code`
  - `malformed-request`
  - `invalid-key`
- Menú interactivo con opciones claras

---

## 🧱 Tecnologías utilizadas

| Tecnología | Uso |
|-----------|-----|
| **Java 17+** | Lógica principal |
| **HttpClient** | Consumo de API REST |
| **Gson (.jar manual)** | Conversión JSON → Java |
| **ExchangeRate API** | Fuente de datos |

---

## 📦 Instalación

1. Clona el repositorio:

```bash
git clone https://github.com/tuusuario/conversor-monedas.git
