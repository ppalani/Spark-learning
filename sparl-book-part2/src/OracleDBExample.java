import java.util.Properties;

import org.apache.spark.sql.*;
public class OracleDBExample {
    
    public static void main(String args[]){

        SparkSession spark = SparkSession.builder().appName("db test").master("local").getOrCreate();
        
        Properties dbprops = new Properties();
        dbprops.put("user", "");
        dbprops.put("password", "");
        Dataset<Row> films=spark.read().jdbc("jdbc:oracle:thin:@//localhost:1521/PPDEV", "film", dbprops);
        films.show();
    }
}
