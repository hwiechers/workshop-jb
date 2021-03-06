package v_collections

import java.util.HashSet

fun example9() {
    val product = listOf(1, 2, 3, 4).fold(1, { partProduct, element -> element * partProduct })
    product == 24
}

// The same as
fun whatFoldDoes(): Int {
    var product = 1
    listOf(1, 2, 3, 4).forEach { element -> product = element * product}
    return product
}

fun Shop.getProductsOrderedByAllCustomers(): Set<Product> {
    // Return set of products ordered by every customer
    return customers.fold(allOrderedProducts, {
        orderedByAll, customer ->
        todoCollectionTask()
    })
}

// Not all the methods are added to standard library by now ;).
fun <T> Set<T>.intersect(other: Collection<T>): Set<T> {
    val intersection = HashSet(this)
    intersection.retainAll(other)
    return intersection
}

