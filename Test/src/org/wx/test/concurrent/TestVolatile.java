/**
 * @ClassName:     TestVolatile.java
 * @Description:   TODO
 * 
 * @author
         xiang_wang

 * @version
        V1.0  
 * @Date           2018年10月18日 上午11:21:59 
 */
package org.wx.test.concurrent;

import java.lang.invoke.VolatileCallSite;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xiang_wang
 *
 */
public class TestVolatile {
	private int number = 0;
	private volatile boolean stopped = false;
	Integer integerLock = new Integer(0);
	/** 
	 * @Title:        main 
	 * @Description:  TODO 
	 * @param:        @param args    
	 * @return:       void    
	 * @throws 
	 * @author        xiang_wang
	 * @Date          2018年10月18日 上午11:21:59 
	 * @throws InterruptedException 
	*/
	
	public void A() throws InterruptedException {
		for(int i = 0; i < 50; i ++) {
			Thread thread = new Thread(new Runnable() {							
				@Override
				public void run() {
					for(int i = 0; i < 2; i++) {
						synchronized (integerLock) {
							++ number;
							System.out.println(Thread.currentThread().getName() + " get " + number);
						}											
					}											
				}
			});
			thread.start();
		}
		Thread.sleep(3000);
		System.out.println("finally " + number);
	}
	
	public void B() throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				long begin = System.currentTimeMillis();
				while(!stopped){
					System.out.println(Thread.currentThread().getName() + " running.");
				}
				long end = System.currentTimeMillis();
				System.out.println(Thread.currentThread().getName() + " stopped. live time:" + (end - begin));
			}
		});
		thread.start();
		Thread.sleep(1000);
		stopped = true;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestVolatile testVolatile = new TestVolatile();
		testVolatile.A();
	}

}
