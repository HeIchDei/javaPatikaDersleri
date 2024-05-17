public class MyList<T> {

	private T[] arr;
	private int capacity;
	private int cursor;

	public MyList() {
		this.capacity = 10;
		this.cursor = 0;
		this.arr = (T[]) new Object[this.capacity];
	}

	public MyList(int capacity) {
		this.capacity = capacity;
		this.cursor = 0;
		this.arr = (T[]) new Object[this.capacity];
	}

	public int size() {
		int num = 0;
		if (this.arr == null) {
			return 0;
		}
		for (T i : this.arr) {
			if (i != null) {
				num++;
			}
		}
		return num;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		T[] newArr = (T[]) new Object[capacity];
		System.arraycopy(this.arr, 0, newArr, 0, this.arr.length);
		this.arr = newArr;
		this.capacity = capacity;
	}

	public void add(T data) {
		if (this.cursor > this.capacity-1) {
			setCapacity(this.capacity*2);
		}
		this.arr[this.cursor] = data;
		this.cursor++;
	}

}
