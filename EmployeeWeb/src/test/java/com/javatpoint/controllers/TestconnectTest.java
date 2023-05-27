//import junit.framework.*;
import junit.extensions.TestSetup;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.javatpoint.models.Emp;
import com.javatpoint.models.JdbcModel;
import com.javatpoint.controllers.EmpController;

import com.javatpoint.models.EmpTest;
import com.javatpoint.models.JdbcModelTest;
import java.sql.*;

public class TestconnectTest extends TestCase{
//   public static final String SERVER="localhost", DB="eltechdb", LOGIN="root", PASSWORD="lpf6lmsql", VIEWS="/javatpoint";
   
  public void TestJdbcModel() throws Exception {
    // test bean "Emp"
    EmpTest emts = new EmpTest();
    emts.setUp();
    emts.testGetFirstName();

    // test database connectivity
    JdbcModelTest jdbcmdltest = new JdbcModelTest();
    jdbcmdltest.setUp();
    jdbcmdltest.testGetPort();

    // create a employee to insert
        Integer id=1;
	String empname="Arthur";
	String lastname="DeBoor";
	String gender="male";
	String birthdate="5th January 1993";
	String hiredate="1th February 2019";
	id++;
        Emp empex = new Emp(id,empname,lastname,gender,birthdate,hiredate);

    // connect

          jdbcmdltest.testConnect(); // a implementer dans JdbcModelTest
    // test database access
          jdbcmdltest.testJdbcModel();
          jdbcmdltest.testGetPort();
    // close
    emts.tearDown();
    jdbcmdltest.tearDown();
  }
}
