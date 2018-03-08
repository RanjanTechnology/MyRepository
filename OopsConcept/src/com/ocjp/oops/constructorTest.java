package com.ocjp.oops;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class constructorTest {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//ConstructorWithParamentrize constructorWithParamentrize = (ConstructorWithParamentrize) Class.forName("ConstructorWithParamentrize").newInstance();
		
		 String str="Ranjan";
		 Constructor<ConstructorWithParamentrize> constructor = ConstructorWithParamentrize.class.getConstructor(String.class);
		 ConstructorWithParamentrize emp3 = constructor.newInstance(str);
	}
}
