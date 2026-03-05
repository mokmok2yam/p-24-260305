package com.back.domain.poast.entity;

import com.back.global.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
@Entity
public class Post extends BaseEntity {
    private  String title;
    private  String content;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
