package Controller;

import Repository.TableCreation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Controller
public class BloodBankController {
    private DataSource dataSource;
    private TableCreation tableCreation;
    @RequestMapping("/")
    public String signUp(){
//        try {
//            Connection connection = dataSource.getConnection();
//
//            Statement statement = connection.createStatement();
//
//            String query = "CREATE TABLE IF NOT EXIST user1 (\n" +
//                    "  id bigint,\n" +
//                    "  username varchar(15), \n" +
//                    "  name varchar(40) ,\n" +
//                    "  password varchar(100) ,\n" +
//                    "  role_alias varchar(255) ,\n" +
//                    "  phone_no bigint ,\n" +
//                    "  PRIMARY KEY (id)\n" +
//                    ");";
//            System.out.println(query);
//            statement.execute(query);
//
//            statement.execute("INSERT INTO `user1` (`id`,`username`, `name`, `password`, `role_alias`, `phone_no`)\n" +
//                    "\n" +
//                    " VALUES ('1','admin123','Rahul','123','End User','9187162576');");
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

        return "signup";
    }
}
