import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class ConexaoBanco {
	private Connection connection=null;
	private Statement statement=null;
	private ResultSet resultset=null;
	
//	public String conectar_()
//	{  String servidor="jdbc:mysql://localhost:3306/db_pedido";
//	   String usuario="root";
//	   String senha="";
//	   String driver="com.mysql.cj.jdbc.Driver";
//	   try
//	   { Class.forName(driver)   ;
//		 this.connection=DriverManager.getConnection(servidor,usuario,senha);
//		 this.statement=this.connection.createStatement();	 
//		 return "Banco conectado";
//	   }
//	   catch(Exception e)
//	   { connection=null;  
//	      return "Não foi Possível Realizar Conexão. "+e.getMessage();
//	   }
//	}
	
	
	
	
	
	
	
	
	public Connection conectar()
	{  String servidor="jdbc:mysql://localhost:3306/db_pedido";
	   String usuario="root";
	   String senha="";
	   String driver="com.mysql.cj.jdbc.Driver";
	   try
	   { Class.forName(driver)   ;
		 this.connection=DriverManager.getConnection(servidor,usuario,senha);
		 this.statement=this.connection.createStatement();	 
		 return connection;
	   }
	   catch(Exception e)
	   { connection=null;   }
	   return connection;
	}

}
