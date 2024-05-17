package generic;

public class NullableInteger {
	private final Integer value;

	public NullableInteger(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public boolean isNull(){
		return this.getValue() == null;
	}

	public void run(){
		if (this.isNull()){
			System.out.println("Bu degiskene deger atanmamistir");
		}else{
			System.out.println(this.getValue());
		}
	}

}
