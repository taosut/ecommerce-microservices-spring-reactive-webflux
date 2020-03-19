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
@Table("package_attribute")
public class PackageAttribute {

    @Id
    private Long id;

    private Long packageAttributeCategoryId;

    private String name;

    private int selectType;

    private int inputType;

    private String inputList;

    private int sort;

    private int filterType;

    private int searchType;

    private int relatedStatus;

    private int handAddStatus;

    private int type;
}
