package datastructure;

import java.util.EnumSet;

public class EnumSetExample {
	
		enum Size{
			SMALL, MEDIUM, LARGE, EXTRALARGE;
		}
		public static void main(String[] args) {
			EnumSet<Size> enumSet = EnumSet.allOf(Size.class);
			System.out.println(enumSet);
			
			EnumSet<Size> enumSet1 = EnumSet.noneOf(Size.class);
			System.out.println(enumSet1);
			
			EnumSet<Size> enumSet2 = EnumSet.range(Size.MEDIUM,Size.EXTRALARGE);
			System.out.println(enumSet2);
		}
}
