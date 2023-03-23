package com.codeup.dao;

import com.codeup.models.Ad;
import com.codeup.models.User;

import java.util.List;

public interface Ads {

    //grabs the list of all the ads
    List<Ad> all();

    List<Ad> specificUserAds(User user);

    // this inserts new ad and also returns its id
    Long insert(Ad ad);

    //enables user find Ad by its adId
    Ad findById(long adId);

    // allows to delete Ads
    void deleteAd(Ad ID);

    //allows to edit Ads
    void editAd(Ad ad);


}
