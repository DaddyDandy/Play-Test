package models.base;

import com.avaje.ebean.Model;

import javax.persistence.*;

/**
 * Created by Cooper on 25.10.2015.
 */

@MappedSuperclass
public class IndexedModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
