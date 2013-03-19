
package javabasic;

public class JavaBasic {


	public static void main(String[] args) {
		ProtoList p = new ProtoList();
		
		p.push("San Services");
		p.push("Java");
		p.push("Daba");
		p.push("Doo");
		p.push("Sandals");
		p.inspect();
		
		F.log("\n\n=====\n");
		p.pop();
		p.inspect();
	}
}
