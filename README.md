# QLPB-Docker
Springboot - Mysql - FrontEnd(Html, Css, JS) - Docker BackEnd

Docker

MYSQL (springmysqlqlpbdocker)
tk: root
mk: root

cmd:
	docker images
	docker run -p 3308:3306 --name mysqlqlpb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=qlpb mysql:8.0.29
	docker network 
	docker network create springqlpb-network

cmd: (file chạy project)
	docker images
	docker build -t quan-ly-phong-ban-spring-mysql (đã config trong file DockerFile của Backend File) .
	docker ps 
	docker network connect springqlpb-network mysqlqlpb
	docker network inspect springqlpb-network 
   chạy :	docker run -p 9090:8080 --name quan-ly-phong-ban-spring-mysql --net springqlpb-network -e MYSQL_HOST=mysqlqlpb -e MYSQL_USER=root -e MYSQL_PASSWORD=root -e MYSQL_PORT=3306 quan-ly-phong-ban-spring-mysql
