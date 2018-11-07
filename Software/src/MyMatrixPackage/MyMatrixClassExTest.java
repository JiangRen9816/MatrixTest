package MyMatrixPackage;

import static org.junit.Assert.*;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyMatrixClassExTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFunction1() {
		RealMatrix matrix;
		MyMatrixClassEx testobj = new MyMatrixClassEx(); 
		double [][]testarray1= {{1,2,3},{4,5,6},{7,8,9}};
		double [][]testarray2= {{2,4,6},{8,10,12},{14,16,18}};
		double [][]testarray3= {{30,60,90},{120,150,180},{210,240,270}};
		testobj.function1(testarray1, testarray2, 10);
		matrix = new Array2DRowRealMatrix(testarray3);
		assertEquals(matrix,testobj.matrix3);
	}
	
	@Test
	public void testFunction1A() {
		RealMatrix matrix;
		MyMatrixClassEx testobj = new MyMatrixClassEx(); 
		double [][]testarray1= {{1,2,3},{4,5,6},{7,8,9}};
		double [][]testarray2= {{2,4,6},{8,10,12},{14,16,18}};
		double [][]testarray3= {{30,60,90},{120,150,180},{210,240,270}};
		testobj.function1A(testarray1, testarray2, 10);
		matrix = new Array2DRowRealMatrix(testarray3);
		assertEquals(matrix,testobj.matrix3);
	}
	
	@Test
	public void testFunction1B() {
		RealMatrix matrix;
		MyMatrixClassEx testobj = new MyMatrixClassEx(); 
		double [][]testarray1= {{1,2,3},{4,5,6},{7,8,9}};
		double [][]testarray2= {{2,4,6},{8,10,12},{14,16,18}};
		double [][]testarray3= {{30,60,90},{120,150,180},{210,240,270}};
		testobj.function1B(testarray1, testarray2, 10);
		matrix = new Array2DRowRealMatrix(testarray3);
		assertEquals(matrix,testobj.matrix3);
	}

}
