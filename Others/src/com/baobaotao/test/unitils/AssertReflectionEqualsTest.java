package com.baobaotao.test.unitils;

import org.junit.Test;
import org.unitils.reflectionassert.ReflectionAssert;
import org.unitils.reflectionassert.ReflectionComparatorMode;

import com.baobatao.service.implement.MUser;

/**
 * 
 * @author JueVictory
 *
 */
public class AssertReflectionEqualsTest {

	/**
	 * 
	 */
	@Test
	public void testReflection() {
/*		MUser user = new MUser("Tom", "1234");
		MUser user2 = new MUser("Tom", "1234");
		ReflectionAssert.assertReflectionEquals(user, user2, ReflectionComparatorMode.IGNORE_DEFAULTS);*/
		
		Integer orderList1[]  = new Integer[]{1,2,3};
		Integer orderList2[]  = new Integer[]{3,1,2};
		ReflectionAssert.assertLenientEquals(orderList1, orderList2);
	}
}
