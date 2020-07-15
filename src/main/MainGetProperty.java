package main;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MainGetProperty {
	public static void main(String[] args) {
	
		System.out.println("Pasta padr�o do usu�rio:				" + System.getProperty("user.home"));
		System.out.println("Caractere separador de arquivo:			" + System.getProperty("file.separator"));
		System.out.println("Caractere separador de caminhos:		" + System.getProperty("path.separator"));
		System.out.println("Usu�rio que est� rodando o aplicativo:	" + System.getProperty("user.name"));
		System.out.println("Caminho do diret�rio temp:				" + System.getProperty("java.io.tmpdir"));
				
		System.out.println("Vers�o do JRE:							" + System.getProperty("java.version"));
		System.out.println("Vers�o da especifica��o do JRE:			" + System.getProperty("java.specification.version"));
		System.out.println("Vers�o da JVM:							" + System.getProperty("java.vm.specification.version"));
		System.out.println("Vers�o da implementa��o da JVM:			" + System.getProperty("java.vm.version"));
		System.out.println("Diret�rio de instala��o do Java:		" + System.getProperty("java.home"));
		System.out.println("Caminho das bibliotecas (library):		" + System.getProperty("java.library.path"));
		
		System.out.println("Pasta de onde foi lan�ado o aplicativo:	" + System.getProperty("user.dir"));
		System.out.println("Caminho das classes do aplicativo:		" + System.getProperty("java.class.path"));
		System.out.println("Nome do SO:								" + System.getProperty("os.name"));
		System.out.println("Arquitetura do SO:						" + System.getProperty("os.arch"));
		System.out.println("Vers�o do SO:							" + System.getProperty("os.version"));
		
		System.out.println("Teste de Branch");
		
		/*Path pathDir = Paths.get("C:\\Users\\Public\\Downloads\\NovaPasta");
		System.out.println("Caminho para downloads publicos: 	"+ pathDir);
		boolean pathExists = Files.exists(pathDir);
		try {
		if(!pathExists) {
			System.out.println("O caminho n�o existe e ser� criado!");
			Path novoDir = Files.createDirectories(pathDir);
		}else {

			System.out.println("O caminho existe e ser� criado um arquivo");
		}
		}catch(IOException e){
		
			e.printStackTrace();
		}
		*/
		Path start = Paths.get("C:\\Users\\2018100856\\OneDrive - Complexo de Ensino Superior do Brasil LTDA\\Pr�tica de Sistemas de Informa��o");
		int maxDepth = 5;
		try {
			Stream<Path> stream = Files.find(
					start,
					maxDepth,
					(path, attr) -> String.valueOf(path).endsWith(".java"));
			stream.sorted().forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			
		
	}
}
