package org.aimhighlearning.com.entity;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author sandeep.rana
 */
@RedisHash("book")
@Data
public class Book implements Serializable {

    public enum Type {
        classics,
        crime
    }

    private String id;

    private String title;

    private Type type;

    private String description;

    public Book() {
        this.id = UUID.randomUUID().toString();
    }
}
