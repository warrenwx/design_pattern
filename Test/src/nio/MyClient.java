package nio;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class MyClient {
	private static final int BUFFER_SIZE = 1024;	
	static InputStreamReader isr = new InputStreamReader(System.in);
	
	public static void main(String[] args) throws IOException {

		logger("Starting MyClient...");
		SocketChannel myClient = null;
		try {
			int port = 9999;
			myClient = SocketChannel.open(new InetSocketAddress(InetAddress.getLocalHost(), port));

			logger(String.format("Trying to connect to %s:%d...", InetAddress.getLocalHost(), port));
			while(true) {
				char[] cbuf = new char[1024];
				isr.read(cbuf);
				ByteBuffer myBuffer = ByteBuffer.allocate(BUFFER_SIZE);
				myBuffer.put(new String(cbuf).getBytes());
				myBuffer.flip();
				int bytesWritten = myClient.write(myBuffer);
				logger(String.format("Sending Message...: %s bytesWritten...: %d\n", cbuf.toString(), bytesWritten));
			}					
		} catch (IOException e) {
			logger(e.getMessage());
			e.printStackTrace();
		}finally {
			logger("Closing Client connection...");
			myClient.close();
		}
	}

	public static void logger(String msg) {
		System.out.println(msg);
	}
}