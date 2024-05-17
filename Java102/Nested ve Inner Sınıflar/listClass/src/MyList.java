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
		if (this.cursor > this.capacity - 1) {
			setCapacity(this.capacity * 2);
		}
		this.arr[this.cursor] = data;
		this.cursor++;
	}

	public T get(int index) {
		if (index > this.capacity) {
			return null;
		}
		return this.arr[index];
	}

	public void remove(int index) {
		if (index >= 0 && index <= this.capacity) {
			for (int i = index + 1; i < this.arr.length; i++) {
				this.arr[i - 1] = this.arr[i];
			}
			this.arr[index] = null;
		}
		this.cursor -= 1;
	}

	public void set(int index, T data) {
		if (index >= 0 && index <= this.capacity) {
			this.arr[index] = data;
		}
	}

	public String toString() {
		String str = "[";
		if (arr[0] != null) {
			str += this.arr[0];
		}
		for (int i = 1; i < capacity; i++) {
			if (arr[i] != null) {
				str += "," + this.arr[i];
			}
		}
		return str + "]";
	}

	public int indexOf(T data) {
		for (int i = 0; i < capacity; i++) {
			if (this.arr[i] != null) {
				if (this.arr[i].equals(data)) {
					return i;
				}
			}
		}
		return -1;
	}

	public int lastIndexOf(T data) {
		for (int i = cursor - 1; i >= 0; i--) {
			if (this.arr[i].equals(data)) {
				return i;
			}
		}
		return -1;
	}

	public boolean isEmpty() {
		for (T i : this.arr) {
			if (i != null) {
				return false;
			}
		}
		return true;
	}

	public T[] toArray() {
		return this.arr;
	}

	public void clear() {
		for (int i = 0; i < this.capacity; i++) {
			this.arr[i] = null;
		}
	}

	public MyList<T> subList(int start, int finish) {
		MyList<T> newArr = new MyList<>();
		for (int i = start; i <= finish; i++) {
			newArr.arr[i] = this.arr[i];
		}
		return newArr;
	}

	public boolean contains(T data) {
		for (T i : this.arr) {
			if (i != null) {
				if (i.equals(data)) {
					return true;
				}
			}
		}
		return false;
	}

}
