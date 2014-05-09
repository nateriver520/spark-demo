import org.apache.spark._
import SparkContext._


object WordCount {
  def main(args: Array[String]) {

    val sc = new SparkContext("local", "WordCount",
      System.getenv("SPARK_HOME"), List("target/libs/scala-gradle-template-1.0.jar"))

    val textFile = sc.textFile("/Users/yangshuo/code/spark/words.txt")
    val result = textFile.flatMap(line => line.split("\\s+"))
      .map(word => (word, 1)).reduceByKey(_ + _)
    result.saveAsTextFile("/Users/yangshuo/code/spark/result")
  }
}