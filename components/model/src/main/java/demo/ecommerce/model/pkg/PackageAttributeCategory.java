package demo.ecommerce.model.pkg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author hanv
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("package_attribute_category")
public class PackageAttributeCategory {

    @Id
    private Long id;

    private String name;

    private int attributeCount;

    private int paramCount;
}
