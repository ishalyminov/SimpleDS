/* @description This class implements reusable methods for logging information.
 * 
 * @history 2.Nov.2015 Beta version
 *              
 * @author <ahref="mailto:h.cuayahuitl@gmail.com">Heriberto Cuayahuitl</a>
 */

package simpleDS.util;


import java.util.HashMap;
import java.util.Map;

public class Logger {
	public static String systemLevel = "debug";

	public static Map<String, Integer> levelMapping = new HashMap();

	static {
		levelMapping.put("debug", 0);
		levelMapping.put("info", 1);
		levelMapping.put("warning", 2);
		levelMapping.put("error", 3);
	}

	public static void debug(String className, String method, String message) {
		if (!Logger.checkLevel("debug")) {
			return;
		}
		System.out.println("[DEB] " + className + "." + method + "(): " + message);
	}

	public static void info(String className, String method, String message) {
		if (!Logger.checkLevel("info")) {
			return;
		}
		System.out.println("[INF] " + className + "." + method + "(): " + message);
	}

	public static void warning(String className, String method, String message) {
		if (!Logger.checkLevel("warning")) {
			return;
		}
		System.out.println("[WAR] ------------------------------------------------------------------");
		System.out.println("[WAR] " + className + "." + method + "(): " + message);
		System.out.println("[WAR] ------------------------------------------------------------------");
	}

	public static void error(String className, String method, String message) {
		if (!Logger.checkLevel("error")) {
			return;
		}
		System.out.println("[ERR] ******************************************************************");
		System.out.println("[ERR] " + className + "." + method + "(): " + message);
		System.out.println("[ERR] ******************************************************************");
		System.exit(0);
	}

	public static boolean checkLevel(String inLevel) {
		return levelMapping.get(systemLevel) <= levelMapping.get(inLevel);
	}

}
