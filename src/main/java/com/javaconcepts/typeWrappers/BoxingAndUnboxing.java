/*Type Wrappers -> Classes that encapsulate a primitive type within an object*/
/*Java Type Wrappers -> Double, Float, Long, Integer, Short, Byte, Character, Boolean*/
package com.javaconcepts.typeWrappers;

public class BoxingAndUnboxing {

	public static void main(String[] args) {

		// "Character" wrapper class
		// encapsulating the character within the "Character" wrapper class (Boxing)
		Character ch = Character.valueOf('\u00A9');
		// extracting the character from the "Character" wrapper class (Unboxing)
		System.out.println(ch.charValue());
		System.out.println("*****************************************************");

		// "Boolean" wrapper class
		// encapsulating the boolean within the "Boolean" wrapper class (Boxing)
		Boolean boolean1 = Boolean.valueOf(true);
		Boolean boolean2 = Boolean.valueOf("FALSE");
		// extracting the boolean from the "Boolean" wrapper class (Unboxing)
		System.out.println(boolean1.booleanValue());
		System.out.println(boolean2.booleanValue());
		System.out.println("*****************************************************");

		// Numeric Data Type Wrappers
		// "Byte","Short", "Integer", "Long", "Float", "Double"
		// All of them inherit the "Number" abstract class
		// valueOf() method can take the primitive type and String
		// Byte
		Byte byte1 = Byte.valueOf((byte) 24);
		Byte byte2 = Byte.valueOf("24");
		System.out.println(byte1.byteValue());
		System.out.println(byte2.byteValue());
		System.out.println("*****************************************************");
		// Short
		Short short1 = Short.valueOf((short) 26);
		Short short2 = Short.valueOf("26");
		System.out.println(short1.shortValue());
		System.out.println(short2.shortValue());
		System.out.println("*****************************************************");
		// Int
		Integer int1 = Integer.valueOf(100);
		Integer int2 = Integer.valueOf("100");
		// Integer int3 = Integer.valueOf("Hello");
		// ->This will throw NumberFormatException
		System.out.println(int1.intValue());
		System.out.println(int2.intValue());
		// System.out.println(int3.intValue());
		System.out.println("*****************************************************");
		// Long
		Long long1 = Long.valueOf(2000);
		Long long2 = Long.valueOf("2000");
		System.out.println(long1.longValue());
		System.out.println(long2.longValue());
		System.out.println("*****************************************************");
		// Float
		Float float1 = Float.valueOf((float) 20.42);
		Float float2 = Float.valueOf("20.42");
		System.out.println(float1.floatValue());
		System.out.println(float2.floatValue());
		System.out.println("*****************************************************");
		// Double
		Double double1 = Double.valueOf(42.3);
		Double double2 = Double.valueOf("42.3");
		System.out.println(double1.floatValue());
		System.out.println(double2.floatValue());
		System.out.println("*****************************************************");
	}

}
