import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class JavaStreams {
	
		// TODO Auto-generated method stub

		public void regular() {
			
			//count the number of names starting with Alphabet A in List - REGULAR JAVA
			ArrayList <String> names = new ArrayList<String>();
			names.add("Alisson");
			names.add("Don");
			names.add("Allef");
			names.add("Alicia");
			names.add("Adam");

			int count = 0;

			for (int i=0;i<names.size();i++) {

				String nomeAtual = names.get(i);
				if(nomeAtual.startsWith("A")) {
					count++;

				}

			}
			System.out.println(count);
			
		}//END OF REGULAR()
		
		@Test
		public void streamFilter() {
			
			ArrayList <String> names = new ArrayList<String>();
			names.add("Alisson");
			names.add("Don");
			names.add("Allef");
			names.add("Alicia");
			names.add("Adam");
			
			//criar a stream S, e definir que você vai filtrar nesta stream, o que começa com A e contar.
			
			//there is no life for intermediate op if there is no terminal op
			//terminal operation will execute only if you inter op (Filter) returns true
			//Whe can create streams 
			//how to use filter in Stream API
			System.out.println(names.stream().filter(s->s.startsWith("A")).count());
			
			//stream direta:
			long d = Stream.of("Alisson","Don","Allef","Alicia","Adam").filter(s->
			{
				s.startsWith("A");
				return false;
			}
			).count();
			
			System.out.println(d);
			
	//		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		}
		
		public void streamMap() {
			
			//print names with last letter 'n'
			Stream.of("Alisson","Don","Allef","Alicia","Adam").filter(s->s.endsWith("n")).map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));
		}
		
		
	}

