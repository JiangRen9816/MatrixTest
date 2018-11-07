package MyMatrixPackage;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.After;
import org.junit.Before;
public class MyMatrixClassTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testAddAndMul() {
		RealMatrix matrix;
		RealMatrix matrix1;
		RealMatrix matrix2;
		MyMatrixClass testobj = new MyMatrixClass(); 
		double [][]testarray1= {{1,2,3},{4,5,6},{7,8,9}};
		double [][]testarray2= {{2,4,6},{8,10,12},{14,16,18}};
		double [][]testarray3= {{30,60,90},{120,150,180},{210,240,270}};
		matrix1 = new Array2DRowRealMatrix(testarray1);
		matrix2 = new Array2DRowRealMatrix(testarray2);
		matrix = new Array2DRowRealMatrix(testarray3);
		matrix1=testobj.Add(matrix1, matrix2);
		matrix1=testobj.Mul(matrix1, 10);
		assertEquals(matrix,matrix1);
	}

	@Test
	public void testAdd1() {
		RealMatrix matrix;
		MyMatrixClass testobj = new MyMatrixClass(); 
		double [][]testarray1= {{1,2,3},{4,5,6},{7,8,9}};
		double [][]testarray2= {{2,4,6},{8,10,12},{14,16,18}};
		double [][]testarray3= {{3,6,9},{12,15,18},{21,24,27}};
		RealMatrix matrix1 = new Array2DRowRealMatrix(testarray1);
		RealMatrix matrix2 = new Array2DRowRealMatrix(testarray2);
		RealMatrix matrix3 = new Array2DRowRealMatrix(testarray3);
		matrix =testobj.Add(matrix1, matrix2);
		assertEquals(matrix,matrix3);
	}
	
	@Test
	public void testAdd2() {
		RealMatrix matrix;
		MyMatrixClass testobj = new MyMatrixClass(); 
		double [][]testarray1= {{1,2,3},{4,5,6},{7,8,9}};
		double [][]testarray2= {{11,12,13},{14,15,16},{17,18,19}};
		RealMatrix matrix1 = new Array2DRowRealMatrix(testarray1);
		RealMatrix matrix2 = new Array2DRowRealMatrix(testarray2);
		matrix =testobj.Add(matrix1,10);
		assertEquals(matrix,matrix2);
	}
	
	
	@Test
	public void testMul1() {
		RealMatrix matrix;
		MyMatrixClass testobj = new MyMatrixClass(); 
		double [][]testarray1= {{1,2,3},{4,5,6},{7,8,9}};
		double [][]testarray2= {{2,4,6},{8,10,12},{14,16,18}};
		double [][]testarray3= {{60,72,84},{132,162,192},{204,252,300}};
		RealMatrix matrix1 = new Array2DRowRealMatrix(testarray1);
		RealMatrix matrix2 = new Array2DRowRealMatrix(testarray2);
		RealMatrix matrix3 = new Array2DRowRealMatrix(testarray3);
		matrix =testobj.Mul(matrix1, matrix2);
		assertEquals(matrix,matrix3);
	}
	
	@Test
	public void testMul2() {
		RealMatrix matrix;
		MyMatrixClass testobj = new MyMatrixClass(); 
		double [][]testarray1= {{1,2,3},{4,5,6},{7,8,9}};
		double [][]testarray2= {{10,20,30},{40,50,60},{70,80,90}};
		RealMatrix matrix1 = new Array2DRowRealMatrix(testarray1);
		RealMatrix matrix2 = new Array2DRowRealMatrix(testarray2);
		matrix =testobj.Mul(matrix1,10);
		assertEquals(matrix,matrix2);
	}
	
	@Test
	public void testSub() {
		RealMatrix matrix;
		MyMatrixClass testobj = new MyMatrixClass(); 
		double [][]testarray1= {{3,6,9},{12,15,18},{21,24,27}};
		double [][]testarray2= {{2,4,6},{8,10,12},{14,16,18}};
		double [][]testarray3= {{1,2,3},{4,5,6},{7,8,9}};
		RealMatrix matrix1 = new Array2DRowRealMatrix(testarray1);
		RealMatrix matrix2 = new Array2DRowRealMatrix(testarray2);
		RealMatrix matrix3 = new Array2DRowRealMatrix(testarray3);
		matrix =testobj.Sub(matrix1, matrix2);
		assertEquals(matrix,matrix3);
	}
	
	@Test
	public void testFunction1() {
		RealMatrix matrix;
		MyMatrixClass testobj = new MyMatrixClass(); 
		double [][]testarray1= {{1,2,3},{4,5,6},{7,8,9}};
		double [][]testarray2= {{2,4,6},{8,10,12},{14,16,18}};
		double [][]testarray3= {{30,60,90},{120,150,180},{210,240,270}};
		testobj.function1(testarray1, testarray2, 10);
		matrix = new Array2DRowRealMatrix(testarray3);
		assertEquals(matrix,testobj.matrix3);
	}

	@Test
	public void testFunction2() {
		RealMatrix matrix;
		MyMatrixClass testobj = new MyMatrixClass(); 
		double [][]testarray1= {{0,1,2},{3,4,5},{6,7,8}};
		double [][]testarray2= {{0,2,4},{6,8,10},{12,14,16}};
		double [][]testarray3= {{45,54,63},{126,162,198},{207,270,333}};
		testobj.function2(testarray1, testarray2);
		matrix = new Array2DRowRealMatrix(testarray3);
		assertEquals(matrix,testobj.matrix3);
	}

	@Test
	public void testFunction3() {
		RealMatrix matrix;
		MyMatrixClass testobj = new MyMatrixClass(); 
		double [][]testarray1= {{2,4,6},{8,10,12},{14,16,18}};
		double [][]testarray2= {{1,2,3},{4,5,6},{7,8,9}};
		double [][]testarray3= {{300,372,444},{372,462,552},{444,552,660}};
		testobj.function3(testarray1, testarray2, 10);
		matrix = new Array2DRowRealMatrix(testarray3);
		assertEquals(matrix,testobj.matrix3);
	}

}
