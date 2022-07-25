package com.TESTNG.Practice;

import org.testng.annotations.Test;

public class ToImportInformatationTest {
@Test	
public void importa(){
	String url = System.getProperty("URL");
	String browser = System.getProperty("BROWSER");
	String username = System.getProperty("USERNAME");
	String password = System.getProperty("PASSWORD");
	System.out.println("TYSS");
	System.out.println("URL "+url);
	System.out.println("BROWSER "+browser);
	System.out.println("USERNAME "+username);
	System.out.println("PASSWORD "+password);
	System.out.println("hello");
	//hello
	//call
	System.out.println("hi  there hey there");
	System.out.println("THE DATA IS IMPORTED");
	

}
}
