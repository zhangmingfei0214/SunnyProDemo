package com.sunny.project;

/**
 *人物的实现接口
 */
public interface PersonFactory {
		
		//男孩接口
		public Boy getBoy();
		//女孩接口
		public Girl getGirl();
}
