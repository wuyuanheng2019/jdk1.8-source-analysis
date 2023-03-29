import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 *
 * </p>
 *
 * @author wuyuanheng
 * @date 2023-03-29 18:44
 */
public class Main{

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("JDK1.8源码分析!");

		Map<String,String> stringStringMap = new ConcurrentHashMap<> ();
		stringStringMap.put ("1","2");
		System.out.println (stringStringMap);

	}

}
