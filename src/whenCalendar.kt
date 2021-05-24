fun main() {
    favApps()
}
fun favApps(){
    println("what are your favorite android apps: ")
    var apps= readLine()
    when(apps){
        "instagram" -> println("you must be a creative person!")// using when as a statement using else
        "tiktok"-> println("you must be a Generation Z, right?")
        "snapchat"-> println("kindly proceed to fill the next question")
        "wattpad"-> println("are you not a hopeless romantic?")
        else -> println("Thank you, there are no more questions for you!")
    }
    if(apps=="snapchat"){
        println("how often do you use snapchat in a day: ")
        var sc= readLine()
        if (sc=="five"){
            println("you must post stories everyday, then: ")
            var response= readLine()
            if (response=="yes"){
                println("That's all thank you for taking time to fill the questionnaire!")
            }
            else
                println("why is that so?")
        }
    }

}


