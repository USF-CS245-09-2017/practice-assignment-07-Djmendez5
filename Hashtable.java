
public class Hashtable {
	Hashnode[]arr = new Hashnode[10];
	private int elements;

	public void put(String key, String val) {
	Hashnode node = new Hashnode(key, val);
	int pos = key.hashCode() % arr.length;
	Hashnode temp =  arr[pos];
	
	while(temp != null) {
		if(temp.key.equals(key)) {
			temp.value = val;
			return;
		}
	temp= temp.next;
	}
	elements++;
	temp = arr[pos];
	node.next =temp;
	arr[pos] = node;
	
	}

	public Object get(String key) {
		int pos = key.hashCode()% arr.length;
		Hashnode temp = arr[pos];
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return temp.value;
			}
			temp =temp.next;
		}
		return null;
	}

	public String remove(String key) throws Exception {
		int pos= key.hashCode() %arr.length;
		Hashnode temp = arr[pos];
		Hashnode prev = null;
		if(temp!=null) {
		while(temp!= null) {
			if(temp.key.equals(key)) {
				break;
			}
			prev = temp;
            temp = temp.next;
		}
		}
		else if(temp==null) {
			throw new Exception("not found");
		}
		elements--;
		if(prev!=null) {
			prev.next = temp.next;
		}
		else {
			arr[pos]= temp.next;
		}
		return temp.value;
	}

	public boolean containsKey(String key) {
		int pos= key.hashCode() %arr.length;
		Hashnode temp = arr[pos];
		if(temp!=null) {
		while(temp!= null) {
			if(temp.key.equals(key)) {
				return true;	
			}
            temp = temp.next;
		}
		}
		return false;
		//return false;
	}

}
	

