package de.sp.DockComposeEinkauflist16_9_2024.mapper;

import de.sp.DockComposeEinkauflist16_9_2024.dtos.ItemDTO;
import de.sp.DockComposeEinkauflist16_9_2024.entities.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
    public ItemDTO toDTO(Item item){
        if(item == null){
            return null;
        }
        return new ItemDTO(
                item.getId(),
                item.getName(),
                item.getMenge(),
                item.getLaden(),
                item.isGekauft()

        );
    }
    public Item toEntity(ItemDTO itemDTO){
         if (itemDTO == null) {
            return null;
        }
        return new Item(
                itemDTO.getId(),
                itemDTO.getName(),
                itemDTO.getMenge(),
                itemDTO.getLaden(),
                itemDTO.isGekauft()
        );
    }
}
