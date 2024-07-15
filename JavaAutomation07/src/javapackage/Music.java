package javapackage;

public class Music extends Guitar {
	
	public static void playmusic()
	{
		System.out.println("Intruments are Playing");

	}

	public static void main(String[] args) {
		
		Music m1=new Music();
		m1.playmusic();
		Guitar g1=new Guitar();
		g1.playmusic();
		

	}

}
