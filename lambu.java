package xam;

interface voca{
	public String show();
}


public class lambu {

	public static String allow(){
		return "lini";
	}
	
	
	public static void push(voca v)
	{
            	String res =v.show();	
	            System.out.println(res);
                    System.out.println(res);
                    System.out.println(res);
                    System.out.println(res);
                    System.out.println(res);
                    System.out.println(res);
	}
	
	public static void main(String[] args){
		
		
		voca vo = lambu :: allow;
		
		lambu.push(vo);
		
	}
	
	
	
	
	
	
}
