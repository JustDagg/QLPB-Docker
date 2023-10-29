# QLPB-Docker
Back-end(Springboot) - Database(MySQL) - Front-end(Html, Css, JS) - Docker Back-end

#Docker
MYSQL (springmysqlqlpbdocker)
tk: root
mk: root

- cmd:
	docker images
	docker run -p 3308:3306 --name mysqlqlpb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=qlpb mysql:8.0.29
	docker network 
	docker network create springqlpb-network

- cmd: (file chạy project)
	docker images
	docker build -t quan-ly-phong-ban-spring-mysql (đã config trong file DockerFile của Backend File) .
	docker ps 
	docker network connect springqlpb-network mysqlqlpb
	docker network inspect springqlpb-network 
   chạy :	docker run -p 9090:8080 --name quan-ly-phong-ban-spring-mysql --net springqlpb-network -e MYSQL_HOST=mysqlqlpb -e MYSQL_USER=root -e MYSQL_PASSWORD=root -e MYSQL_PORT=3306 quan-ly-phong-ban-spring-mysql

#TECHNOLOGIES USED:
- Database: MySQL.
- Back-end (Springboot Framework): Java, Spring Security (Basic Authentication), Spring Data JPA, Spring Specification.
- FrontEnd: Html, Css, Js, Ajax Jquery.
- Deploy: Docker (Back-end)

#DESCRIPTION: 
- Xây dựng web cho phép:
	+ Vai trò User(người dùng): có thể đăng ký/ đăng nhập/đăng xuất, xem trang của công ty Holacoco.
	+ Vai trò Admin: có thể xem trang phòng ban (departments), quản lý bằng các quyền thêm, đọc, sửa và xóa, xóa tất cả, tìm kiếm, dùng bộ lọc, sắp xếp.
	+ Vai trò Manager: có thể xem trang phòng ban (departments), quản lý bằng các quyền thêm, đọc, sửa và xóa, xóa tất cả, tìm kiếm, dùng bộ lọc, sắp xếp.
 		           có thể xem trang tài khoản (accounts), quản lý bằng các quyền thêm, đọc, xóa, tìm kiếm.

