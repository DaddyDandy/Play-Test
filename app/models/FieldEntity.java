package models;

import models.base.NamedModel;
import models.enums.FieldType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Cooper on 09.11.2015.
 */
@Table
@Entity
public class FieldEntity extends NamedModel {

    private boolean required;

    private boolean active;

    @NotNull
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private FieldType fieldType;

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(FieldType fieldType) {
        this.fieldType = fieldType;
    }
}
