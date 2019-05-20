package Junit.test;

import org.junit.*;


public class JunitExamp {

	@Test
	
	public void a() {
		
		System.out.println("inside method 1");
		
	}
	
	@Test
	public void b()
	{
		System.out.println("welcome to method 2");
		
	}
	@Ignore
	@Test
	public void Kellwin()
	{
		System.out.println("inside method 3");
	}
	
	@Before
	
	public void before()
	{
		System.out.println("Before entering the method");
	}

@After	
	public void after()
	{
		System.out.println("after entering the method");
	}
@BeforeClass

public static void beforeC()
{
	System.out.println("Before entering the class");
}

@AfterClass	
public static void afterC()
{
	System.out.println("after entering the class");
}
}
