import org.apache.spark.sql.*;
public class JsonExample {
    public static void main(String[] args) throws Exception {
    
    SparkSession spark=SparkSession.builder().appName("jsonex").master("local").getOrCreate();

    Dataset<Row> durhamdata=spark.read().format("json")
    .option("multiline","true")
    .load("data_files//durham-nc-foreclosure-2006-2016.json").cache();

    durhamdata.show();

}

}
