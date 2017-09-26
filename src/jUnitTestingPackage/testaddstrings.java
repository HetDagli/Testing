package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstrings {

	@Test
	public void test() {
		jUnitFunction obj=new jUnitFunction();
		String result=obj.addstrings("Het","Dagli");
		assertEquals("HetDagli",result);
	}

}
