package cn.coding.com.springbootmongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;


@Data
@Document(collection = "employees")
/*@Author JosephCrypto
 *@Create 2021-12-01 1:51 PM
 */
public class Employee {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private long id;

    @Size(max = 45, min = 2)
    @NotEmpty(message = "Name must be as least two character.Please enter your name!")
    @Indexed(unique = true)
    @Field(name = "first_name")
    private String firstName;

    @Size(max = 45, min = 2)
    @NotEmpty(message = "Name must be as least two character.Please enter your name!")
    @Indexed(unique = true)
    @Field(name = "last_name")
    private String lastName;

    @Field(name = "gender")
    private byte gender;  //1:male and 0:female

    @Size(max = 30, min = 5)
    @NotEmpty(message = "Phone number must be value Please enter your phone number!")
    @Field(name = "phone_no")
    private String phoneNo;

    @Size(max = 50, min = 3)
    @NotEmpty(message = "Please provide your email address!")
    @Indexed(unique = true)
    @Field(name = "emailId")
    private String emailId;

    @Size(max = 100, min = 3)
    @NotEmpty(message = "Please provide address!")
    @Field(name = "address")
    private String address;

    @Field(name = "creation_date")
    @DateTimeFormat(pattern = "yyyy-MM-ss")
    private Date creationDate = new Date();

}
