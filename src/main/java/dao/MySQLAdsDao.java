package dao;

import dao.Ads;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection myConn = null;
    public MySQLAdsDao(Config config){
        try {
            //Get a connection to database
            DriverManager.registerDriver(new Driver());
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adlister_db", "root", "codeup");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        Statement myStmt = null;
        try {
            myStmt = myConn.createStatement();
            ResultSet rs = myStmt.executeQuery("SELECT * FROM ads");
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
    }





    @Override
    public Long insert(Ad ad) {
        try {
            Statement stmt = myConn.createStatement();
            stmt.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }

    private String createInsertQuery(Ad ad) {
        return "INSERT INTO ads(user_id, title, description) VALUES "
                + "(" + ad.getUserId() + ", "
                + "'" + ad.getTitle() +"', "
                + "'" + ad.getDescription() + "')";
    }

    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
                rs.getLong("id"),
                rs.getLong("user_id"),
                rs.getString("title"),
                rs.getString("description")
        );
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }

        }


