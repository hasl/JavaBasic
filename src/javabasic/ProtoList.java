
package javabasic;

public class ProtoList extends List {
	private class Element {
		public Element prev;
		public Element next;
		public Object value;
		
		public Element(Object v) {
			this.value = v;
		}
	}
	
	protected Element tail;
	protected Element head;

	public ProtoList() {
		this.size = 0;
	}
	
	@Override
	public void push(Object x) {
		Element e = new Element(x);
	
		if (size > 0) {
			this.head.next = e;
			e.prev = this.head;
		}
		if (size == 0) {
			this.tail = e;
		} else
		if (size == 1) {
			this.tail.next = e;
			e.prev = this.tail;
		}
		
		this.head = e;
		this.size++;
	}

	@Override public void pop() {
		Element e = this.tail.next;
		this.tail = e;
		this.tail.prev = null;
	}
	
	public void inspect() {
		inspectSingle(this.tail);
		
		F.log("\nLast:");
		F.log(this.head.value);
		
		F.log("\nFirst:");
		F.log(this.tail.value);
	}
	
	private void inspectSingle(Element e) {
		if (e != null) {
			F.log(e.value);
			
			inspectSingle(e.next);
		}
	}
}
