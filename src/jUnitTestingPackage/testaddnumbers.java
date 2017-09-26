package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		jUnitFunction obj=new jUnitFunction();
		int result=obj.addnumbers(10,60);
		assertEquals(70,result);
	}

}
