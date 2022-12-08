# Developer-Engineering

## POSTWORK 04: JAVA BEANS E INVERSION DE CONTROL
### Beans específicos de tu proyecto:
- EXPEDIENTE
- PACIENTE
- RECETA
- MEDICO
- SIGNOS_VITALES
- TRATAMIENTO
- INDICACIONES

#### Justificacion:
El proyecto consta en modelar un pequeño crud que represente un expediente medico personal, basado en los elementos que tiene una receta fueron las "entidades" que se identificaron.

### Notaciones:
Por el momento serian @Componente pero posteriormente se reemplazaría por @Entity para ser mas especifico y ademas de complementarlo con las respectivas notaciones de @Service, @Controller  y si en este momento es necesario @Repository.
### Casos donde se usaria la inyección de dependencias
- @Controller: Para que sean el punto de entrada para las acciones necesarias sobre las entidades identificadas.
- @Service: Para implementar las reglas de negocio necesarias.
- @Repository*: Para operar con la BD.
- @Entity: Para representar como objetos a las entidades identificadas.
