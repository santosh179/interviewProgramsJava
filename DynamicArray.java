package array;

public class DynamicArray<String> {
	
	private Object[] data;
	private int InitialCapacity;
	private int size;
	
	public DynamicArray(int initialCapacity){
		this.InitialCapacity = initialCapacity;
		data = new Object[initialCapacity];	
		this.size=0;
	}
	
	public int capacity() {
		return this.InitialCapacity;
	}
	
	public void add(Object value) {		
		data[size] = value;
		size++;		
	}
	
	public Object get(int index) {
		return (Object) data[index];
	}
	
	public void set(int index,Object val) {
		data[index] = val;
	}
	
	public int size() {
		return size;
	}
	
	public void insert(int pos,Object value) {
		if(this.InitialCapacity == size) {			
			reSize();
		}		
		for(int j=size;j > pos;j--) {
			data[j] = data[j-1];
		}		
		data[pos] = value;		
		this.size++;
	}
	
	public void reSize() {
		Object[] newArray = new Object[this.InitialCapacity*2];		
		for(int i=0;i<this.size;i++) {
			newArray[i]=this.data[i];
		}		
		this.data = newArray;
		this.InitialCapacity = this.InitialCapacity*2;
	}
	
	public void delete(int pos) {		
		for(int j = pos;j<size - 1;j++) {
			data[j]=data[j+1];			
		}
		this.size--;		
	}
	
	public boolean contains(Object val) {
		for(int i=0;i<size;i++) {
			if(data[i]==val) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean isEmpty() {
		return (this.size==0);
	}
	
	public void printArray() {
		for(int i=0;i<size;i++) {
			System.out.print(this.data[i]+",");
		}
		System.out.println("");
	}

}
