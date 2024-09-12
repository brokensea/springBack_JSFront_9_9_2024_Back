package de.sp_10_9_2024.SP_UebungEinkaufliste.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data  // 自动生成 getter, setter, toString, equals, hashCode 方法
@NoArgsConstructor  // 自动生成无参构造函数
@AllArgsConstructor // 自动生成带所有参数的构造函数
public class ItemDTO {
    private Long id;  // 主键
    private String name;  // 物品名称
    private int menge;  // 数量
    private String laden;  // 商店
    private boolean gekauft;  // 是否已购买
}