package ba.go2balkan.util;

import org.apache.commons.lang.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UrlHelper {
	
	/**
	 * Will take a url such as http://www.stackoverflow.com/path?queryString and
	 * return http://www.stackoverflow.com
	 * 
	 * @param url
	 * @return
	 */
	public static String getBaseHost(String url) {
		if (url == null || url.length() == 0)
			return "";

		int doubleslash = url.indexOf("//");
		if (doubleslash == -1)
			doubleslash = 0;
		else
			doubleslash += 2;

		int end = url.indexOf('/', doubleslash);
		end = end >= 0 ? end : url.length();

		int port = url.indexOf(':', doubleslash);
		end = (port > 0 && port < end) ? port : end;

		return url.substring(0, end);
	}

	/**
	 * Will take a url such as http://www.stackoverflow.com and return
	 * www.stackoverflow.com
	 * 
	 * @param url
	 * @return
	 */
	public static String getHost(String url) {
		if (url == null || url.length() == 0)
			return "";

		int doubleslash = url.indexOf("//");
		if (doubleslash == -1)
			doubleslash = 0;
		else
			doubleslash += 2;

		int end = url.indexOf('/', doubleslash);
		end = end >= 0 ? end : url.length();

		int port = url.indexOf(':', doubleslash);
		end = (port > 0 && port < end) ? port : end;

		return url.substring(doubleslash, end);
	}

	/**
	 * Based on :
	 * http://grepcode.com/file/repository.grepcode.com/java/ext/com.google
	 * .android/android/2.3
	 * .3_r1/android/webkit/CookieManager.java#CookieManager.getBaseDomain%28java.lang.String%2
	 * 9 Get the base domain for a given host or url. E.g. mail.google.com will
	 * return google.com
	 * 
	 * @param host
	 * @return
	 */
	public static String getBaseDomain(String url) {
		String host = getHost(url);

		int startIndex = 0;
		int nextIndex = host.indexOf('.');
		int lastIndex = host.lastIndexOf('.');
		while (nextIndex < lastIndex) {
			startIndex = nextIndex + 1;
			nextIndex = host.indexOf('.', startIndex);
		}
		if (startIndex > 0) {
			return host.substring(startIndex);
		} else {
			return host;
		}
	}

	/**
	 * Special case for proxied URLs used for Proxy to PhantomJs - usual case
	 * is: http://localhost:3000/http://asdasdasd.com/asd?asd&Asd etc
	 * 
	 * @param url
	 *            - full url
	 * @return Return stripped last url used as parameter
	 */
	public static String getProxiedParameters(String url) {
		String http = "http://";
		Integer occureces = StringUtils.countMatches(url, "http");
		if (occureces > 1) {
			Integer infexOflastHttp = url.lastIndexOf(http);
			String strippedToLastUrl = url.substring(infexOflastHttp + http.length());
			return strippedToLastUrl;
		} else {
			return url;
		}
	}

	public static Map<String, List<String>> splitQuery(URL url) throws UnsupportedEncodingException {
		return splitQuery(url.getQuery());
	}

	public static Map<String, List<String>> splitQuery(String query) throws UnsupportedEncodingException {
		final Map<String, List<String>> query_pairs = new LinkedHashMap<String, List<String>>();
		final String[] pairs = query.split("&");
		for (String pair : pairs) {
			final int idx = pair.indexOf("=");
			final String key = idx > 0 ? URLDecoder.decode(pair.substring(0, idx), "UTF-8") : pair;
			if (!query_pairs.containsKey(key)) {
				query_pairs.put(key, new LinkedList<String>());
			}
			final String value = idx > 0 && pair.length() > idx + 1
					? URLDecoder.decode(pair.substring(idx + 1), "UTF-8") : null;
			query_pairs.get(key).add(value);
		}
		return query_pairs;
	}

}
