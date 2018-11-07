package Test_Package;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

import java.io.IOException;

import MyMatrixPackage.MyMatrixClass;
import java.util.Scanner;

import java.util.*; 
public class Test_main 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		MyMatrixClass matrix_operation_obj = new MyMatrixClass(); 
		double[][] array1;
		double[][] array2;
		array1=new double[3][3];
		array2=new double[3][3];
		System.out.println("Please input 1st Array[3][3]:");
		CreatArray(array1);
		System.out.println("Please input 2nd Array[3][3]:");
		CreatArray(array2);
		
		// 不使用工具做单元测试，以下是保留做题痕迹
		/*double [][]array3= {{1,2,3},{4,5,6},{7,8,9}};
		double [][]array4= {{2,4,6},{8,10,12},{14,16,18}};
		RealMatrix matrix3 = new Array2DRowRealMatrix(array3);
		RealMatrix matrix4 = new Array2DRowRealMatrix(array4);
		RealMatrix matrix5 = matrix_operation_obj.Add(matrix3, matrix3);
		if(matrix5.equals(matrix4))
			System.out.println("The add_function is rignt");
		else
			System.out.println("The add_function is wrong");*/
		
		if(array1[0][0]<array2[0][0])   //(array1+array2)*10   function1
		{
			matrix_operation_obj.function1(array1, array2, 10);
		}
		else if(array1[0][0]==array2[0][0])//(array1-array2)*array1
		{
			matrix_operation_obj.function2(array1, array2);
		}
		else//array1*(array2+10)
		{
			matrix_operation_obj.function3(array1, array2, 10);
		}
	}
	static void CreatArray(double[][]data) throws IOException
	{
		Scanner input=new Scanner(System.in);
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				data[i][j]=input.nextInt();
			}
		}
	}

}




