package com.codeup.dao;

//Config class stores the Configurations

public class Config {
        final String url = "jdbc:mysql://localhost/my_ad_lister_db?allowPublicKeyRetrieval=true&useSSL=false";

        final String user = "root";
        final String password = "codeup";

        public String getUrl() {
            return url;
        }

        public String getUser() {
            return user;
        }

        public String getPassword() {
            return password;
        }
    }

