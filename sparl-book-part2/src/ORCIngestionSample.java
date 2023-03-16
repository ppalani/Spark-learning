import org.apache.spark.sql.*;
public class ORCIngestionSample {
    
    public static void main(String Args[]){
SparkSession spark = SparkSession.builder().appName("ORC SAMPLE").master("local").getOrCreate();


Dataset<Row> ORCDATA=spark.read().format("orc").load("data_files//demo-11-zlib.orc");

ORCDATA.show();
ORCDATA.printSchema();

    }
}
