import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

import resources.Base;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class JDBCConnection<WebDriver> extends Base{
	
	@Test

	public void getInfo () throws IOException, SQLException
	{
		
		System.out.println("hello1");
		System.out.println("hello4");
		

	}
	public void getInfo2 ()
	{
		System.out.println("hello2");
		System.out.println("hello3");
	}

}
