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
@Table("package_attribute_value")
public class PackageAttributeValue {

    @Id
    private Long id;

    private Long packageId;

    private Long packageAttributeId;

    private String value;

}
