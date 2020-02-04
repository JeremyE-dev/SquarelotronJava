package Squarelotron;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquarelotronTest {

	
	@BeforeEach
	 
	void setUp() throws Exception {
		Squarelotron sqr1 = new Squarelotron(4);
	}
	

	/*
	@Test
	void testPrintSquarelotron() {
		fail("Not yet implemented"); // TODO
	}
	*/

	@Test
	void testUpsideDownFlip() {
		Squarelotron sqr1 = new Squarelotron(4);
		assertTrue(sqr1.upsideDownFlip(1).squarelotron[0][0] == sqr1.squarelotron[3][0]);
		assertTrue(sqr1.upsideDownFlip(1).squarelotron[0][1] == sqr1.squarelotron[3][1]);
		assertTrue(sqr1.upsideDownFlip(1).squarelotron[0][2] == sqr1.squarelotron[3][2]);
		assertTrue(sqr1.upsideDownFlip(1).squarelotron[0][3] == sqr1.squarelotron[3][3]);
		
		assertTrue(sqr1.upsideDownFlip(1).squarelotron[3][0] == sqr1.squarelotron[0][0]);
		assertTrue(sqr1.upsideDownFlip(1).squarelotron[3][1] == sqr1.squarelotron[0][1]);
		assertTrue(sqr1.upsideDownFlip(1).squarelotron[3][2] == sqr1.squarelotron[0][2]);
		assertTrue(sqr1.upsideDownFlip(1).squarelotron[3][3] == sqr1.squarelotron[0][3]);
		
		
		assertEquals(9, sqr1.upsideDownFlip(1).squarelotron[1][0]);
		assertTrue(sqr1.upsideDownFlip(1).squarelotron[1][0] == sqr1.squarelotron[2][0]);
		assertTrue(sqr1.upsideDownFlip(1).squarelotron[2][0] == sqr1.squarelotron[1][0]);
		assertTrue(sqr1.upsideDownFlip(1).squarelotron[1][3] == sqr1.squarelotron[2][3]);
		assertTrue(sqr1.upsideDownFlip(1).squarelotron[2][3] == sqr1.squarelotron[1][3]);
		
	
		
		assertTrue(sqr1.upsideDownFlip(2).squarelotron[1][1] == sqr1.squarelotron[2][1]);
		assertTrue(sqr1.upsideDownFlip(2).squarelotron[1][2] == sqr1.squarelotron[2][2]);
		assertTrue(sqr1.upsideDownFlip(2).squarelotron[2][1] == sqr1.squarelotron[1][1]);
		assertTrue(sqr1.upsideDownFlip(2).squarelotron[2][2] == sqr1.squarelotron[1][2]);
	
		Squarelotron sqr2 = new Squarelotron(6);
		assertEquals(26,sqr2.upsideDownFlip(2).squarelotron[1][1]);
		assertTrue(sqr2.upsideDownFlip(2).squarelotron[1][1] == sqr2.squarelotron[4][1]);
		assertTrue(sqr2.upsideDownFlip(2).squarelotron[1][2] == sqr2.squarelotron[4][2]);
		assertTrue(sqr2.upsideDownFlip(2).squarelotron[1][3] == sqr2.squarelotron[4][3]);
		assertTrue(sqr2.upsideDownFlip(2).squarelotron[1][4] == sqr2.squarelotron[4][4]);
		
		
		assertEquals(23, sqr2.upsideDownFlip(2).squarelotron[2][4]);
		assertTrue(sqr2.upsideDownFlip(2).squarelotron[4][1] == sqr2.squarelotron[1][1]);
		assertTrue(sqr2.upsideDownFlip(2).squarelotron[4][2] == sqr2.squarelotron[1][2]);
		assertTrue(sqr2.upsideDownFlip(2).squarelotron[4][3] == sqr2.squarelotron[1][3]);
		assertTrue(sqr2.upsideDownFlip(2).squarelotron[4][4] == sqr2.squarelotron[1][4]);
		
		assertTrue(sqr2.upsideDownFlip(2).squarelotron[2][1] == sqr2.squarelotron[3][1]);
		assertTrue(sqr2.upsideDownFlip(2).squarelotron[2][4] == sqr2.squarelotron[3][4]);
		assertTrue(sqr2.upsideDownFlip(2).squarelotron[3][1] == sqr2.squarelotron[2][1]);
		assertTrue(sqr2.upsideDownFlip(2).squarelotron[3][4] == sqr2.squarelotron[2][4]);
		
		//test inner ring
		assertTrue(sqr2.upsideDownFlip(3).squarelotron[2][2] == sqr2.squarelotron[3][2]);
		assertTrue(sqr2.upsideDownFlip(3).squarelotron[3][2] == sqr2.squarelotron[2][2]);
		assertTrue(sqr2.upsideDownFlip(3).squarelotron[2][3] == sqr2.squarelotron[3][3]);
		assertTrue(sqr2.upsideDownFlip(3).squarelotron[3][3] == sqr2.squarelotron[2][3]);
		

		
		
	}

	/*@Test
	void testRotateRight() {
		fail("Not yet implemented"); // TODO
	}
	*/
	
	@Test
	void testMainDiagonalFlip() {
	Squarelotron sqr3 = new Squarelotron(5);
	
	//assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[0][0] == sqr3.squarelotron[0][0]);
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[0][1] == sqr3.squarelotron[1][0]);	
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[0][2] == sqr3.squarelotron[2][0]);
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[0][3] == sqr3.squarelotron[3][0]);
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[0][4] == sqr3.squarelotron[4][0]);
	
	//assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[0][0] == sqr3.squarelotron[0][0]);
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[1][0] == sqr3.squarelotron[0][1]);
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[2][0] == sqr3.squarelotron[0][2]);
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[3][0] == sqr3.squarelotron[0][3]);
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[0][4] == sqr3.squarelotron[4][0]);
	
	
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[1][4] == sqr3.squarelotron[4][1]);
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[2][4] == sqr3.squarelotron[4][2]);
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[3][4] == sqr3.squarelotron[4][3]);
	
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[4][1] == sqr3.squarelotron[1][4]);
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[4][2] == sqr3.squarelotron[2][4]);
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[4][3] == sqr3.squarelotron[3][4]);
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[4][4] == sqr3.squarelotron[4][0]);
	
	
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[0][1] == sqr3.squarelotron[1][0]);	
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[0][2] == sqr3.squarelotron[2][0]);
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[0][3] == sqr3.squarelotron[3][0]);
	assertTrue(sqr3.mainDiagonalFlip(1).squarelotron[0][4] == sqr3.squarelotron[4][0]);
	
	//size 5 inner ring flip
	assertTrue(sqr3.mainDiagonalFlip(2).squarelotron[2][1] == sqr3.squarelotron[1][2]);
	assertTrue(sqr3.mainDiagonalFlip(2).squarelotron[3][1] == sqr3.squarelotron[1][3]);
	
	assertTrue(sqr3.mainDiagonalFlip(2).squarelotron[1][2] == sqr3.squarelotron[2][1]);
	assertTrue(sqr3.mainDiagonalFlip(2).squarelotron[1][3] == sqr3.squarelotron[3][1]);
	
	assertTrue(sqr3.mainDiagonalFlip(2).squarelotron[3][2] == sqr3.squarelotron[2][3]);
	
	
	//size 4 outer ring
	Squarelotron sqr4 = new Squarelotron(4);
	assertTrue(sqr4.mainDiagonalFlip(1).squarelotron[0][0] == sqr4.squarelotron[0][0]);
	assertTrue(sqr4.mainDiagonalFlip(1).squarelotron[0][1] == sqr4.squarelotron[1][0]);
	assertTrue(sqr4.mainDiagonalFlip(1).squarelotron[0][2] == sqr4.squarelotron[2][0]);
	assertTrue(sqr4.mainDiagonalFlip(1).squarelotron[0][3] == sqr4.squarelotron[3][0]);
	
	
	assertTrue(sqr4.mainDiagonalFlip(1).squarelotron[1][0] == sqr4.squarelotron[0][1]);
	assertTrue(sqr4.mainDiagonalFlip(1).squarelotron[2][0] == sqr4.squarelotron[0][2]);
	assertTrue(sqr4.mainDiagonalFlip(1).squarelotron[3][0] == sqr4.squarelotron[0][3]);
	

	
	assertTrue(sqr4.mainDiagonalFlip(1).squarelotron[3][1] == sqr4.squarelotron[1][3]);
	assertTrue(sqr4.mainDiagonalFlip(1).squarelotron[3][2] == sqr4.squarelotron[2][3]);
	
	
	assertTrue(sqr4.mainDiagonalFlip(1).squarelotron[1][3] == sqr4.squarelotron[3][1]);
	assertTrue(sqr4.mainDiagonalFlip(1).squarelotron[2][3] == sqr4.squarelotron[3][2]);
	
	//size 4 inner ring
	assertTrue(sqr4.mainDiagonalFlip(2).squarelotron[1][2] == sqr4.squarelotron[2][1]);
	assertTrue(sqr4.mainDiagonalFlip(2).squarelotron[2][1] == sqr4.squarelotron[1][2]);

	
	
	//test 6 inner ring (2)
	Squarelotron sqr5 = new Squarelotron(6);
	assertTrue(sqr5.mainDiagonalFlip(2).squarelotron[1][2] == sqr5.squarelotron[2][1]);
	assertTrue(sqr5.mainDiagonalFlip(2).squarelotron[1][3] == sqr5.squarelotron[3][1]);
	assertTrue(sqr5.mainDiagonalFlip(2).squarelotron[1][4] == sqr5.squarelotron[4][1]);
	
	assertTrue(sqr5.mainDiagonalFlip(2).squarelotron[2][1] == sqr5.squarelotron[1][2]);
	assertTrue(sqr5.mainDiagonalFlip(2).squarelotron[3][1] == sqr5.squarelotron[1][3]);
	assertTrue(sqr5.mainDiagonalFlip(2).squarelotron[4][1] == sqr5.squarelotron[1][4]);
	
	assertTrue(sqr5.mainDiagonalFlip(2).squarelotron[4][2] == sqr5.squarelotron[2][4]);
	assertTrue(sqr5.mainDiagonalFlip(2).squarelotron[4][3] == sqr5.squarelotron[3][4]);
	
	assertTrue(sqr5.mainDiagonalFlip(2).squarelotron[2][4] == sqr5.squarelotron[4][2]);
	assertTrue(sqr5.mainDiagonalFlip(2).squarelotron[3][4] == sqr5.squarelotron[4][3]);
	
	
	}
	
	@Test
	void TestRotateRight () {
	Squarelotron sqr6 = new Squarelotron(4);
	Squarelotron temp6 = new Squarelotron (4);
	sqr6.rotateRight(1);
	assertEquals(13, sqr6.squarelotron[0][0]);
	assertEquals(9, sqr6.squarelotron[0][1]);
		
	assertTrue(sqr6.squarelotron[0][0] == temp6.squarelotron[3][0]);
	assertTrue(sqr6.squarelotron[0][1] == temp6.squarelotron[2][0]);
	assertTrue(sqr6.squarelotron[0][2] == temp6.squarelotron[1][0]);
	assertTrue(sqr6.squarelotron[0][3] == temp6.squarelotron[0][0]);
	
	assertTrue(sqr6.squarelotron[1][0] == temp6.squarelotron[3][1]);
	assertTrue(sqr6.squarelotron[1][1] == temp6.squarelotron[2][1]);
	assertTrue(sqr6.squarelotron[1][2] == temp6.squarelotron[1][1]);
	assertTrue(sqr6.squarelotron[1][3] == temp6.squarelotron[0][1]);
	
	assertTrue(sqr6.squarelotron[2][0] == temp6.squarelotron[3][2]);
	assertTrue(sqr6.squarelotron[2][1] == temp6.squarelotron[2][2]);
	assertTrue(sqr6.squarelotron[2][2] == temp6.squarelotron[1][2]);
	assertTrue(sqr6.squarelotron[2][3] == temp6.squarelotron[0][2]);
	
	assertTrue(sqr6.squarelotron[3][0] == temp6.squarelotron[3][3]);
	assertTrue(sqr6.squarelotron[3][1] == temp6.squarelotron[2][3]);
	assertTrue(sqr6.squarelotron[3][2] == temp6.squarelotron[1][3]);
	assertTrue(sqr6.squarelotron[3][3] == temp6.squarelotron[0][3]);
	
	
	sqr6.rotateRight(2);
	assertEquals(16,sqr6.squarelotron[0][0]);
	assertEquals(15,sqr6.squarelotron[0][1]);
	assertEquals(14,sqr6.squarelotron[0][2]);
	assertEquals(13,sqr6.squarelotron[0][3]);
	
	
	assertTrue(sqr6.squarelotron[0][0] == temp6.squarelotron[3][3]);
	assertTrue(sqr6.squarelotron[0][1] == temp6.squarelotron[3][2]);
	assertTrue(sqr6.squarelotron[0][2] == temp6.squarelotron[3][1]);
	assertTrue(sqr6.squarelotron[0][3] == temp6.squarelotron[3][0]);
	
	assertTrue(sqr6.squarelotron[1][0] == temp6.squarelotron[2][3]);
	assertTrue(sqr6.squarelotron[1][1] == temp6.squarelotron[2][2]);
	assertTrue(sqr6.squarelotron[1][2] == temp6.squarelotron[2][1]);
	assertTrue(sqr6.squarelotron[1][3] == temp6.squarelotron[2][0]);
	
	assertTrue(sqr6.squarelotron[2][0] == temp6.squarelotron[1][3]);
	assertTrue(sqr6.squarelotron[2][1] == temp6.squarelotron[1][2]);
	assertTrue(sqr6.squarelotron[2][2] == temp6.squarelotron[1][1]);
	assertTrue(sqr6.squarelotron[2][3] == temp6.squarelotron[1][0]);
	
	assertEquals(4, sqr6.squarelotron[3][0]);
	assertEquals(3, sqr6.squarelotron[3][1]);
	assertEquals(2, sqr6.squarelotron[3][2]);
	assertEquals(1, sqr6.squarelotron[3][3]);
	
	
	assertTrue(sqr6.squarelotron[3][0] == temp6.squarelotron[0][3]);
	assertTrue(sqr6.squarelotron[3][1] == temp6.squarelotron[0][2]);
	assertTrue(sqr6.squarelotron[3][2] == temp6.squarelotron[0][1]);
	assertTrue(sqr6.squarelotron[3][3] == temp6.squarelotron[0][0]);
	
	sqr6.rotateRight(3);
	assertTrue(sqr6.squarelotron[0][0] == temp6.squarelotron[0][3]);
	assertTrue(sqr6.squarelotron[0][1] == temp6.squarelotron[1][3]);
	assertTrue(sqr6.squarelotron[0][2] == temp6.squarelotron[2][3]);
	assertTrue(sqr6.squarelotron[0][3] == temp6.squarelotron[3][3]);
	
	assertTrue(sqr6.squarelotron[1][0] == temp6.squarelotron[0][2]);
	assertTrue(sqr6.squarelotron[1][1] == temp6.squarelotron[1][2]);
	assertTrue(sqr6.squarelotron[1][2] == temp6.squarelotron[2][2]);
	assertTrue(sqr6.squarelotron[1][3] == temp6.squarelotron[3][2]);
	
	assertTrue(sqr6.squarelotron[2][0] == temp6.squarelotron[0][1]);
	assertTrue(sqr6.squarelotron[2][1] == temp6.squarelotron[1][1]);
	assertTrue(sqr6.squarelotron[2][2] == temp6.squarelotron[2][1]);
	assertTrue(sqr6.squarelotron[2][3] == temp6.squarelotron[3][1]);
	
	assertTrue(sqr6.squarelotron[3][0] == temp6.squarelotron[0][0]);
	assertTrue(sqr6.squarelotron[3][1] == temp6.squarelotron[1][0]);
	assertTrue(sqr6.squarelotron[3][2] == temp6.squarelotron[2][0]);
	assertTrue(sqr6.squarelotron[3][3] == temp6.squarelotron[3][0]);
	
	sqr6.rotateRight(-1);
	assertTrue(sqr6.squarelotron[0][0] == temp6.squarelotron[0][3]);
	assertTrue(sqr6.squarelotron[0][1] == temp6.squarelotron[1][3]);
	assertTrue(sqr6.squarelotron[0][2] == temp6.squarelotron[2][3]);
	assertTrue(sqr6.squarelotron[0][3] == temp6.squarelotron[3][3]);
	
	assertTrue(sqr6.squarelotron[1][0] == temp6.squarelotron[0][2]);
	assertTrue(sqr6.squarelotron[1][1] == temp6.squarelotron[1][2]);
	assertTrue(sqr6.squarelotron[1][2] == temp6.squarelotron[2][2]);
	assertTrue(sqr6.squarelotron[1][3] == temp6.squarelotron[3][2]);
	
	assertTrue(sqr6.squarelotron[2][0] == temp6.squarelotron[0][1]);
	assertTrue(sqr6.squarelotron[2][1] == temp6.squarelotron[1][1]);
	assertTrue(sqr6.squarelotron[2][2] == temp6.squarelotron[2][1]);
	assertTrue(sqr6.squarelotron[2][3] == temp6.squarelotron[3][1]);
	
	assertTrue(sqr6.squarelotron[3][0] == temp6.squarelotron[0][0]);
	assertTrue(sqr6.squarelotron[3][1] == temp6.squarelotron[1][0]);
	assertTrue(sqr6.squarelotron[3][2] == temp6.squarelotron[2][0]);
	assertTrue(sqr6.squarelotron[3][3] == temp6.squarelotron[3][0]);
	
	

	Squarelotron sqr7 = new Squarelotron(5);
	Squarelotron temp7 = new Squarelotron (5);
	sqr7.rotateRight(1);
	
	assertTrue(sqr7.squarelotron[0][0] == temp7.squarelotron[4][0]);
	assertTrue(sqr7.squarelotron[0][1] == temp7.squarelotron[3][0]);
	assertTrue(sqr7.squarelotron[0][2] == temp7.squarelotron[2][0]);
	assertTrue(sqr7.squarelotron[0][3] == temp7.squarelotron[1][0]);
	assertTrue(sqr7.squarelotron[0][4] == temp7.squarelotron[0][0]);
	
	
	assertTrue(sqr7.squarelotron[1][0] == temp7.squarelotron[4][1]);
	assertTrue(sqr7.squarelotron[1][1] == temp7.squarelotron[3][1]);
	assertTrue(sqr7.squarelotron[1][2] == temp7.squarelotron[2][1]);
	assertTrue(sqr7.squarelotron[1][3] == temp7.squarelotron[1][1]);
	assertTrue(sqr7.squarelotron[1][4] == temp7.squarelotron[0][1]);
	
	
	assertTrue(sqr7.squarelotron[2][0] == temp7.squarelotron[4][2]);
	assertTrue(sqr7.squarelotron[2][1] == temp7.squarelotron[3][2]);
	assertTrue(sqr7.squarelotron[2][2] == temp7.squarelotron[2][2]);
	assertTrue(sqr7.squarelotron[2][3] == temp7.squarelotron[1][2]);
	assertTrue(sqr7.squarelotron[2][4] == temp7.squarelotron[0][2]);
	
	
	assertTrue(sqr7.squarelotron[3][0] == temp7.squarelotron[4][3]);
	assertTrue(sqr7.squarelotron[3][1] == temp7.squarelotron[3][3]);
	assertTrue(sqr7.squarelotron[3][2] == temp7.squarelotron[2][3]);
	assertTrue(sqr7.squarelotron[3][3] == temp7.squarelotron[1][3]);
	assertTrue(sqr7.squarelotron[3][4] == temp7.squarelotron[0][3]);
	
	assertTrue(sqr7.squarelotron[4][0] == temp7.squarelotron[4][4]);
	assertTrue(sqr7.squarelotron[4][1] == temp7.squarelotron[3][4]);
	assertTrue(sqr7.squarelotron[4][2] == temp7.squarelotron[2][4]);
	assertTrue(sqr7.squarelotron[4][3] == temp7.squarelotron[1][4]);
	assertTrue(sqr7.squarelotron[4][4] == temp7.squarelotron[0][4]);
	
	sqr7.rotateRight(2);
	assertTrue(sqr7.squarelotron[0][0] == temp7.squarelotron[4][4]);
	assertTrue(sqr7.squarelotron[0][1] == temp7.squarelotron[4][3]);
	assertTrue(sqr7.squarelotron[0][2] == temp7.squarelotron[4][2]);
	assertTrue(sqr7.squarelotron[0][3] == temp7.squarelotron[4][1]);
	assertTrue(sqr7.squarelotron[0][4] == temp7.squarelotron[4][0]);
	
	
	assertTrue(sqr7.squarelotron[1][0] == temp7.squarelotron[3][4]);
	assertTrue(sqr7.squarelotron[1][1] == temp7.squarelotron[3][3]);
	assertTrue(sqr7.squarelotron[1][2] == temp7.squarelotron[3][2]);
	assertTrue(sqr7.squarelotron[1][3] == temp7.squarelotron[3][1]);
	assertTrue(sqr7.squarelotron[1][4] == temp7.squarelotron[3][0]);
	
	
	assertTrue(sqr7.squarelotron[2][0] == temp7.squarelotron[2][4]);
	assertTrue(sqr7.squarelotron[2][1] == temp7.squarelotron[2][3]);
	assertTrue(sqr7.squarelotron[2][2] == temp7.squarelotron[2][2]);
	assertTrue(sqr7.squarelotron[2][3] == temp7.squarelotron[2][1]);
	assertTrue(sqr7.squarelotron[2][4] == temp7.squarelotron[2][0]);
	
	
	assertTrue(sqr7.squarelotron[3][0] == temp7.squarelotron[1][4]);
	assertTrue(sqr7.squarelotron[3][1] == temp7.squarelotron[1][3]);
	assertTrue(sqr7.squarelotron[3][2] == temp7.squarelotron[1][2]);
	assertTrue(sqr7.squarelotron[3][3] == temp7.squarelotron[1][1]);
	assertTrue(sqr7.squarelotron[3][4] == temp7.squarelotron[1][0]);
	
	assertTrue(sqr7.squarelotron[4][0] == temp7.squarelotron[0][4]);
	assertTrue(sqr7.squarelotron[4][1] == temp7.squarelotron[0][3]);
	assertTrue(sqr7.squarelotron[4][2] == temp7.squarelotron[0][2]);
	assertTrue(sqr7.squarelotron[4][3] == temp7.squarelotron[0][1]);
	assertTrue(sqr7.squarelotron[4][4] == temp7.squarelotron[0][0]);

	sqr7.rotateRight(3);
	assertTrue(sqr7.squarelotron[0][0] == temp7.squarelotron[0][4]);
	assertTrue(sqr7.squarelotron[0][1] == temp7.squarelotron[1][4]);
	assertTrue(sqr7.squarelotron[0][2] == temp7.squarelotron[2][4]);
	assertTrue(sqr7.squarelotron[0][3] == temp7.squarelotron[3][4]);
	assertTrue(sqr7.squarelotron[0][4] == temp7.squarelotron[4][4]);
	
	
	assertTrue(sqr7.squarelotron[1][0] == temp7.squarelotron[0][3]);
	assertTrue(sqr7.squarelotron[1][1] == temp7.squarelotron[1][3]);
	assertTrue(sqr7.squarelotron[1][2] == temp7.squarelotron[2][3]);
	assertTrue(sqr7.squarelotron[1][3] == temp7.squarelotron[3][3]);
	assertTrue(sqr7.squarelotron[1][4] == temp7.squarelotron[4][3]);
	
	
	assertTrue(sqr7.squarelotron[2][0] == temp7.squarelotron[0][2]);
	assertTrue(sqr7.squarelotron[2][1] == temp7.squarelotron[1][2]);
	assertTrue(sqr7.squarelotron[2][2] == temp7.squarelotron[2][2]);
	assertTrue(sqr7.squarelotron[2][3] == temp7.squarelotron[3][2]);
	assertTrue(sqr7.squarelotron[2][4] == temp7.squarelotron[4][2]);
	
	
	assertTrue(sqr7.squarelotron[3][0] == temp7.squarelotron[0][1]);
	assertTrue(sqr7.squarelotron[3][1] == temp7.squarelotron[1][1]);
	assertTrue(sqr7.squarelotron[3][2] == temp7.squarelotron[2][1]);
	assertTrue(sqr7.squarelotron[3][3] == temp7.squarelotron[3][1]);
	assertTrue(sqr7.squarelotron[3][4] == temp7.squarelotron[4][1]);
	
	assertTrue(sqr7.squarelotron[4][0] == temp7.squarelotron[0][0]);
	assertTrue(sqr7.squarelotron[4][1] == temp7.squarelotron[1][0]);
	assertTrue(sqr7.squarelotron[4][2] == temp7.squarelotron[2][0]);
	assertTrue(sqr7.squarelotron[4][3] == temp7.squarelotron[3][0]);
	assertTrue(sqr7.squarelotron[4][4] == temp7.squarelotron[4][0]);
		
	}
	
	
	
	
	
	
	
}
