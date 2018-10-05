package org.wx.test.singleinstance;

public class EnumSingleInstance {
	
	private EnumSingleInstance() {}
	
	public static EnumSingleInstance getInstance() {
		return Singleton.INSTANCE.getInstance();
	}
	
	private static enum Singleton{
		INSTANCE;
		
		private EnumSingleInstance enumSingleInstance;
		
		private Singleton() {
			enumSingleInstance = new EnumSingleInstance();
		}
		
		public EnumSingleInstance getInstance() {
			return enumSingleInstance;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(EnumSingleInstance.getInstance().hashCode());
		System.out.println(EnumSingleInstance.getInstance().hashCode());
	}
}
