package Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Entity.Flight;
@Repository
public interface FlightRepository extends CrudRepository <Flight ,Serializable>{

}
