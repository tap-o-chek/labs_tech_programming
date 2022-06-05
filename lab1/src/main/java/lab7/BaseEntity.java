package lab7;

import javax.persistence.GenerationType;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.GeneratedValue;

@MappedSuperclass
public abstract class BaseEntity <P extends Serializable> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected P id;
    public P getId() {
        return id;
    }
    public BaseEntity<P> setId(P id) {
        this.id = id;
        return this;
    }
}