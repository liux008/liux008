package hello;
import java.util.Scanner;
public class HelloWorld {   
		public static void main(String[] args){		
			System.out.print("请输入矩阵的阶数:");		
			Scanner input = new Scanner(System.in);		
            int n = input.nextInt();		
              System.out.print("请输入矩阵:");		
              int [][] arr = new int [n][n];		
              for(int i = 0;i < n;i++){			
            	  for(int j = 0;j < n;j++){				
            		  arr[i][j] = input.nextInt();			
            		  }		
            	  }		
              for(int x = 0;x < n;x++){			
            	  for(int y = 0;y < n;y++){				
            		  if(arr[y][x] == 1){					
            			  for(int k = 0;k < n;k++){						
            				  arr[y][k] = (arr[y][k]) | (arr[x][k]);					
            				  }				
            			  }			
            		  }		
            	  }		
              System.out.println("传递闭包的最终结果:");		
              for(int a = 0;a < n;a++){			
            	  for(int b = 0;b < n;b++){				
            		  System.out.print(arr[a][b]);			
            		  }			
            	  System.out.println();		
            	  }	
              }
		}	

	