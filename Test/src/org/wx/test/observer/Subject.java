package org.wx.test.observer;

public interface Subject {
	public void regiter(Observer observer);
	public void unRegister(Observer observer);	
}
