package de.sp.DockComposeEinkauflist16_9_2024.services;

import de.sp.DockComposeEinkauflist16_9_2024.dtos.ItemDTO;
import de.sp.DockComposeEinkauflist16_9_2024.entities.Item;
import de.sp.DockComposeEinkauflist16_9_2024.mapper.ItemMapper;
import de.sp.DockComposeEinkauflist16_9_2024.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private ItemMapper itemMapper;

    // 获取所有物品
    public List<ItemDTO> getAllItems() {
        List<Item> items = itemRepository.findAll();
        return items.stream()
                .map(itemMapper::toDTO)
                .collect(Collectors.toList());
    }

    // 根据 ID 获取单个物品
    public ItemDTO getItemById(Long id) {
        Optional<Item> item = itemRepository.findById(id);
        return item.map(itemMapper::toDTO).orElse(null);
    }

    // 添加或更新物品
    public ItemDTO saveOrUpdateItem(ItemDTO itemDTO) {
        Item item = itemMapper.toEntity(itemDTO);
        Item savedItem = itemRepository.save(item);
        return itemMapper.toDTO(savedItem);
    }

    // 删除物品
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

}
