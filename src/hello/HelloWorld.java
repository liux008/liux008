package hello;
import java.util.Scanner;
public class HelloWorld {   
		public static void main(String[] args){		
			System.out.print("���������Ľ���:");		
			Scanner input = new Scanner(System.in);		
            int n = input.nextInt();		
              System.out.print("���������:");		
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
              System.out.println("���ݱհ������ս��:");		
              for(int a = 0;a < n;a++){			
            	  for(int b = 0;b < n;b++){				
            		  System.out.print(arr[a][b]);			
            		  }			
            	  System.out.println();		
            	  }	
              }
		}	

	