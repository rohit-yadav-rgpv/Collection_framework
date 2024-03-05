package datastructure;

import java.util.EnumMap;

public class EnumMapExample {
	
		enum Size{
			SMALL, MEDIUM, LARGE, EXTRALARGE;
		}
		public static void main(String[] args) {
			EnumMap<Size, Integer> enumMap = new EnumMap(Size.class);
			enumMap.put(Size.SMALL, 20);
			enumMap.put(Size.MEDIUM, 30);
			enumMap.put(Size.LARGE, 40);
			
			System.out.println(enumMap);

			System.out.println(Size.MEDIUM);
			System.out.println(enumMap.keySet());
			System.out.println(enumMap.entrySet());
			System.out.println(enumMap.values());
			
		}
}
