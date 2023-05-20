SELECT * FROM hibernatedatabase.product;

ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';
FLUSH PRIVILEGES;
SELECT user,authentication_string,plugin,host FROM mysql.user;
select  * from mysql.user