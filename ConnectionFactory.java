
import java.sql.Connection;
import java.sql.DriverManager;




public class ConnectionFactory {

    public Connection conectar() {

        try {
            String host = "mysql-projetoa3-felipe-4c5f.b.aivencloud.com";
            String port = "16942";
            String user = "avnadmin";
            String password = "AVNS_w536S1bG6y4lAANozl5";
            String database = "defaultdb";
            // Construir a URL de conexão
            String url = "jdbc:mysql://" + host + ":" + port + "/" + database;

            // Estabelecer a conexão
            Connection conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // Tratamento de exceções
            e.printStackTrace();
            return null; // ou outra ação apropriada de tratamento de erro
        }
    }
}
