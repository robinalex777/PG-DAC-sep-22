import java.util.Scanner;


class p7{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int a = sc.nextInt();
		
		
		for(int i=1;i<=a-1;i++){
			
			for(int j=a;j>i;j--){
				
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++){
				
				System.out.print("*");
				
			}
			for(int j=1;j<=i-1;j++){
				
				System.out.print("*");
				
			}
			
			System.out.println("");		
			
		}
		
		
		
		
		for(int i=1;i<=a;i++){

            for(int j=1;j<=i-1;j++){

            System.out.print(" ");

        }
        for(int j=a;j>=i;j--){
	    System.out.print("*");
	 
	  }
	  
	  for(int j=5;j>i;j--){
				
				System.out.print("*");
				
			}
          System.out.println();


}
		
	}
}