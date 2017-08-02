# Scala-MySQL

Details on table products (database southwind):

```
root@tron:~/scalala# mysql -u root -e "use southwind; describe products" -p
Enter password: 
+-------------+------------------+------+-----+----------+----------------+
| Field       | Type             | Null | Key | Default  | Extra          |
+-------------+------------------+------+-----+----------+----------------+
| productID   | int(10) unsigned | NO   | PRI | NULL     | auto_increment |
| productCode | char(3)          | NO   |     |          |                |
| name        | varchar(30)      | NO   |     |          |                |
| quantity    | int(10) unsigned | NO   |     | 0        |                |
| price       | decimal(7,2)     | NO   |     | 99999.99 |                |
+-------------+------------------+------+-----+----------+----------------+
root@tron:~/scalala# 
``` 

 Run program - either sbt -> reload -> compile -> run

Or... 
```
root@tron:~/scalala# sbt run
[info] Loading project definition from /root/scalala/project
[info] Set current project to scalala (in build file:/root/scalala/)
[info] Compiling 1 Scala source to /root/scalala/target/scala-2.10/classes...
[info] Running ScalaJdbcConnectSelect 
PEN Blue Pen 23 3.23
Insert has been done
[success] Total time: 3 s, completed Aug 2, 2017 2:48:14 PM
root@tron:~/scalala# 
```

More details on sbt & some "basicness" on Spark/Scala implementations - check attached tutorial.
