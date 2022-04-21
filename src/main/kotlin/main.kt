fun main(){
    var members = mutableListOf("respah","dallen","caro","John","joviaol","wendy")
    println(members[0])
    println(members.get(4))
    for (members in members)
        println(members)
    members.forEach{members-> println(members)}
    var Cars= listOf("toyota","masdes")
    println(Cars)
    println(Cars)
    var names= listOf("cleopatra","kanyunyuzi","dallen","caroline","joan","elizabeth")
    var longNames=names.filter { name->name.length>5 }
    println(longNames)
    data class Person(var names:String,var age:Int)
    var people= listOf(
        Person("dallen",34),Person("speria",56),Person("shallon",45)
    )
    var adullt=people.filter{pe->pe.age>=35}
    println(adullt)
    var colors= listOf("orange","red","black","yellow")
     for (color in colors){
         println(colors)
     }
colors.forEach{color->println(colors)}


    var sortedNum=colors.sorted()
    println(sortedNum)
    var sorted=colors.sortedDescending()
    println(sorted)
    var revnums=colors.reversed()
    println(revnums)

    data class  vehicles(var make:String, var model:String)
    var onroads= listOf(
        vehicles("prado","jeep"),
        vehicles("rav 4","prado"),
        vehicles("pajero","carr")

    )
    var sorrted =onroads.sortedBy { vehicle ->vehicle.make  }
    println(sorrted)
    var sotted=onroads.sortedByDescending { vehicl ->vehicl.model  }
    println(sotted)
    //var nums=indeces(listOf("dalle","SPERIA","CAROLINE","henry","sarah","dan","bety","linah","faith","jane"))
    println()
    var k=height(listOf(23,56,78,90))
    println(k)
    var sorrrted=person.sortedBy { People->People.age}
    println(sorrrted)
    var d=Cars("dejejr",3.5)
    var f=Cars("erdsd",5.6)
    var b=Cars("eswa",3.5)
    println(all(listOf(d,f,b)))

    }


//fun indeces(names:List<String>):List<String>{
      // var newlist= mutableSetOf<String>()
        //names.forEachIndexed { index, i ->
       // if (index % 2== 0)
           // newlist.add(i)
   // }

   //return newlist
//}
fun height(human:List<Int>):String{
    var hc =human.average()
       var f=human.sum()
       var g="average is $hc meteres and the sum is $f metre"
       return g
}
data class People(var names:String,var age:Int)
 var person= listOf(
     People("dalle",34),
     People("respah",25),
     People("rema",89)

 )

data class Cars(var regestration:String,var milieage:Double)
fun all(cars:List<Cars>):Double{
    var adds=0.0
    var num=cars.count()
    var p=  cars.forEach { cr->
        adds+=cr.milieage
    }
    return adds/num


    }






