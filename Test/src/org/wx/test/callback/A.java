import com.sun.jna.Callback;

/**
 * @ClassName:     A.java
 * @Description:   TODO
 * 
 * @author
         xiang_wang

 * @version
        V1.0  
 * @Date           2018年10月23日 下午8:28:10 
 */

/**
 * @author xiang_wang
 *
 */

public class A implements CallBack{
	private B b = new B();
	
	public static void main(String[] args) {
		A a = new A();	
		a.b.f(a);
	}

	/* (non-Javadoc)
	 * @see CallBack#say()
	 */
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("this is callback fun of A.");
	}
}
