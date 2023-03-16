import org.apache.spark.sql.*;
public class TextfileSample {

    public static void main (String args[])
    {

SparkSession spark=SparkSession.builder().appName("txt file ex").master("local").getOrCreate();

Dataset<Row> textlines =spark.read().format("text").load("data_files//romeo-juliet-pg1777.txt");

textlines.show(9);
textlines.printSchema();

 
    }


}
