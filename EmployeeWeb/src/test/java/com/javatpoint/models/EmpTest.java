package com.javatpoint.models;

import com.javatpoint.models.Emp;
import com.javatpoint.models.JdbcModel;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.extensions.TestSetup;

public class EmpTest extends TestCase {
// Ceci evite de creer l'instance dans chaque methode de tests et simplifie donc l ecriture des cas de tests.

   private Emp emp;

   public EmpTest() {
            // super(emp_no, first_name, last_name, gender, birth_date, hire_date);
	    super();
   }

   public void setUp() throws Exception {
             super.setUp();
             emp= new Emp(1,"prenom1","nom1","female","9.7.1989","11.4.2019");
  }

   public void tearDown() throws Exception {
	    super.tearDown();
            emp = null;
   } 

   public void testEmp() {
            assertNotNull("L instance n'est pas creee", emp);
   }

   public void testGetFirstName() {
            assertEquals("Le prenom est incorrect", "prenom1", emp.getFirstName());
   }

   public void testSetFirstName() {
           emp.setFirstName("prenom2");
           assertEquals("Le prenom est incorrect", "prenom2", emp.getFirstName());
   }

   public void testGetLastName() {
           assertEquals("Le nom est incorrect", "nom1", emp.getLastName());
   }

   public void testSetLastName() {
           emp.setLastName("nom2");
           assertEquals("Le nom est incorrect", "nom2", emp.getLastName());
   }

   public void testGetGender() {
           assertEquals("Le genre est incorrect", "female", emp.getGender());
   }

   public void testSetGender() {
          emp.setGender("female-ado");
          assertEquals("Le nom genre incorrect", "female-ado", emp.getGender());
   }

    public void testGetBirthDate() {
          assertEquals("La date de naissance est incorrecte", "9.7.1989", emp.getBirthDate());
   }

   public void testSetBirthDate() {
          emp.setBirthDate("9.7.1989");
          assertEquals("La date de naissance est incorrecte", "9.7.1989", emp.getBirthDate());
   }

    public void testGetHireDate() {
          assertEquals("La date d embauche est incorrecte", "11.4.2019", emp.getHireDate());
   }

   public void testSetHireDate() {
          emp.setHireDate("1.5.2019");
          assertEquals("La date d embauche est incorrecte", "1.5.2019", emp.getHireDate());
   }
   
   public static Test suite() {
	  // pattern decorateur Pour des besoins particuliers, il peut etre necessaire d executer du code une seule fois avant l execution des cas de tests et/ou d executer du code une fois tous les cas de tests executes.
    TestSetup setup = new TestSetup(new TestSuite(EmpTest.class)) {
           protected void setUp() throws Exception {
		   // code execute une seule fois avant l execution des cas de tests
		  System.out.println("Appel de la methode setUp() de la classe de tests");
	   }

           protected void tearDown() throws Exception {
        // code execute une seule fois apres l execution des cas de tests
                  System.out.println("Appel de la methode tearDown() de la classe de tests");
           }   
    };
    return setup;
  }
  
  public static void main(String[] args) {
      junit.textui.TestRunner.run(suite());
  }

}

