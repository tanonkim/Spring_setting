package com.example.restfulwebservice1.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Integer id;

    private String description;

    // Post : User => N : 1
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore // 해당 값은 공개하지 않음
    private Userr user;
}
