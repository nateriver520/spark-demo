/**
 * Spark shell example
 */


val nums = sc.parallelize(List(1,2,3,4,5,6,7,8,9))
val squares = nums.map(x => x*x)
squares.collect
//res0: Array[Int] = Array(1, 4, 9, 16, 25, 36, 49, 64, 81)

val even = nums.filter(_ % 2 == 0)
even.collect
//res1: Array[Int] = Array(2, 4, 6, 8)

nums.reduce (_ + _)
//45
nums take 5
//Array(1, 2, 3, 4, 5)

nums.count!
//9



