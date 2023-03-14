import org.apache.spark.sql.*;

public class ComplexCsvLoad {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SparkSession spk= SparkSession.builder().appName("complexCSV").master("local").getOrCreate();


        Dataset<Row> books = spk.read().format("csv")
        .option("header","true")
        .option("multiline","true")
        .option("sep",";")
        .option("quote","*")
        .option("dateformat","m/d/y")
        .option("inferschema","true")
        .load("data_files\\books.csv");

        System.out.println("data");
        books.show(7,90);
        System.out.println("schema");

        books.printSchema();





    
    }   
}
