##### 1 Levantar selenium grid con una instancia de chrome
##### 2 configurar la ip del hub como variable de entorno
```
export HOST_HUB=172.27.0.2
```
En caso de ejecutarlo desde el id intriducirla en las variables de ejecución
##### 3 Lanzar la prueba con un unico navegador
```
mvn compile
mvn exec:java -Dexec.mainClass="com.bbva.selenium.Main" -Dexec.cleanupDaemonThreads=false
```
Obtener el tiempo total d la prueba

##### 4 Escalamos el numero de chromes a 2 y lanzamos la prueba de nuevo
Observamos que el lanzamiento no es secuencial y que se obtienen los 3 drivers en paralelo y comienzan las ejecuciones a la vez.


