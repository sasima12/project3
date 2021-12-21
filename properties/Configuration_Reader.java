package properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader()throws Throwable{

	File f=new File("C:\\Users\\NEW\\eclipse-workspace\\Maven.Archetype.Quickstart\\src\\main\\java\\properties\\Configuration.properties");
	FileInputStream fis=new FileInputStream(f);
	 p = new Properties();
	 p.load(fis);	
}
	
	public String getUrl() {
		String get = p.getProperty("get");
		return get ;
		
	}

	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}

	public String getpassword() {
		String password = p.getProperty("password");
		return password;
	}

	
}

