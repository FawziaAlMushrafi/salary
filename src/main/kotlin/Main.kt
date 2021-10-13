fun main() {
    println(" Enter employee salary")
    var salary = readLine()!!.toDouble()
    println("Enter employee rating of 1 to 3")
    var rate : Int= readLine()!!.toInt()
    var newSalary : Double = 1.00
    if (rate >=1 && rate<=3){
        if (rate==1){
            newSalary= salary/100 *6 //receive a 6%
            newSalary+=salary
            println(newSalary)
        } else if (rate==2){
            newSalary= salary/100 *4 //receive a 4%
            newSalary+=salary
            println(newSalary)
        }else if (rate==3){
            newSalary= salary/100 *1.5 //receive a 1.5
            newSalary+=salary
            println(newSalary)
        }
    }else{
        println("Enter vaild rating of  1 to 3")
    }


}
