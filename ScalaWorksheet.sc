object ScalaWorksheet {
  //println("Welcome to the Scala worksheet")
	val lista = List(1,2,3,4)                 //> lista  : List[Int] = List(1, 2, 3, 4)
	val set = Set(1,2,3,4,5,1)                //> set  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
	val mapa = Map(1 -> "Luis" , 2 -> "Juan") //> mapa  : scala.collection.immutable.Map[Int,String] = Map(1 -> Luis, 2 -> Jua
                                                  //| n)
	lista.map{_+3}                            //> res0: List[Int] = List(4, 5, 6, 7)
	lista.filter{x => x<3}                    //> res1: List[Int] = List(1, 2)
	val names = List("Juan", "Carlos", "Andres")
                                                  //> names  : List[String] = List(Juan, Carlos, Andres)
	names.map{_.length()}                     //> res2: List[Int] = List(4, 6, 6)
	//Kata 1 pares
	val pares = List.range(1,20)              //> pares  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                                                  //|  16, 17, 18, 19)
	pares.filter{_%2 == 0}                    //> res3: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18)
	//Kata 2 Encontrar datos de una persona dado el nombre
	var megaLista = List(List("Andres", "24 years", "male"),List("Juan", "23 years", "male"),List("Andres", "24 year", "male"), List("Luz", "29 year", "female"))
                                                  //> megaLista  : List[List[String]] = List(List(Andres, 24 years, male), List(Ju
                                                  //| an, 23 years, male), List(Andres, 24 year, male), List(Luz, 29 year, female)
                                                  //| )
  megaLista.filter{persona => persona(0) == "Juan"}
                                                  //> res4: List[List[String]] = List(List(Juan, 23 years, male))
  
  //Kata 3 encontrar numeros primos de una lista
  val list = List.range(1,20)                     //> list  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 
                                                  //| 16, 17, 18, 19)
  
  list.filter{x => list.filter{y => y <= Math.sqrt(x)}.filter{z => x%z == 0}.length ==1}
                                                  //> res5: List[Int] = List(1, 2, 3, 5, 7, 11, 13, 17, 19)

}