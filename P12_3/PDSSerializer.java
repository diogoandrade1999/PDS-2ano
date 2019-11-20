package P12_3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PDSSerializer {

	public static String fromObject(Object o) {
		/*String var = "";
		Class cl = o.getClass();
		//Explore os metodos
		Method[] methods = cl.getMethods();
		Field[] fields = cl.getDeclaredFields();
		//Veja o javadoc das classes: Class, Method, Field, Modifier
		
		for(Method m : methods) {
			var += m + "\n";
		}
		var+="\n";
		for(Field f : fields) {
			var += f + "\n";
		}*/
		return o.toString();
	}

}
