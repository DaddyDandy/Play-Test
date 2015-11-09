package controllers;

import com.mysema.query.jpa.impl.JPAQuery;
import controllers.base.BaseController;
import models.FieldEntity;
import models.QFieldEntity;
import play.mvc.Result;

import java.util.List;

/**
 * Created by Cooper on 09.11.2015.
 */
public class UserDataController extends BaseController {

    public static Result getCollectDataPage() {
        List<FieldEntity> activeFields = new JPAQuery()
                .from(QFieldEntity.fieldEntity)
                .where(QFieldEntity.fieldEntity.active)
                .list(QFieldEntity.fieldEntity);



        return ok();
    }

    public static Result saveUserData() {
        return ok();
    }

}
