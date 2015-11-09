package controllers;

import controllers.base.BaseController;
import play.mvc.Result;

/**
 * Created by Cooper on 09.11.2015.
 */
public class ResponseController extends BaseController {

    public static Result getResponsesList() {
        return ok();
    }

}
