data class Conv(val name: String,
                val lastMsg: String,
                val unreadMsg: Int,
                val time: String) {
    fun getNameAndMessage(): String {
        return "Name = $name, last message = $lastMsg"
    }
}
