package org.wx.test.singleinstance.serviceprovider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ServiceManager {
	
	public static Map<String, Provider> mp = new ConcurrentHashMap<>();
	
	public static void registerProvider(String name, Provider provider) {
		mp.put(name, provider);
	}
	
	public static Service getInstance(String name) {
		Provider provider = mp.get(name);
		if (provider == null) {
			return null;
		}
		
		return provider.newService();
	}
	
	public static void main(String[] args) {
		CustomProvider provider = new CustomProvider();
		ServiceManager.registerProvider("custom_service", provider);
		
		try {
			Service cuService = ServiceManager.getInstance("custom_service");
			cuService.connect();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
