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
		
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
		Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Qadbt", "root", "Welcome@123");
		Statement s=(Statement)con.createStatement();
		ResultSet rs=s.executeQuery("select * from EmployeeInfo where name='Lina';");
		while(rs.next())
		{
		    driver = initializeDriver();
		    driver.get(prop.getProperty("url2"));
		    SalesforceLoginPage sp=new SalesforceLoginPage(driver);
		    sp.getUserName().sendKeys(rs.getString("name"));
		    sp.getPwd().sendKeys(rs.getString("location"));
		    sp.getLogin().click();
			System.out.println(rs.getString("age"));
			System.out.println(rs.getString("id"));
		}
		

	}

}
