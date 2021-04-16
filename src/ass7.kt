fun main(){
oddNumbers()
println(people("Celine","Belyse","Diane","Pamela"))
  checkDrinks(5)
  checkDrinks(11)
  checkDrinks(30)
    checkNumbers()
}

fun oddNumbers(){
    for(num in 1..100){
        if(num%2!=0){
            println(num)
        }
    }
}
fun people(name1:String,name2:String,name3:String,name4:String):Int {
    var names = arrayOf(name1,name2,name3,name4)
    var countName=0
    for (name in names) {
        if (name.length > 5) {
            countName++
        }
    };return countName
}
fun checkDrinks (age:Int){
    if(age<6){
        println("A glass of milk")
    }
    else if(age>6&&age<15){
        println("A bottle of fanta orange")
    }
    else{
        println(" A bottle of coca cola")
    }
}
fun checkNumbers(){
    for(num in 1..100){
        if(num%3 !=0 && num%5 !=0){
            println(num)
        }
        if (num%3==0){
            println("Fizz")
        }
        if(num%5==0){
            println("BuZZ")
        }
        if (num%3==0 && num%5==0){
            println("FiZZBuZZ")
        }
    }
}
