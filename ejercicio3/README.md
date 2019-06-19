##### 1. Launch Grid navidators
```
docker-compose up
```
##### 2 configurar la ip del hub como variable de entorno
```
export HOST_HUB=172.27.0.2
```
En caso de ejecutarlo desde el id intriducirla en las variables de ejecución

##### 3. Change feature ip by local ip
##### 4. Complete the driver Setup and SeleniumGridPage
##### 5. Launch the test with different navigators
```
mvn clean test -Dbrowser=chrome
mvn clean test -Dbrowser=firefox
```
##### 6. See complete report in home-page-html

##### 7. Launch with different resolutions
```
mvn clean test -Dbrowser=chrome -Dwidth=1024 -Dheight=800
```
