 #### a. Como encargado de mantenimiento quiero poder generar un reporte de uso de monopatines por kilómetros para establecer si un monopatín requiere de mantenimiento. Este reporte debe poder configurarse para incluir (o no) los tiempos de pausa.

#### b. Como administrador quiero poder anular cuentas para inhabilitar el uso momentáneo de la misma.

#### c. Como administrador quiero consultar los monopatines con más de X viajes en un cierto año.

#### d. Como administrador quiero consultar el total facturado en un rango de meses de cierto año.

#### e. Como administrador quiero consultar la cantidad de monopatines actualmente en operación, versus la cantidad de monopatines actualmente en mantenimiento.

#### f. Como administrador quiero hacer un ajuste de precios, y que a partir de cierta fecha el sistema habilite los nuevos precios.

#### g. Como usuario quiero un listado de los monopatines cercanos a mi zona, para poder encontrar un monopatín cerca de mi ubicación

## Endpoints para testeo

Ejecutar en la terminal parado en la carpeta raiz del proyecto:  
docker compose up -d

3.a *Metodo GET*:  
http://localhost:8085/mantenimiento/reporte/monopatines?pausa=true  
http://localhost:8085/mantenimiento/reporte/monopatines?pausa=false

3.b *Metodo PUT*:  
http://localhost:8085/administracion/cuenta/anular/2  
http://localhost:8085/administracion/cuenta/anular/1  
Para chequear que se hizo correctamente:  
http://localhost:8081/cuentas *(GET)*

3.c *Metodo GET*:  
http://localhost:8080/administracion/monopatines/viajes?cant=1&anio=2023  
http://localhost:8080/administracion/monopatines/viajes?cant=2&anio=2023  

3.d *Metodo GET*:  
http://localhost:8080/administracion/viajes?mes1=1&mes2=12&anio=2023  
Para chequear que se hizo correctamente: (GET)  Debe dar $150  
http://localhost:8080/administracion/viajes?mes3=1&mes5=12&anio=2023  

3.e *Metodo GET*:  
http://localhost:8080/administracion/monopatines/reporte/en-operacion  

3.f *Metodo POST*:  
Nueva tarifa:  
http://localhost:8080/administracion/tarifa  
{
"tarifa": 10,
"porc_recargo": 0.3,
"fecha_creacion": "2024-02-12T10:00:00Z",
"fecha_caducacion": "2024-03-12T10:00:00Z"
}  
Para chequear que se hizo correctamente: (GET)  
http://localhost:8082/tarifas/ultima  

3.g *Metodo GET*:  
http://localhost:8081/usuarios/monopatinesCercanos/latitud/37/longitud/284.55  
Cambiar numeros de latitud y longitud.  

Puertos de cada servicio  
8080 - administrador  
8081 - usuarios  
8082 - monopatin  
8083 - paradas  
8085 - mantenimiento  


  ## Autores:
#### Menchon, Agustin - amenchon@alumnos.exa.unicen.edu.ar
