package de.sp_10_9_2024.SP_UebungEinkaufliste.repositories;


import de.sp_10_9_2024.SP_UebungEinkaufliste.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}