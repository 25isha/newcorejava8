package basic;

public class BufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hey");
		sb.append(" hi");
		System.out.println(sb);
		
		sb.capacity();
		System.out.println(sb);
		
		sb.replace( 0, 4, "BE");
		System.out.println(sb);
		
		sb.delete(2, 4);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.insert(1, 'i');
		System.out.println(sb);
		
		
	}

}
