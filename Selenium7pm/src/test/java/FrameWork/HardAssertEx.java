package FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {

	
	@Test
	public void m2()
	{
		System.out.println("step1");
		System.out.println("step2");
		Assert.assertEquals("Shobha", "shobha");
		System.out.println("step3");
		System.out.println("step4");
	}
	
	@Test
	public void m1()
	{
		String ExpDAta = "Qspiders";
		String actData = "Qspiders";
	Assert.assertEquals(actData, ExpDAta);
	}
	
	
	
	
}
