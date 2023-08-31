package Repository;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import Entity.Admin;
import Entity.User;

@Repository
public interface AdminRepository extends CrudRepository <Admin , Serializable>{

	
}
