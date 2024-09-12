package de.sp_10_9_2024.SP_UebungEinkaufliste.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "items")  // 指定数据库表名
@Data  // 自动生成 getter, setter, toString, equals, hashCode 方法
@NoArgsConstructor  // 自动生成无参构造函数
@AllArgsConstructor // 自动生成带所有参数的构造函数
@EqualsAndHashCode(onlyExplicitlyIncluded = true)  // 指定只使用显式包含的字段
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include  // 明确声明 id 字段用于 equals 和 hashCode
    private Long id;

    private String name;
    private int menge;
    private String laden;
    private boolean gekauft;
}
