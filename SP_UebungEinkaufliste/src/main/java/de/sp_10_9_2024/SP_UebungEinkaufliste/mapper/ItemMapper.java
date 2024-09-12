package de.sp_10_9_2024.SP_UebungEinkaufliste.mapper;

import de.sp_10_9_2024.SP_UebungEinkaufliste.dtos.ItemDTO;
import de.sp_10_9_2024.SP_UebungEinkaufliste.entities.Item;
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
