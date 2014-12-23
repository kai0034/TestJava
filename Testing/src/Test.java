import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

class EncryptUtils {
	public static final String DEFAULT_ENCODING = "UTF-8";
	static BASE64Encoder enc = new BASE64Encoder();
	static BASE64Decoder dec = new BASE64Decoder();

	public static String base64encode(String text) {
		try {
			String rez = enc.encode(text.getBytes(DEFAULT_ENCODING));
			return rez;
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}// base64encode

	
	public static String base64decode(String text) {

		try {
			return new String(dec.decodeBuffer(text), DEFAULT_ENCODING);
		} catch (IOException e) {
			return null;
		}

	}// base64decode

	
	public static String xorMessage(String message, String key) {
		try {
			if (message == null || key == null)
				return null;

			char[] keys = key.toCharArray();
			char[] mesg = message.toCharArray();

			int ml = mesg.length;
			int kl = keys.length;
			char[] newmsg = new char[ml];

			for (int i = 0; i < ml; i++) {
				newmsg[i] = (char) (mesg[i] ^ keys[i % kl]);
			}// for i
			mesg = null;
			keys = null;
			return new String(newmsg);
		} catch (Exception e) {
			return null;
		}
	}// xorMessage

}

public class Test {

	public static void main(String arg[]) {
		
		Life l = new Human();
		l.printLife();
		
		l.print();

//		String txt = "some text to be encrypted";
//		String key = "key phrase used for XOR-ing";
//		System.out.println(txt + " XOR-ed to: " + (txt = EncryptUtils.xorMessage(txt, key)));
//		String encoded = EncryptUtils.base64encode(txt);
//		System.out.println(" is encoded to: " + encoded
//				+ " and that is decoding to: " + (txt = EncryptUtils.base64decode(encoded)));
//		System.out.print("XOR-ing back to original: " + EncryptUtils.xorMessage(txt, key));
//		
//		
//		char [] chAry = {'A','B','A','A','C','B','X'};
//		String str = "AACCDBAABX";
//		
//		Arrays.sort(chAry);
//		System.out.println(chAry);
//		
//		char [] ch = str.toCharArray();
//		Arrays.sort(ch);
//		System.out.println(fac(1)+"");
		
//		Point p1 = new Point(-1,-2);
//		Rectangle o1 = new Rectangle(4,3,p1);
//		
//		Point p2 = new Point(1,1);
//		Rectangle o2 = new Rectangle(2,2,p2);
//		
//		System.out.println("Intersect: "+o1.isIntersect(o2));
		
		
		

	}
	public static HashMap<String,Integer> mapCharacter(char[] ch){
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int n = 0;
		for(int i=0;i<ch.length;i++){
			
			if(map.containsKey(String.valueOf(ch[i]))){
				String key = String.valueOf(ch[i]);
				int value = map.get(key);
				map.put(key, value);
			}else{
				map.put(String.valueOf(ch[i]), n);
			}
		}
		
		return map;
	}
	
	public static long fac(int num){
				
		long sum=1;
		int n = num;
		for(int i = 1; i < n; i++){
			sum = sum * (num);
			num--;
		}
		
		return sum;
		
	}


}
