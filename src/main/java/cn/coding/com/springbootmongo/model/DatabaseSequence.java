package cn.coding.com.springbootmongo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@Document(collection = "database_sequences")
/*@Author JosephCrypto
 *@Create 2021-12-01 1:51 PM
 */
public class DatabaseSequence {

    @Id
    @Field(name = "id")
    private String id;

    @Field(name = "seq")
    private long seq;
}
