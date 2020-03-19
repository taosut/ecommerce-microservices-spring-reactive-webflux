package demo.ecommerce.model.loan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.Email;
import java.util.Date;

/**
 * @author hanv
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("loan_profile")
public class LoanProfile {

    @Id
    private Long loanProfileId;

    private Long userId;

    @Email
    private String email; // địa chỉ emal

    private String avatar; // đường dẫn ảnh đại diện

    private Number balance; // số dư hiện tại

    private String typeOfCredit; //

    private String cmndNo; // số chứng minh thư nhân dân

    private Date dateOfBirth; // ngày tháng năm sinh

    private String gender; // đực or cái or bd

    private String packages; // chỉ nhận các gói vay theo mình lựa chọn

    private String reciveDistricts; // chỉ nhận các đơn vay theo địa chỉ mình chọn

    private String censorship; // các thông tin xác thực

    private String address;

    private Boolean authenticated = false; // tài khoản đã được xác minh chưa?

}
