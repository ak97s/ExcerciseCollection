
fun main(args: Array<String>) {
    val conversationJoko = Conv("Joko","Hai",30,"19.45")
    val conversationAndi = Conv("Andi","halo",1,"1955")
    println(conversationJoko)
    println(conversationJoko.getNameAndMessage())

    val listConv = mutableListOf(conversationJoko,conversationJoko.getNameAndMessage())
    println("sebelum: $listConv")
    listConv.add(conversationAndi)
    println("sesudah: $listConv")

}
