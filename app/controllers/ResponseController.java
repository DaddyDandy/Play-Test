package controllers;

import com.mysema.query.jpa.impl.JPAQuery;
import controllers.base.BaseController;
import models.QResponse;
import models.Response;
import play.db.ebean.Transactional;
import play.mvc.Result;

import java.util.List;

/**
 * Created by Cooper on 09.11.2015.
 */
public class ResponseController extends BaseController {

    @Transactional
    public static Result getResponsesList() {
        List<Response> responses = new JPAQuery().from(QResponse.response)
                .list(QResponse.response);
        return ok();
    }

}
