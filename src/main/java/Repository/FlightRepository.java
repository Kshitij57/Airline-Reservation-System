package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Flight;

public interface FlightRepository extends JpaRepository<Integer,Flight>{

}
