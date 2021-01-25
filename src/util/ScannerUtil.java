package util;

import java.util.Scanner;

public class ScannerUtil {
	
	@SuppressWarnings("resource")
	public static String lerTexto(String mensagem) throws Exception {
		System.out.println(mensagem);
		return new Scanner(System.in).nextLine();
	}
	
	
	@SuppressWarnings("resource")
	public static Integer lerInteiro(String mensagem) throws Exception {
		System.out.println(mensagem);
		return Integer.parseInt(new Scanner(System.in).nextLine());
	}
	
}
