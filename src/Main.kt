val conversationAndi = Conv("Andi","halo",1,"1955")
val conversationJoko = Conv("Joko","Hai",30,"19.45")

fun main(args: Array<String>) {
    println(conversationJoko)
    println(conversationJoko.getNameAndMessage())

    val listConv = mutableListOf(conversationJoko,conversationJoko.getNameAndMessage())
    println("sebelum: $listConv")
    listConv.add(conversationAndi)
    println("sesudah: $listConv")
    println(showMapOf())
}
fun showMapOf(){
    val mapConv = mutableMapOf<String,Conv>()
    mapConv["satu"]=conversationAndi
    mapConv["dua"]=conversationJoko
    println(mapConv["dua"])
}