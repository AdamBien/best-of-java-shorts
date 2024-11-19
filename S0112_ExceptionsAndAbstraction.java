import java.sql.SQLException;
import java.util.Optional;

interface App {

  record Customer(int id){}

  interface CustomerDAO{
    Optional<Customer> fetch(int id) 
    throws SQLException;  
  }

  class JDBCCustomerDAO implements CustomerDAO{

    @Override
    public Optional<Customer> fetch(int id) {
      return Optional.empty();
    }

  }

  static CustomerDAO create(){
    return new JDBCCustomerDAO();
  }

  static void main(String... args) {
    CustomerDAO dao = create();
    dao.fetch(42);
  }
}