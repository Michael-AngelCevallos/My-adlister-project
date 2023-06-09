package com.codeup.dao;

public class DaoFactory {


        private static Ads adsDao;
        private static Users usersDao;
        private static Config config = new Config();

        public static Ads getAdsDao() {
            if (adsDao == null) {
                adsDao = new mySQLAdsDao(config);
            }
            return adsDao;
        }

        public static Users getUsersDao() {
            if (usersDao == null) {
                usersDao = new mySqlUsersDao(config);
            }
            return usersDao;

        }



    }


