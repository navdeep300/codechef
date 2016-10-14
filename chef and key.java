import java.util.*;

	class CHEFKEY{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int t, n, m, c, i, j, x, y,count=0;
	t= sc.nextInt();
	while(t-->0){
		n= sc.nextInt();
		m= sc.nextInt();
		c= sc.nextInt();
		count= 0;
		for(i=1;i<=n;++i)
		{
			if(c%i==0 && c/i <=m)
			{
				++count;
			}
		}
			System.out.println(count);
	}
	}
}

