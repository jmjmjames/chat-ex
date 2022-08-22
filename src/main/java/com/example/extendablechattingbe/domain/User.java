package com.example.extendablechattingbe.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@ToString
@Table(name = "users", indexes = {
        @Index(columnList = "email", unique = true),
        @Index(columnList = "nickname", unique = true),
})
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Setter
    @Column(nullable = false, length = 100)
    private String email;

    @Setter
    @Column(nullable = false)
    private String userPassword;

    @Setter
    @Column(length = 100)
    private String nickname;

    @Setter
    private String memo;

    protected User() {
    }

    private User(String email, String userPassword, String nickname, String memo) {
        this.email = email;
        this.userPassword = userPassword;
        this.nickname = nickname;
        this.memo = memo;
    }

    public static User of(String email, String userPassword, String nickname, String memo) {
        return new User(email, userPassword, nickname, memo);
    }

}
