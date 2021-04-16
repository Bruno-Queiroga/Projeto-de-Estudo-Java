package fundamentos;

public class CoversacaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		double a = 1; // convergencia implicita, poderia ser utilizando int porém double por ser maior a convercao não prejudica, caso fosse decimal teriamos
		//sim para conversao de double para int
		System.out.println(a);
		
		float b = 1.0F; // é inserido F após o númeral para torna o literal em float ( conversao inplicita)
		float c = (float)2.0; //outro meio de declarar a conversao de tipos usando float ( conversao explicita = CAST)
		System.out.println(b);
		System.out.println(c);
		
		int d= 4;
		byte e =(byte) d;
		System.out.println(e);
		
		double f = 1.9999999;
		int g = (int) f;
		System.out.println(g);
		
	}

}
