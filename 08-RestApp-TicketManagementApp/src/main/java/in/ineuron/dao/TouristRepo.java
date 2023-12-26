package in.ineuron.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.model.Tourist;

public interface TouristRepo extends JpaRepository<Tourist, Integer> {

}
