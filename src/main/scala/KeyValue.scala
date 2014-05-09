/**
 * Scala key value example
 */

val rdd = sc.parallelize(List(("A",1), ("B",2), ("C",3), ("A",4), ("B",5)))

val rbk = rdd.reduceByKey(_+_).collect
//Array((A,5), (B,7), (C,3))
val gbk = rdd.groupByKey.collect
//Array((A,ArrayBuffer(1, 4)), (B,ArrayBuffer(2, 5)), (C,ArrayBuffer(3)))
val sbk = rdd.sortByKey().collect
//Array((A,1), (A,4), (B,2), (B,5), (C,3))


val player = sc.parallelize(List(("ACMILAN","KAKA"),("ACMILAN","BT"),("GUANGZHOU","ZHENGZHI")))
val team = sc.parallelize(List(("ACMILAN",5),("GUANGZHOU",3)))

player.join(team)
//Array((GUANGZHOU,(ZHENGZHI,3)), (ACMILAN,(KAKA,5)), (ACMILAN,(BT,5)))




