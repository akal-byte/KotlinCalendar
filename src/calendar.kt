fun main() {
    calendar()
}
fun calendar(){
    println("kindly key in the month of the year : ")
    var monthOfTheYear= readLine()
    when(monthOfTheYear?.toInt()){
        1-> println("January")
        2-> println("February")
        3-> println("March")
        4-> println("April")
        5-> println("May")
        6-> println("June")
        7-> println("July")
        8-> println("August")
        9-> println("September")
        10-> println("October")
        11-> println("November")
        12-> println("December")
        else -> println("not a month of the year!")
    }
    //using in range and not in range
    when(monthOfTheYear?.toInt()){
        in 1..4 -> println("you are in the first quarter of the school's calendar")
        in 5..6-> println("you are in the second term of our school's calendar")
        in 7..10-> println("you are doing your internship")
        in 8..11-> println("you must have graduated!,congratulations")
        !in 1..12-> println("please cross check your entry and key in a valid month number!")

    }
    println("where do you live?: ")
    var location= readLine()
    when(location){
        is String -> println("Wow,it must be a lovely place, right?") // using is to check the type of location
        else -> println("is that in Kenya?")
    }

}