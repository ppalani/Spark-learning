
import org.apache.spark.sql.*;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.Metadata;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

public class SchemaExample {
    public static void main(String[] args) throws Exception {

        SparkSession spark = SparkSession.builder().appName("schema cr ex").master("local").getOrCreate();

        StructType st = DataTypes.createStructType(
                new StructField[] { DataTypes.createStructField("id", DataTypes.IntegerType, false, Metadata.empty()),
                        DataTypes.createStructField("authorId", DataTypes.IntegerType, true, Metadata.empty()),
                        DataTypes.createStructField("title", DataTypes.StringType, true, Metadata.empty()),
                        DataTypes.createStructField("releaseDate", DataTypes.DateType, true, Metadata.empty()),
                        DataTypes.createStructField("link", DataTypes.StringType, true, Metadata.empty())

                });
          
        Dataset<Row> books = spark.read().format("csv")
                .option("header", "true")
                .option("dateformat", "m/d/y")
                .option("multiline", "true")
                .option("sep", ";")
                .option("quote", "*")
                .schema(st)
                .load("data_files\\books.csv");

   

        books.show();
        books.printSchema();


    }
}
