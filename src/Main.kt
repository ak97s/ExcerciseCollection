data class Conversation(val name:String,
                   val lastMsg: String,
                   val unreadMsg: Int,
                   val time: String){
    fun getNameAndMessage(): String{
        return "Name = $name, last message = $lastMsg"
    }
}
fun main(args: Array<String>) {
    val conversationJoko = Conversation("Joko","Hai",30,"19.45")
    println(conversationJoko)
    println(conversationJoko.getNameAndMessage())
}
