
public class main {

	public static void main(String[] args) {
		int sum = 0;
		int subtractAmount = 1000;
		int val = 1002001;
		while(val > 1)
		{
			for(int i = 0; i < 4; i++)
			{
				sum += val;
				val -= subtractAmount;
			}
			subtractAmount-= 2;

		}
		sum++;

		System.out.println(sum);


	}

}
