# bathymetry-service

* mvn package spring-boot:run
* docker build --tag bathymetry-service:0.1 .
* docker run  --name deploy-bathymetry-service -p 8083:8080 bathymetry-service:0.1
* docker stop ocean-data-retrieval