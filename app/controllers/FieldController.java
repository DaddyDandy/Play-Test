package controllers;

import controllers.base.BaseController;
import play.mvc.Result;

/**
 * Created by Cooper on 09.11.2015.
 */
public class FieldController extends BaseController {

    public static Result getFieldsList() {
        return ok();
    }

    public static Result getFieldEditPage(String uuid) {
        return ok();
    }

    public static Result getNewFieldPage() {
        return ok();
    }

    public static Result saveField() {
        return ok();
    }

}
