package ba.go2balkan.util;

import org.apache.log4j.Logger;
/*import org.codehaus.jackson.*;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.KeyDeserializer;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.codehaus.jackson.map.module.SimpleAbstractTypeResolver;
import org.codehaus.jackson.map.module.SimpleModule;
import org.codehaus.jackson.map.type.MapType;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.type.TypeReference;*/

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.datatype.joda.JodaModule;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class JsonUtils {
	
	private static Logger LOG = Logger.getLogger(JsonUtils.class);

	public static Object getDeserializedFromBytes(byte[] buffer, Class<?> objType){
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		mapper.registerModule(new JodaModule());
		try {
			Object o =	mapper.readValue(buffer, objType);
			return o;
		} catch (JsonParseException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (JsonMappingException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (IOException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		}

		return null;
	}

	public static byte[] getSerializedToBytes(Object value){
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JodaModule());
		try {
			byte[] o =	mapper.writeValueAsBytes(value);
			return o;
		} catch (JsonParseException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (JsonMappingException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (IOException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		}

		return null;
	}

	public static <T> Object getObjectFromJson(String jsonString,Class<?> objType, Map<Class<T>, Class<? extends T>> typeMap, Class[] subtypes){
		ObjectMapper mapper = new ObjectMapper();
		//mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		
		Version version = Version.unknownVersion();// new Version(1, 0, 0, "SNAPSHOT"); // maven/OSGi style version
		SimpleModule module = new SimpleModule("MyModuleName", version);
		
		SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
		
		if (null!=typeMap){
			for (Entry<Class<T>, Class<? extends T>> entry: typeMap.entrySet()){
				resolver.addMapping(entry.getKey(),entry.getValue());
			}
		}
		module.setAbstractTypes(resolver);
		mapper.registerModule(module);
		
		mapper.registerModule(new JodaModule());
		
		if (null!=subtypes)
			mapper.registerSubtypes(subtypes);
		
		try {
			Object o =	mapper.readValue(jsonString, objType);
			return o;
		} catch (JsonParseException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (JsonMappingException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (IOException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		}

		return null;
	}
	
	public static <T> Object getObjectFromJson(String jsonString,Class<?> objType, Map<Class<T>, Class<? extends T>> typeMap){
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		
		Version version = Version.unknownVersion();// new Version(1, 0, 0, "SNAPSHOT"); // maven/OSGi style version
		SimpleModule module = new SimpleModule("MyModuleName", version);
		
		SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
		
		if (null!=typeMap){
			for (Entry<Class<T>, Class<? extends T>> entry: typeMap.entrySet()){
				resolver.addMapping(entry.getKey(),entry.getValue());
			}
		}
		module.setAbstractTypes(resolver);
		mapper.registerModule(module);
		mapper.registerModule(new JodaModule());
		
		try {
			Object o =	mapper.readValue(jsonString, objType);
			return o;
		} catch (JsonParseException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (JsonMappingException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (IOException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		}

		return null;
	}
	
	public static <T> Object getObjectFromJsonListKey(String jsonString, Class<?> objType, KeyDeserializer keyDeserializer){
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,true);
		
		Version version = Version.unknownVersion();// new Version(1, 0, 0, "SNAPSHOT"); // maven/OSGi style version
		SimpleModule module = new SimpleModule("MyModuleName", version);
		
		/*StdSerializerProvider provider = new StdSerializerProvider();
		provider.setDefaultKeySerializer(keyDeserializer);*/
		
		SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
		/*
		if (null!=typeMap){
			for (Entry<Class<T>, Class<? extends T>> entry: typeMap.entrySet()){
				resolver.addMapping(entry.getKey(),entry.getValue());
			}
		}*/
		
		//module.addDeserializer(Map.class, new OLCustomDeserializer());
		module.addKeyDeserializer(List.class, keyDeserializer);
		
		module.setAbstractTypes(resolver);
		mapper.registerModule(module);
		mapper.registerModule(new JodaModule());
		
		try {
			Object o =	mapper.readValue(jsonString, objType);
			return o;
		} catch (JsonParseException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (JsonMappingException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (IOException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		}

		return null;
	}
	
	
	public static Object getObjectFromJson(String jsonString, Class<?> objType){

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		mapper.registerModule(new JodaModule());
		
		try {
			Object o =	mapper.readValue(jsonString, objType);
			return o;
		} catch (JsonParseException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (JsonMappingException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (IOException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		}

		return null;
	}
	
	public static <T> Object getObjectFromJson(String jsonString, TypeReference<T> typeRef){

		ObjectMapper mapper = new ObjectMapper();
		//mapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

		mapper.registerModule(new JodaModule());
		
		try {
			Object o =	mapper.readValue(jsonString, typeRef);
			return o;
		} catch (JsonParseException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (JsonMappingException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (IOException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		}

		return null;
	}

	public static JsonNode getJsonNodeFromString(String jsonString)
	{
		ObjectMapper mapper = new ObjectMapper();
		//JsonFactory factory = mapper.getJsonFactory();
		JsonNode actualObj = null;
		mapper.registerModule(new JodaModule());
		try {
			actualObj = 	mapper.readTree(jsonString);
		} catch (JsonProcessingException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (IOException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));		}
		return actualObj;
	}

	public static JsonNode getJsonNodeByName(String name, JsonNode node)
	{
		JsonNode jsonNode = node.get(name);

		return jsonNode;
	}
	
	public static void writeJsonFromObject(Object object, boolean prityPrint, OutputStream outuptStream){
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);
		//mapper.configure(Feature.FAIL_ON_EMPTY_BEANS, false);	
		if (prityPrint){
		//	mapper.enable(Feature.INDENT_OUTPUT);
			mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		}
		mapper.registerModule(new JodaModule());
			
		try {
			mapper.writeValue(outuptStream, object);		
		} catch (JsonGenerationException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (JsonMappingException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (IOException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		}
	}
	
	public static String getJsonFromObject(Object object, boolean prityPrint){
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);
		//mapper.configure(Feature.FAIL_ON_EMPTY_BEANS, false);	
		if (prityPrint){
		//	mapper.enable(Feature.INDENT_OUTPUT);
			mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		}
		mapper.registerModule(new JodaModule());
		
		
		try {
			return mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (JsonMappingException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (IOException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		}
		return null;

	}
	public static String getJsonFromObject(Object object){
		return getJsonFromObject(object, false);
	}



	public static <T> String getJsonFromObject(Object object, Map<Class<T>, Class<? extends T>> typeMap){
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);
		
		
		//SimpleModule testModule = new SimpleModule("MyModule", new Version(1, 0, 0, null));
		
		Version version = Version.unknownVersion();// new Version(1, 0, 0, "SNAPSHOT"); // maven/OSGi style version
		SimpleModule module = new SimpleModule("MyModuleName", version);
		
		SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
		
		if (null!=typeMap){
			for (Entry<Class<T>, Class<? extends T>> entry: typeMap.entrySet()){
				resolver.addMapping(entry.getKey(),entry.getValue());
			}
		}
		module.setAbstractTypes(resolver);
		mapper.registerModule(module);
		mapper.registerModule(new JodaModule());
		
		try {
			return mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (JsonMappingException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		} catch (IOException e) {
			LOG.info(e.getMessage()+"; stack: "+Arrays.deepToString(e.getStackTrace()));
		}
		return null;

	}

	public static <T> Object getSerializeDeserialize(Object completeUserMessageList,TypeReference<T> typeRef) {
		String json = getJsonFromObject(completeUserMessageList);
		return getObjectFromJson(json, typeRef);
	}

	public static Object getObjectFromJson(String json, Class<? extends Map> mapClass, Class<?> keyClass, Class<?> valueClass) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);
		
		TypeFactory typeFactory = mapper.getTypeFactory();
		MapType mapType = typeFactory.constructMapType(mapClass, keyClass, valueClass);
		
		mapper.registerModule(new JodaModule());
		try {
			Object p = mapper.readValue(json, mapType);
			return p;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static Map<String, Object> getMapFrom(String strJson) {
		return (Map<String, Object>)getObjectFromJson(strJson, Map.class);
	}

}
