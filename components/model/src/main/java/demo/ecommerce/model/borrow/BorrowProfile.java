package demo.ecommerce.model.borrow;

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
@Table("borrow_profile")
public class BorrowProfile {

    @Id
    private Long borrowProfileId;

    private Long userId;

    private String avatar;


}
