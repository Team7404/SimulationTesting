
public class OLD {
//	import java.io.File;
//	import java.io.FileWriter;
//	import java.io.FilterWriter;
//	import java.io.IOException;
//
//	public class Main {
//		
//		static double[][] A = {{0.0,1.0},
//						{0.0,-0.1}};
//		static double[][] B = {{0.0},
//						{0.01}};
//		static double[][] C = {{1.0,0.0}};
//		static double[][] D = {{0.0}};
//		
//		
//		static double[][] start_ = {{1},
//							  {0}};
//		static double[][] k = {{30.0,70.0}};
//		
//		
//		static double kDt = 0.1;
//		static double simtime_ = 20;
//		static double[][] input = {{0}};
//		
//		
//		
//		
//		public static void main(String[] args) {
//			
//
//			
//			try {
//				File logs = new File("log.csv");
//				FileWriter log = new FileWriter(logs.getPath());
//			
//			
//			
//			double[][] x = start_;
//			double currentTime_ = 0;
//			while (currentTime_ <= simtime_) {
//				
//				double [][] state = addMatrixes(multiplyByMatrix(A, x), multiplyByMatrix(B, input));
//				double [][] sensor = multiplyByMatrix(C, x);
//
//				input[0][0] = 30 * -x[0][0] + 70*-x[1][0];
//				
//				x[0][0] += state[0][0]*kDt;
//				x[1][0] += state[1][0]*kDt ;
//				System.out.println(x[0][0] +"\t" + x[1][0]+ "\t"+currentTime_);
//				currentTime_ += kDt;
//				
//				
//			}
//			
//			 log.flush();
//			 log.close();
//
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		public static double[][] multiplyByMatrix(double[][] m1, double[][] m2) {
//	        int m1ColLength = m1[0].length; // m1 columns length
//	        int m2RowLength = m2.length;    // m2 rows length
//	        if(m1ColLength != m2RowLength) {
//	        	System.out.println("NULL!!");
//	        	return null; // matrix multiplication is not possible
//	        }
//	        int mRRowLength = m1.length;    // m result rows length
//	        int mRColLength = m2[0].length; // m result columns length
//	        double[][] mResult = new double[mRRowLength][mRColLength];
//	        for(int i = 0; i < mRRowLength; i++) {         // rows from m1
//	            for(int j = 0; j < mRColLength; j++) {     // columns from m2
//	                for(int k = 0; k < m1ColLength; k++) { // columns from m1
//	                    mResult[i][j] += m1[i][k] * m2[k][j];
//	                }
//	            }
//	        }
//	        return mResult;
//	    }
//		
//		public static double[][] addMatrixes(double[][] src1, double[][] src2){
//			double[][] dst = new double[src1.length][src1[0].length];
//			  for(int i=0;i<src1.length;i++){
//			    for(int j=0;j<src1[0].length;j++){
//			      dst[i][j] = src1[i][j] + src2[i][j];
//			    }
//			  }
//			  return dst;
//			}
//		
//		public static double[][] subtractMatrixes(double[][] src1, double[][] src2){
//			double[][] dst = new double[src1.length][src1[0].length];
//			  for(int i=0;i<src1.length;i++){
//			    for(int j=0;j<src1[0].length;j++){
//			      dst[i][j] = src1[i][j] - src2[i][j];
//			    }
//			  }
//			  return dst;
//			}
//	}
//
}
