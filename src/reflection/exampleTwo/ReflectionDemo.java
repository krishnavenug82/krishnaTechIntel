package reflection.exampleTwo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {

		Class ReflectionHelperclass = ReflectionHelper.class;

		String className = ReflectionHelperclass.getName();
		System.out.println("className = " + className);

		System.out.println("getModifiers = " + ReflectionHelperclass.getModifiers());

		System.out.println("getSuperclass = " + ReflectionHelperclass.getSuperclass());

		System.out.println("getPackage = " + ReflectionHelperclass.getPackage());

		System.out.println(ReflectionHelperclass.isPrimitive());

		Field[] privatefields = ReflectionHelperclass.getDeclaredFields();
		for (Field onefield : privatefields) {
			Field field = ReflectionHelperclass.getDeclaredField(onefield.getName());
			String fieldname = field.getName();
			System.out.println("all the fieldnames in the class:::" + fieldname);
		}

		Method[] methods = ReflectionHelperclass.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println("methods::::" + m.getName());

		}

	}

}
