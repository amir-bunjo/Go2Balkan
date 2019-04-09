package ba.go2balkan.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class SerializationUtils {

	
	public static Object deserialize(byte[] b) throws Exception {
		try {

			ByteArrayInputStream bi = new ByteArrayInputStream(b);
			ObjectInputStream si = new ObjectInputStream(bi);
			return si.readObject();
		} catch (Exception e) {
			throw new Exception("Deserialization error", e);
		}
	}
	
	public static Object deserialize(String serializedObject) throws Exception {
		// byte b[] = serializedObject.getBytes();
		byte[] bytes = Base64.getDecoder().decode(serializedObject);//.decode(serializedObject.getBytes());
		return deserialize(bytes);

	}

	public static byte[] serializeToBytes(Object o) throws Exception {
		try {
			ByteArrayOutputStream bo = new ByteArrayOutputStream();
			ObjectOutputStream so = new ObjectOutputStream(bo);
			so.writeObject(o);
			so.flush();
			return bo.toByteArray();
		} catch (Exception e) {
			throw new Exception("Serialization error", e);
		}
	}

	public static String serialize(Object o) throws Exception {
		byte[] barr = serializeToBytes(o);
		String encoded = new String(Base64.getEncoder().encodeToString(barr));
		return encoded;
	}
	
	
	
}
