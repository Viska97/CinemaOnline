package com.visapps.cinemaonline.interfaces;

import com.visapps.cinemaonline.enums.RequestError;
import com.visapps.cinemaonline.models.Film;

import java.util.List;

/**
 * Created by Visek on 18.03.2018.
 */

public interface InfoPresenterCallback extends AbstractPresenterCallback{
    void onLoad(Object object);
    void onEmpty();
    void onLogOut();
    void onError(RequestError error);
    void ShowLoading();
    void RemoveLoading();
}
