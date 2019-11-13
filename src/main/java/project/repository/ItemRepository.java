package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.beans.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
