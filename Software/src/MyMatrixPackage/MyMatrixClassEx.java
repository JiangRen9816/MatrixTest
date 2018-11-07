package MyMatrixPackage;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class MyMatrixClassEx extends MyMatrixClass {
	public static RealMatrix AddZ(RealMatrix m1,RealMatrix m2)
	{
		matrix4=m1.add(m2);
		return matrix4;
	}
	public static RealMatrix MulAndAdd(RealMatrix m1,RealMatrix m2,double x)
	{
		matrix4=m1.add(m2);
		matrix4=matrix4.scalarMultiply(x);
		return matrix4;
	}
	public static void function1A(double[][]array1, double[][]array2,double x)
	{
		matrix1 = new Array2DRowRealMatrix(array1);
		matrix2 = new Array2DRowRealMatrix(array2);
		matrix3 = null;
		matrix4=new Array2DRowRealMatrix();
		matrix1=MulAndAdd(matrix1,matrix2,x);
		matrix3=matrix1;
		System.out.println("(array1+array2)*10=\n" +matrix3);
	}
	
	public static void function1B(double[][]array1, double[][]array2,double x)
	{
		matrix1 = new Array2DRowRealMatrix(array1);
		matrix2 = new Array2DRowRealMatrix(array2);
		matrix3 = null;
		matrix4=new Array2DRowRealMatrix();
		matrix1=AddZ(matrix1,matrix2);
		matrix1=Mul(matrix1,x);
		matrix3=matrix1;
		System.out.println("(array1+array2)*10=\n" +matrix3);
	}

	public static void function1(double[][]array1, double[][]array2,double x)
	{
		matrix1 = new Array2DRowRealMatrix(array1);
		matrix2 = new Array2DRowRealMatrix(array2);
		matrix3 = null;
		matrix4=new Array2DRowRealMatrix();
		matrix1=Add(matrix1,matrix2);
		matrix1=Mul(matrix1,10);
		matrix3=matrix1;
		System.out.println("(array1+array2)*10=\n" +matrix3);
	}
}
