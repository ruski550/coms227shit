package lab5;

import org.junit.Test;
import static org.junit.Assert.*;


//import balloon.Balloon;
//import balloon1.Balloon;
//import balloon2.Balloon;
//fails blowTest2
<<<<<<< HEAD
import balloon3.Balloon;
=======
import balloon4.Balloon;
>>>>>>> refs/remotes/origin/master
//import balloon4.Balloon;

public class BalloonTests {

	@Test
	public void testInitial(){
		Balloon b = new	Balloon(10);
		assertEquals(0, b.getRadius());
		assertEquals(false, b.isPopped());
		
	}
	@Test 
	public void blowTest1(){
		Balloon b = new Balloon(10);
		b.blow(5);
		assertEquals(5,b.getRadius());
		assertEquals(false, b.isPopped());
		}
	@Test
	public void blowTest2(){
		Balloon b = new Balloon(3);
		b.blow(1);
		b.blow(1);
		//balloon 3 fails here
		assertEquals(2,b.getRadius());
		assertEquals(false, b.isPopped());
		}
	@Test 
	public void popTest(){
		Balloon b = new Balloon(10);
		b.pop();
		assertEquals(0, b.getRadius());
		assertEquals(true, b.isPopped());
<<<<<<< HEAD
	}
	public void deflateTest(){
		Balloon b = new Balloon(5);
		b.deflate();
		assertEquals(0, b.getRadius());
		assertEquals(false, b.isPopped());
=======
		//balloon 2 fails here
		b.blow(1);
		assertEquals(0,b.getRadius());
		assertEquals(true, b.isPopped());
	}
	@Test
	public void deflateTest(){
		Balloon b = new Balloon(5);
		b.deflate();
		//where balloon 4 fails
		assertEquals(0, b.getRadius());
		assertEquals(false, b.isPopped());
		b.deflate();
		b.blow(2);
		assertEquals(2, b.getRadius());
		assertEquals(false, b.isPopped());
>>>>>>> refs/remotes/origin/master
	}
	@Test
	public void overInflate(){
		Balloon b = new Balloon(2);
		b.blow(3);
<<<<<<< HEAD
		assertEquals(true, b.isPopped());
		assertEquals(0, b.getRadius());
=======
		//balloon 1 fails here
		assertEquals(true, b.isPopped());
		assertEquals(0, b.getRadius());
		b.pop();
		b.blow(3);
		assertEquals (true, b.isPopped());
		assertEquals (0, b.getRadius());
>>>>>>> refs/remotes/origin/master
	}
}
