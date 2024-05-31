package com.example.menuw.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer menuId;

    private Integer menuLike;
    private String menuName;
    private String menuImageURL;
    private String ingredients;

    private String recipe;
    private String menuType;
    private int cal;
    private int na;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

}
