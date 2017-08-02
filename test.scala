import java.sql.DriverManager
import java.sql.Connection

object ScalaJdbcConnectSelect {

  def main(args: Array[String]) {
   
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost/southwind"  //southwind is the database..
    val username = "root"
    val password = "<yo passwd>"


    var connection:Connection = null

     Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)

   //insert some values in products.southwind
 val statement = connection.createStatement()
 val resultSet = statement.executeUpdate("INSERT INTO  products (productID, productCode, name, quantity, price) values('1010', 'PEN', 'Blue Pen', '23','3.23')")

//check insert
	val resultSet1 = statement.executeQuery("select productID,productCode, name, quantity, price from products where productID=1010")
 	while(resultSet1.next()){
		val productID=resultSet1.getString("productID")
		val productCode=resultSet1.getString("productCode")
		val name=resultSet1.getString("name")
		val quantity=resultSet1.getString("quantity")
		val price=resultSet1.getString("price")

		println( productCode + " " + name + " " + quantity + " " + price)
	}

//you could throw here some catching errors ...but whatevs!

    connection.close()
  }

}

//Sources:
//https://docs.oracle.com/cd/E13222_01/wls/docs45/classdocs/java.sql.Statement.html
//https://alvinalexander.com/scala/scala-jdbc-connection-mysql-sql-select-example
