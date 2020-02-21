import java.util.Scanner;

public class Constructor {
	public static void Builder() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = input.nextInt();
		//Tool values
		int S = N;
		int n = N;
		int k = N;
		int c = N;
		int p = 1;
		int HalfOfN = N/2;
		int r = N - HalfOfN;
		int u = N + (HalfOfN-1)*2;
		
		
		if(N%2 == 0 || N<2 || N>10000) {
			System.out.print("Wrong Values");
		}
		else {
		//Upper Part
		
		for (int Rows = 0; Rows<=HalfOfN;Rows++) {
			
			//First M
			for(S = n;S != 0; S--) {
				print("-");
			}
			for(int i = 0;i<k;i++)
			{
				print("*");
			}
			for(int i = 0;i<c;i++)
			{
				print("-");
			}
			for(int i = 0;i<k;i++)
			{
				print("*");
			}
			
			//Space between Ms
			for(S = n;S != 0; S--) {
				print("-");
			}
			for(S = n;S != 0; S--) {
				print("-");
			}
			//Second M
			for(int i = 0;i<k;i++)
			{
				print("*");
			}
			for(int i = 0;i<c;i++)
			{
				print("-");
			}
			for(int i = 0;i<k;i++)
			{
				print("*");
			}
			for(S = n;S != 0; S--) {
				print("-");
			}
			//System Part
			c=c-2;
			k=k+2;
			n--;
			System.out.println();
		}
		
		//Down Part
		
		for(int Rows = 0;Rows<HalfOfN+1;Rows++) {
			//First M
			for(int i = 1;i<r;i++) {
				print("-");
			}
			for(int i = 0;i<N;i++) {
				print("*");
			}
			for(int i = 1;i<=p;i++) {
				print("-");
			}
			    print("*");
			for(int i = 0;i<u+1;i++) {
				print("*");
			}
			for(int i = 1;i<=p;i++) {
				print("-");
			}
			for(int i = 0;i<N;i++) {
				print("*");
			}
			//Space between M
			for(int f = 0;f<2; f++) {
			for(int i = 0;i<n;i++) {
				print("-");
			}
			}
			//Second M
			for(int i = 0;i<N;i++) {
				print("*");
			}
			for(int i = 1;i<=p;i++) {
				print("-");
			}
			    print("*");
			for(int i = 0;i<u+1;i++) {
				print("*");
			}
			for(int i = 1;i<=p;i++) {
				print("-");
			}

			for(int i = 0;i<N;i++) {
				print("*");
			}
			for(int i = 1;i<r;i++) {
				print("-");
			}
			
			
			
			//System Part
			System.out.println();
			r--;
			p=p+2;
			u=u-2;
			n=n-1;
			
		}
		}
	
	}
	
	public static void print(String i) {
		System.out.print(i);
	}
		
	}


