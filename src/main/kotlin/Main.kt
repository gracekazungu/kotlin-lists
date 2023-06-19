import javax.sql.rowset.RowSetWarning

fun main(){
    //immutable list;no adding nor removing elements
val fruits= listOf("Apple","Banana","Code","Mango")
    println(fruits)

//mutable list;add and remove elements
    val rwanda= mutableListOf("Kagame",12500,66.7,"RWF","false")
    println(rwanda)

    rwanda.add("EAC")
    rwanda.remove(66.7)
    println(rwanda)

    val nums= mutableListOf(21,43,321,332,2,111,43,5,4892)
    println(nums.count())
    println(nums.max())
    println(nums.min())
    println(nums.average())
    println(nums.last())
    println(nums.first())
    println(nums.get(5))
    println(nums[4])
    println(nums.indexOf(332))
    println(nums.lastIndex)
    println(nums.lastIndexOf(43))
//    nums.sort()//sort the list in place
//    println(nums)
//    nums.sorted()//will create a copy sort it and returns the original as it is
//    println(nums)
val sortedNums=nums.sorted()
    println(sortedNums)
    println(nums is List<Int>)

    val evenList= mutableListOf<Int>()
    for(x in nums){
        if(x%2==0){
            evenList.add(x)
        }
    }
    println(evenList)


    val evenlist=nums.filter { num->num%2==0 }
    println(evenlist)



    val geisha=Product("Geisha",50.0)
    println(geisha is Product)

    CreateProductList()



   listOf(23,45,56,78,89)
    //write a fuction that takes in a list of intergers and prints out the square of element

}
 data class Product(var name:String,var Price:Double)
    fun CreateProductList(){
        val kiwi=Product("Kiwi shoe polish",80.0)
        val prod2=Product("Colgate",60.0)
        val ilara=Product("ilara milk",30.0)
        val bread=Product("sunblest",65.0)
        val biscuit=Product("Nuvita",5.0)

        val products= listOf(kiwi,prod2,ilara,bread,biscuit)
        val sortedProducts=products.sortedBy { product ->product.name  }
        println(sortedProducts)

        val  sorteProduct=products.sortedByDescending { product -> product.Price }
        println(sorteProduct)

       var itemsicanafford=products.filter { product ->product.Price <=50.0  }
        println(itemsicanafford)

    }





fun squareNums(name:List<Int>){
    for( i in name){
        println(i*i)
    }
}



