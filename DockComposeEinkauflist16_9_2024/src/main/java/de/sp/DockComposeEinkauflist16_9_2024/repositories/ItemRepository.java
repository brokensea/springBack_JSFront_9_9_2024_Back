package de.sp.DockComposeEinkauflist16_9_2024.repositories;


import de.sp.DockComposeEinkauflist16_9_2024.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}