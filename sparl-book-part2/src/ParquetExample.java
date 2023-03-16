import org.apache.spark.sql.*;

public class ParquetExample {

    public static void main (String Args[]){
        SparkSession spark= SparkSession.builder().appName("parquetsample").master("local").getOrCreate();


        Dataset<Row> ps =spark.read().format("parquet").load("data_files//alltypes_plain.parquet");
        ps.show();
        ps.printSchema();

    }
    
}
