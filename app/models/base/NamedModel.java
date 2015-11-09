package models.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by Cooper on 25.10.2015.
 */
@MappedSuperclass
public class NamedModel extends UUIDModel {

    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
