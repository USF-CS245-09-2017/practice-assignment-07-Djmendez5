
public class Hashnode {
String key;
String value;

Hashnode next;

public Hashnode(String key, String value) {
	this.key=key;
	this.value= value;
	next = null;
	}

/*public String get(String key) {
	//fix hashCode
	int pos = key.hashCode()% arr.length;
	Hashnode temp = arr[pos];
	while(temp!=null) {
		if(temp.key==key)
			return temp.value;
		temp =temp.next;
	}
return null;
}*/

}
