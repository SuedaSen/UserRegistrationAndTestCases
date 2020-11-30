import static org.junit.Assume.assumeNoException;
import static org.junit.jupiter.api.Assertions.*;

import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class UserMainTest {
    
	Scanner scanner=new Scanner(System.in);
	 ProfileInformation profil= new ProfileInformation();
	
    @DisplayName("Test Case Of User Name For Checking Greater Than 10 Characters")
	@Test
	void testUserNameGreaterThan10Characters() {
		  System.out.println("Name Part For Greater Than 10 Characters");
		  String username=scanner.nextLine();
		  profil.setUserName(username);
	      profil.getUserName();
	      int length=0;     
	  	  assertTrue(profil.getUserName().length()>10);
	  	   }
		
    @DisplayName("Test Case Of User Name For Checking Less Than 10 Characters")
	@Test
	void testUserNameValid() {
		 System.out.println("Name Part For Less Than 10 Characters");
		 String username=scanner.nextLine();
		 profil.setUserName(username);
	      int length=0;
	    	  assertTrue(profil.getUserName().length()<10);
	      }
		
    @DisplayName("Test Case Of User Password For Checking Is Greater Than 10")
	@Test
	void testPasswordGreaterThan10() {
		System.out.print("Enter password : ");
	    String password = scanner.nextLine();
		profil.setUserPassword(password);
		assertTrue(profil.getUserPassword().length()>10);
	}
    
    @DisplayName("Test Case Of User Password Is Less Than 5")
	@Test
	void testPasswordLessThan5() {
		System.out.print("Enter Password For Checking Less Than 5 : ");
	    String password = scanner.nextLine();
		profil.setUserPassword(password);
		assertTrue(profil.getUserPassword().length()<5);	
	}
    
    @DisplayName("Test Case Of User Password Is Valid")
	@Test
	void testPasswordValid() {
		System.out.print("Enter Password For Checking Between 5 And 10: ");
	    String password = scanner.nextLine();
		profil.setUserPassword(password);
		assertTrue(profil.getUserPassword().length()>5 || profil.getUserPassword().length()<10);
		}
    
    @DisplayName("Test Case Of File Format Is Jpeg Or Jpg")
	@Test
	void testFileFormatIsJpegOrJpg() {
		System.out.print("Enter Image Format Is Valid");
		String userImageFormat=scanner.nextLine();
		profil.setUserImageFormat(userImageFormat);
		assertTrue(profil.getUserImageFormat().toString().equalsIgnoreCase("Jpeg") || profil.getUserImageFormat().toString().equalsIgnoreCase("Jpg"));// I ignored the case sensivity

	}
    
    @DisplayName("Test Case Of Size Is Valid (Less Than 20) ")
	@Test
	void testSizeValid() {
		System.out.print("Enter size to check valid : ");
		int filesize = scanner.nextInt();
		profil.setFileSize(filesize);
		assertTrue(profil.getFileSize()<20);
	}
    
    @DisplayName("Test Case Of Size For Checking Is Greater Than 20 KB")
	@Test
	void testSizeGreaterThan20Kb() {
		System.out.print("Enter size to check not to valid: ");
		int filesize = scanner.nextInt();
		profil.setFileSize(filesize);
		assertTrue(profil.getFileSize()>=20);
		}
    
    @DisplayName("Test Case Of Height And Width Multiply Result Greater Than 250000 (500X500) For Resolution")
	@Test
	void testHeightAndWidthMultiplyResultGreaterThan250000ForResolution() {
		System.out.println("Enter width again please in order to calculating resolution");
		 int width=scanner.nextInt();
		System.out.println("Enter height again please in order to calculating resolution");
		 int height=scanner.nextInt();
		 profil.setHeight(height);
		 profil.setWidth(width);
		 profil.calculateResolution();
	     assertTrue(profil.calculateResolution()>250000);

	}
    
    @DisplayName("Test Case Of Height And Width Multiply Result Less Than Or Equal To 250000 (500X500) For Resolution")
	@Test
	
	void testResolutionValid() {
		System.out.println("Enter width please in order to calculating resolution numeric calculation");
		 int width=scanner.nextInt();
		System.out.println("Enter height please in order to calculating resolution numeric calculation");
		 int height=scanner.nextInt();
		 profil.setHeight(height);
		 profil.setWidth(width);
		 profil.calculateResolution();
	     assertTrue(profil.calculateResolution()<=250000);
	}
    @DisplayName("Test Case Of Resolution For Not Calculation, String Form (500X500)")
	@Test
	void testResolutionStringType() {
    	 System.out.println("Enter photo resolution (exp:500x500)");
    	    String resolution = scanner.nextLine().toUpperCase();
    	    profil.setResolution(resolution);
    	    String res[] = profil.getResolution().split("X");
    	    if(Double.parseDouble(res[0])<=500 && Double.parseDouble(res[1])<=500)
	     assertTrue(Double.parseDouble(res[0])<=500 && Double.parseDouble(res[1])<=500);
	}
   
	
}
