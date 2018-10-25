package group.mavenCalculator;

import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest{
	static App app = null;
	@BeforeClass
	public static void beforeClass(){
		System.out.println("----------------------- beforeClass -----------------------");
		app = new App();
		System.out.println(app);
	}
	@Test
    public void test1(){
    	System.out.println("----------------------- quick test -----------------------");
        assertTrue( app.funcAdd(1, 1)==2 );
    }
	@Test
	public void test2(){
    	System.out.println("----------------------- regression test -----------------------");
        assertTrue( app.funcAdd(1234, 1)==1235 );
    }
	@Test
	public void test3(){
    	System.out.println("----------------------- smoke test -----------------------");
        assertTrue( app.funcAdd(1234, 4321)==5555 );
    }

}
