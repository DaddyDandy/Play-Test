package models;

import models.base.UUIDModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Cooper on 09.11.2015.
 */
@Table
@Entity
public class Response extends UUIDModel {

    @NotNull
    @Column(nullable = false)
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
