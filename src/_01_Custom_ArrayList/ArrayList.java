package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] list;

	public ArrayList() {
		list = (T[]) new Object[0];

	}

	public void add(T val) {
		T[] add = (T[]) new Object[list.length + 1];
		for (int i = 0; i < list.length; i++) {
			add[i] = list[i];
		}
		add[add.length - 1] = val;
		list = add;
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > list.length) {
			throw new IndexOutOfBoundsException();
		}
		return list[loc];
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] insert = (T[]) new Object[list.length + 1];

		for (int i = 0; i < loc; i++) {
			insert[i] = list[i];
		}
		for (int i = loc; i < list.length; i++) {
			insert[i + 1] = list[i];
		}

		insert[loc] = val;
		list = insert;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		list[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] remove = (T[]) new Object[list.length - 1];
		for (int i = 0; i < list.length; i++) {
			if (i < loc) {
				remove[i] = list[i];
			}
			if (i > loc) {
				remove[i - 1] = list[i];
			}
		}
		list = remove;
	}

	public boolean contains(T val) {
	boolean tof=false;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == val) {
tof=true;
			}
			else {
				tof=false;
			}
		}

		return tof;

	}
	public int size() {
		return list.length;
		
	}
	

}