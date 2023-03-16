import org.apache.spark.sql.*;

public class AvroLoadSample {


    public static void main(String args []){

SparkSession spark=SparkSession.builder().appName("avrofiles").master("local").getOrCreate();

Dataset<Row> weather = spark.read().format("avro").load("data_files//weather.avro");


weather.show(25,8);

    }
    
}
