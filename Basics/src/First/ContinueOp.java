package First;

public class ContinueOp {

	public static void main(String[] args) {
		int lim=10,sum=0;
		for(int i=1;i<=lim;i++)
		{
			if(i%4==0) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);

	}

}
