package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class conexao {
    private static String url="jdbc:postgresql://200.18.128.54/aula";
    private static String usuario = "aula";
    private static String senha = "aula";
    private static Connection minhaCon=null;
    public static Connection getConexao(){
         try {
        if(conexao.minhaCon==null){
          conexao.minhaCon=DriverManager.getConnection(url, usuario, senha);
            } 
        return minhaCon;
         } catch (SQLException ex) {
                Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("erro de conexão ao banco de dados"+ex.getMessage());
            }
        return null;
    }
    
}
