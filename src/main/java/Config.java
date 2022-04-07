public class Config {

    public String getUrl(){
        return "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false";
    }

    public String getUserName(){
        return "root";
    }

    public String getPassword(){
        return "codeup";
    }
}