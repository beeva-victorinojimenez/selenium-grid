### Registrar maquina windows con nodo IE en el hub
##### 1. Descargar el server (IEDriverServer) y el jar del server standalone actualmente en la version 3.141.59. https://www.seleniumhq.org/download/
##### 2. Ejecutar el jar indicandole la ruta del driver, puerto, url del hub y los browser params (con el numero maximo de instancias), por ejemplo: 
```
java -jar selenium-server-standalone-2.48.2.jar \
	-Dwebdriver.ie.driver=C:/eclipse/IEDriverServer/IEDriverServer.exe \ 
	-port 5555 \
	-role node \
	-hub http://localhost:4444/grid/register \ 
	-browser "browserName=internet explorer,version=11,platform=WINDOWS,maxInstances=10" \
```