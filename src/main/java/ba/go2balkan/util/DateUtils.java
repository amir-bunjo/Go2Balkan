package ba.go2balkan.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateUtils {
	
	public static String dateTimeToString(DateTime date) {
		return (date.toString(getFormatter()));
	}

	public static Long stringToLong(String date) {
		DateTime parsed = getFormatter().parseDateTime(date);
		return (parsed.getMillis());
	}

	private static DateTimeFormatter getFormatter() {
		return (DateTimeFormat.forPattern("yyyy-MM-dd hh:mm:ss.sss").withZone(DateTimeZone.forID("UTC")));
	}

	public static DateTime stringToDateTime(String asText) {
		DateTimeFormatter f = getFormatter(); //DateTimeFormat.forPattern("yyyy-MM-dd hh:mm:ss.sss").withZone(DateTimeZone.forID("UTC"));
		return f.parseDateTime(asText);
	}
	
	@SuppressWarnings("unused")
	public static DateTime resolve(Object obj){
        if (obj instanceof DateTime){
            return (DateTime)obj;
        }
        else if (obj instanceof Long)
            return resolve((Long)obj);
        else if (obj instanceof String){
            /*try {
                DateTime dt = resolve((String) obj, "EEE MMM dd HH:mm:ss Z yyyy");

                return dt;
            }catch (Exception e){

                try{
                    DateTime dt = resolve((String)obj, "yyyy-MM-dd hh:mm:ss.sss");
                    return  dt;
                }catch (Exception e1){

                    try {
                        DateTime dt1 = resolve((String) obj);
                        return dt1;
                    }catch (Exception e2){

                    }
                }

            }*/
        	
        	String s = (String)obj;
        	DateTime dt = null;
        	List<String> formats =knownDateTimeFormats();
        	for (String format: formats){
        		try{
	        		dt = resolve(s, format);
	        		if (null!=dt){
	        			return dt;
	        		}
        		}catch(Exception e){
        	//		e.printStackTrace();
        		}
        	}
        	if (null==dt){
        		 return resolve(s);
        	}
        	return dt;
        }
        return null;
    }
	
	public static Date getSimpleDateFormat(String pubdate) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
		return formatter.parse(pubdate);
	}
	
	public static List<String> knownDateTimeFormats(){
		// Sun Jul 08 02:48:56 UTC 2012
		// Sun Nov 08 00:18:55 UTC 2009
		return Arrays.asList("yyyy-MM-ddTHH:mm:ssZ", "E MMM dd HH:mm:ss Z yyyy","EEE MMM dd HH:mm:ss Z yyyy","EEE MMM dd hh:mm:ss Z yyyy", "yyyy-MM-dd hh:mm:ss.sss");
	}

    public static DateTime resolve(Long timestamp){
        return new DateTime(timestamp);
    }

    public static DateTime resolve(String datetime){
        return new DateTime(datetime);
    }

    public static DateTime resolve(String datetime, String format){
        /*DateTimeFormatter fmt = DateTimeFormat.forPattern(format).withLocale(Locale.ENGLISH);
        DateTime dt = fmt.parseDateTime(datetime).toDateTime(DateTimeZone.UTC);
        return dt;*/
    	return resolve(datetime, format, Locale.ENGLISH);
    }
    
    public static DateTime resolve(String datetime, String format, Locale locale){
        DateTimeFormatter fmt = DateTimeFormat.forPattern(format).withLocale(locale);
        DateTime dt = fmt.parseDateTime(datetime).toDateTime(DateTimeZone.UTC);
        return dt;
    }

}
