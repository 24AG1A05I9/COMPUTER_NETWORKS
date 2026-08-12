import java.util.*;
public class characterCount{
			public static void main(String[] args){
					Scanner sc = new Scanner(System.in);
					System.out.println("enter the data");
					String data = sc.next();
					System.out.println("enter the genetor");
					String genetor = sc.next();
					
					int dataCount = data.length();
					int genetorCount = genetor.length();
					
					int crcCount = genetorCount -1;
					
					System.out.println("dataCount : " +  + dataCount );
					System.out.println("genetorCOunt : " + genetorCount + " ");
					
					System.out.println("crc count  :" + crcCount);
			}
}
