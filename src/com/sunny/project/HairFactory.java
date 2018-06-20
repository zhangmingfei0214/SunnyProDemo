package com.sunny.project;

import java.util.Map;

/**
 *发型工厂
 */
public class HairFactory {
	
	/**
	 * @param key
	 * @return
	 */
	public HairInterface getHair(String key) {
		if("left".equals(key)) {
			return new LeftHair();
		} else if("right".equals(key)) {
			return new RightHair();
		}
		return null;
	}
	
	/**
	 * 根据类的名称生产对象
	 * @param className
	 * @return
	 * @throws Exception
	 */
	public HairInterface getHairByClass(String className) throws Exception {
		try {
			HairInterface hair = (HairInterface) Class.forName(className).newInstance();
			return hair;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	/**
	 * 根据类的键值生产对象
	 * @param key
	 * @return
	 */
	public HairInterface getHairByClassKey(String key) {
		Map<String, String> map = new PropertiesReader().getProperties();
		try {
			HairInterface hair = (HairInterface) Class.forName(map.get(key)).newInstance();
			return hair;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
