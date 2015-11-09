package models;

import models.base.UUIDModel;

import javax.persistence.*;

/**
 * Created by Cooper on 09.11.2015.
 */
@Table
@Entity
public class FieldResponse extends UUIDModel {

    @ManyToOne(fetch = FetchType.LAZY)
    private Response response;

    @ManyToOne(fetch = FetchType.LAZY)
    private FieldEntity fieldEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public FieldEntity getFieldEntity() {
        return fieldEntity;
    }

    public void setFieldEntity(FieldEntity fieldEntity) {
        this.fieldEntity = fieldEntity;
    }
}
