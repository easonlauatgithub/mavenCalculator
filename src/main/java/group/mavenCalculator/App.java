package group.mavenCalculator;

public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World! It's App" );
    }
	int ans = 0;
	public int funcAdd(int a, int b){
		System.out.println("funcAdd Before a:"+a+", b:"+b+", ans1:"+ans);
		ans=a+b;
		System.out.println("funcAdd After a:"+a+", b:"+b+", ans1:"+ans);
		return ans;
	}
	public int funcMinus(int a, int b){
		System.out.println("funcAdd Before a:"+a+", b:"+b+", ans1:"+ans);
		ans=a-b;
		System.out.println("funcAdd After a:"+a+", b:"+b+", ans1:"+ans);
		return ans;
	}

}
