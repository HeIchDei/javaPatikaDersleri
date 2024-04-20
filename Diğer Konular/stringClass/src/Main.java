import java.util.Arrays;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		String str = "patika.dev";
		String patika = "      patİKa         ";
		String[] sp = str.split("a");

		System.out.println(str.charAt(2));
		System.out.println(str.codePointAt(1)); // current characters ascii code
		System.out.println(str.codePointBefore(1)); // previous characters ascii code

		System.out.println(str.compareTo(patika)); // ascii code farkini dondurur, if = 0 esit stringlerdir
		System.out.println(patika.compareToIgnoreCase(str)); // case insensitive compare

		System.out.println(str.concat(".dev")); // add to the end

		System.out.println(str.contains("pa")); // is in?

		System.out.println(str.startsWith("pat")); //startswith
		System.out.println(str.endsWith("ka")); //endsWith

		System.out.println(str.equals(patika)); // equals
		System.out.println(str.equalsIgnoreCase(patika)); //case insensitive equals

		System.out.println(str.indexOf('a')); // buldugu ilk degerin indexini dondurur
		System.out.println(str.lastIndexOf('a')); // buldugu son degerin indexini dondurur

		System.out.println(str.isEmpty());
		System.out.println(str.length()); // uzunlugu

		System.out.println(str.replace('a','b')); //replace
		System.out.println(str.replaceFirst("a","b")); //replace first only
		System.out.println(str.replaceAll("a","b")); // replace but with REGEX

		System.out.println(Arrays.toString(sp));

		System.out.println(str.substring(2, 6)); // return a substring
		System.out.println(patika.toLowerCase());
		System.out.println(patika.toUpperCase());

		System.out.println(patika.trim()); // whitespace deleter




	}
}