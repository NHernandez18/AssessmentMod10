package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Event;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Dec 13, 2023
 */
@Repository
public interface EventRepository extends
JpaRepository<Event, Long>{
	
}



