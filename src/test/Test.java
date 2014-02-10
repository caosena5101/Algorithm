package test;

public class Test {
	
	public void tt(){
		String s="q4";
		System.out.println("s");
	}
	
	public static void main(String[] args) throws Exception, NoSuchMethodException{
		String str="124";
		System.out.println(new Test().getClass().getMethod("tt"));
	}

}
