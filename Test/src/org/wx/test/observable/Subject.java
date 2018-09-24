package org.wx.test.observable;

public interface Subject {
	public void register(Observer observer);
	public void unRegister(Observer observer);	
}
