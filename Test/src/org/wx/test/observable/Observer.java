package org.wx.test.observable;

public interface Observer {
	public void update(long temperature, long humidity, long pressure);
}
