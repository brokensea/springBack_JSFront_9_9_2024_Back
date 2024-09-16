package de.sp.DockComposeEinkauflist16_9_2024.controller;

import de.sp.DockComposeEinkauflist16_9_2024.dtos.ItemDTO;
import de.sp.DockComposeEinkauflist16_9_2024.services.ItemService;
import org.hibernate.annotations.IdGeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/items")
@CrossOrigin(origins = "*")
public class ItemController {
    @Autowired
    private ItemService itemService;

    //getAll
    @GetMapping
    public ResponseEntity<List<ItemDTO>> getAllItems() {
        List<ItemDTO> items = itemService.getAllItems();
        return ResponseEntity.ok(items);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemDTO> getItemById(@PathVariable Long id) {
        ItemDTO item = itemService.getItemById(id);
        if (item != null) {
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/submit")
    public ResponseEntity<ItemDTO> saveOrUpdateItem(@RequestBody ItemDTO itemDTO) {
        ItemDTO savedItem = itemService.saveOrUpdateItem(itemDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedItem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
        return ResponseEntity.noContent().build();
    }
     // 更新项目的 'gekauft' 状态
    @PutMapping("/{id}")
    public ResponseEntity<ItemDTO> updateItemGekauft(@PathVariable Long id, @RequestBody ItemDTO itemDTO) {
        // 检查项目是否存在
        ItemDTO existingItem = itemService.getItemById(id);
        if (existingItem != null) {
            // 更新 'gekauft' 状态
            existingItem.setGekauft(itemDTO.isGekauft());  // 假设 DTO 有 isGekauft 方法来获取布尔值
            ItemDTO updatedItem = itemService.saveOrUpdateItem(existingItem);
            return ResponseEntity.ok(updatedItem);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
