public class DaoFactory {
    private static Ads MySQLAdsDao;

    public static Ads getAdsDao() {
        if (MySQLAdsDao == null) {
            MySQLAdsDao = new ListAdsDao();
        }
        return MySQLAdsDao;
    }
}
