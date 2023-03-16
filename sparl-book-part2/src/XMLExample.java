import org.apache.spark.sql.*;

public class XMLExample {
    public static void main(String[] args) throws Exception {

SparkSession spark=SparkSession.builder().appName("XML").master("local").getOrCreate();

Dataset<Row> df=spark.read().format("xml").option("rowtag", "row").load("data_files//nasa-patents.xml");
   
df.show();
}
}
