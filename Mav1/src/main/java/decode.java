import org.apache.commons.codec.binary.Base64;

public class decode {

	public static void main(String[] args) {
		
		String str1 = "Rahul004@";
		
		// encodeBase64 accepts argument in byte format and also return in byte format
		byte[] encodedString = Base64.encodeBase64(str1.getBytes());
		System.out.println("Encoded string is " + new String(encodedString));
		
	}

}
