package MyMatrixPackage;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class MyMatrixClass 
{
	static RealMatrix matrix1;
	static RealMatrix matrix2;
	static RealMatrix matrix3;//存放结果
	static RealMatrix matrix4;//临时
	public static RealMatrix Add(RealMatrix m1,RealMatrix m2)
	{
		matrix4=m1.add(m2);
		return matrix4;
	}
	public static RealMatrix Add(RealMatrix m1,double x)
	{
		matrix4=m1.scalarAdd(x);
		return matrix4;
	}
	public static RealMatrix Sub(RealMatrix m1,RealMatrix m2)
	{
		matrix4=m1.subtract(m2);
		return matrix4;		
	}
	public static RealMatrix Mul(RealMatrix m1,RealMatrix m2)
	{
		matrix4=m1.multiply(m2);
		return matrix4;
	}
	public static RealMatrix Mul(RealMatrix m1,double x)
	{
		matrix4=m1.scalarMultiply(x);
		return matrix4;
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
	public static void function2(double[][]array1, double[][]array2)
	{
		matrix1 = new Array2DRowRealMatrix(array1);
		matrix2 = new Array2DRowRealMatrix(array2);
		matrix3 = new Array2DRowRealMatrix(array1);
		matrix4 = new Array2DRowRealMatrix();
		//在此处注入一个错误，应该是matrix1+matirx2，但是写成了matrix1-matrix2
		matrix1=Sub(matrix1,matrix2);
		matrix3=Mul(matrix3,matrix1);
		System.out.println("((array1+array2)*array1=\n" +matrix3);
	}
	public static void function3(double[][]array1, double[][]array2,double x)
	{
		matrix1 = new Array2DRowRealMatrix(array1);
		matrix2 = new Array2DRowRealMatrix(array2);
		matrix3 = null;
		matrix4=new Array2DRowRealMatrix();
		matrix2=Add(matrix2,10);
		matrix2=Mul(matrix2,matrix1);
		matrix3=matrix2;
		System.out.println("array1*(array2+10)=\n" +matrix3);
	}
}
