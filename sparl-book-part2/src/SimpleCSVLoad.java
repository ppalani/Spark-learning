import org.apache.spark.sql.*;
public class SimpleCSVLoad {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        SparkSession spark = SparkSession.builder().appName("simple csv").master("local").getOrCreate();

        Dataset<Row> books = spark.read().format("csv").option("header","true").load("data_files\\books_simple.csv");

        books.show();
    }
}
