import java.util.*;
class BubbleSort{

	public void print(int a[],int n){
		for(int i=0;i<n;i++){
			System.out.print(" "+a[i]);
		}
		System.out.println();
	}

	public void sort(int a[],int n){
		for(int i=0;i<n;i++){
			for(int j=n-1;i<j;j--){
				if(a[j-1]>a[j]){
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		//a diff Change is
		//done 
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		BubbleSort b=new BubbleSort();
		b.sort(a,n);
		b.print(a,n);
	}
}