import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJSONtest {
    public static void main(String[] args) {
        //JSON parser object to parse read file//Đối tượng trình phân tích cú pháp JSON để phân tích cú pháp đọc tệp
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader("employees.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);

            //liên kêt employee array

         employeeList.forEach(emp-> parseEmployeesObject((JSONObject) emp));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

    private static void parseEmployeesObject(JSONObject employee){
      //get employees object within list
        JSONObject employeeObject = (JSONObject) employee.get("employee");

        //get employees object first name
        String firstName = (String) employeeObject.get("firstName");
        System.out.println(firstName);

        //last name
        String LastName = (String) employeeObject.get("lastName");
        System.out.println(LastName);

        //website
        String website = (String) employeeObject.get("wesite");
        System.out.println(website);
    }
}




























