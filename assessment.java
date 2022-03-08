package demopackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
iimport java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONObject;
import org.json.simple.parser.parserException;

public class readjson {
	public static void main(String[]args) throws FileNotFoundException, IOException, parseException {
		JSONParser jsonparse= new JSONParser();
		JSONObject jsonobject = (JSONObject) jsonparse.parse(new FileReader("json\\read.json));
		String id = (String) jsonobject.get("EmployeeID");
		String Employee name = (String) jsonobject.get("Employee name");
		String experience = (String) jsonobject.get("experience");
		String Designation	= (String) jsonobject.get("Designation");
		String salary = (String) jsonobject.get("salary");
		
		System.out.println(id);
		System.out.println(Employee);
		System.out.println(experience);
		System.out.println(Designation);
		System.out.println(salary);
	}
}

		
		
		
		