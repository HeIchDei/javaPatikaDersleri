public class Main {
	public static void main(String[] args) {
		int num = 9;
		String space;
		String star;
		int spaceCount, starCount;
		String result;

		for(int i=1; i<=num; i++){

			//spaces
			spaceCount = i - ((num/2)+1);
			spaceCount *= spaceCount<0 ? -1 : 1;
			space = "";
			for(int j=1; j<=spaceCount; j++){
				space += " ";
			}

			//stars
			starCount = num-(spaceCount*2);
			star = "";
			for(int j=1; j<=starCount; j++){
				star += "*";
			}

			result = space+star;
			System.out.println(result);

		}

	}
}