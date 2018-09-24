import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) {
    	
        withTask();
        withFutureTask();
    	//System.out.println(Integer.BYTES);
    }
    
    public static void withTask() {
    	ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        Future<Integer> result = executor.submit(task);
        executor.shutdown();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
         
        System.out.println("���߳���ִ������");
         
        try {
            System.out.println("task���н��"+result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
         
        System.out.println("��������ִ�����");
    }
    public static void withFutureTask() {
    	//��һ�ַ�ʽ
        ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
        executor.submit(futureTask);
        executor.shutdown();
         
        //�ڶ��ַ�ʽ��ע�����ַ�ʽ�͵�һ�ַ�ʽЧ�������Ƶģ�ֻ����һ��ʹ�õ���ExecutorService��һ��ʹ�õ���Thread
        /*Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
        Thread thread = new Thread(futureTask);
        thread.start();*/
         
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
         
        System.out.println("���߳���ִ������");
         
        try {
            System.out.println("task���н��"+futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
         
        System.out.println("��������ִ�����");
    }
}

class Task implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println("���߳��ڽ��м���");
        int sum = 0;
        while(true) {           
            sum ++;
            System.out.println(sum);
                
            if (sum == -1) {
            	break;
            }
        }
        
        return sum;
    }
}