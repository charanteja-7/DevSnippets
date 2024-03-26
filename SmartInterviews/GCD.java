public class Main
{
    public static int gcd(int a, int b){
        if(a<=0){
            return b;
        }
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        return gcd(a%b,b);
    }
	public static void main(String[] args) {
		System.out.println(gcd(24,36));
	}
}
