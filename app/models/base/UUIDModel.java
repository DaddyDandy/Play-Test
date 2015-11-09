package models.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

/**
 * Created by Cooper on 25.10.2015.
 */
@MappedSuperclass
public class UUIDModel extends IndexedModel {

    @Column
    private String uuid = UUID.randomUUID().toString();

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
