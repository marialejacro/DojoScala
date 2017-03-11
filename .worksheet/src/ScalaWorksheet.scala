object ScalaWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(96); 
  //println("Welcome to the Scala worksheet")
	val lista = List(1,2,3,4);System.out.println("""lista  : List[Int] = """ + $show(lista ));$skip(28); 
	val set = Set(1,2,3,4,5,1);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(43); 
	val mapa = Map(1 -> "Luis" , 2 -> "Juan");System.out.println("""mapa  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa ));$skip(16); val res$0 = 
	lista.map{_+3};System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(24); val res$1 = 
	lista.filter{x => x<3};System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(46); 
	val names = List("Juan", "Carlos", "Andres");System.out.println("""names  : List[String] = """ + $show(names ));$skip(23); val res$2 = 
	names.map{_.length()};System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(46); 
	//Kata 1 pares
	val pares = List.range(1,20);System.out.println("""pares  : List[Int] = """ + $show(pares ));$skip(24); val res$3 = 
	pares.filter{_%2 == 0};System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(215); 
	//Kata 2 Encontrar datos de una persona dado el nombre
	var megaLista = List(List("Andres", "24 years", "male"),List("Juan", "23 years", "male"),List("Andres", "24 year", "male"), List("Luz", "29 year", "female"));System.out.println("""megaLista  : List[List[String]] = """ + $show(megaLista ));$skip(52); val res$4 = 
  megaLista.filter{persona => persona(0) == "Juan"};System.out.println("""res4: List[List[String]] = """ + $show(res$4));$skip(82); 
  
  //Kata 3 encontrar numeros primos de una lista
  val list = List.range(1,20);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(92); val res$5 = 
  
  list.filter{x => list.filter{y => y <= Math.sqrt(x)}.filter{z => x%z == 0}.length ==1};System.out.println("""res5: List[Int] = """ + $show(res$5))}

}
