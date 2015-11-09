package models;

import models.base.NamedModel;
import models.base.UUIDModel;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

/**
 * Created by Cooper on 09.11.2015.
 */
@Table
@Entity
public class User extends NamedModel {

    @OneToMany(mappedBy = "user")
    private Set<FieldResponse> fieldResponses;

    public Set<FieldResponse> getFieldResponses() {
        return fieldResponses;
    }

    public void setFieldResponses(Set<FieldResponse> fieldResponses) {
        this.fieldResponses = fieldResponses;
    }
}
