fun main(){
    var names = listOf("Bakhita", "Aisha", "Samira", "Fardosa", "Bella","Billy", "Jose", "Owen", "Ismail", "Iddi")
    var x=heightOfPeople(listOf(10, 20, 30, 40, 50))
    println(x)
    var a = Person("Bakhita", 22,5.1,45.0)
    var b = Person("Owen",20,6.0,76.0)
    var c = Person("Samira",21,6.3,55.0)
    var list1= listOf(a,b,c)
    var individual = list1.sortedBy { person->person.age }
    println(individual)

    var t = Person("Aisha",26,5.2,72.0)
    var d= Person("Billy",24,5.4,60.0)
    var list2= listOf(t,d)
    println(list1.plus (list2))

    var maserati = Cars("KAR624J",720)
    var lamborghini = Cars("KCC564B", 1000)
    var Cars = listOf(maserati,lamborghini)
    println(car(Cars))


}


fun names(name:List<String>):List<String>{
    name.forEachIndexed { index, s ->
        if(index%2==0){
            println(s)
        }
    }
    return name

}
fun heightOfPeople(numbs: List<Int>):String{
    var height = numbs.sum()
    var average = numbs.average()
    var total= "$height, $average"

    return total
}
data class Person(var name:String,var age:Int,var height:Double, var weight:Double){

}

data class Cars(var registration: String, var mileage:Int){

}
fun car(vehicles: List<Cars>):Int{
    var veh = 0
    vehicles.forEach{ cars -> cars.mileage
        veh+=cars.mileage

    }
    var average = veh/vehicles.count()
    return average
}



