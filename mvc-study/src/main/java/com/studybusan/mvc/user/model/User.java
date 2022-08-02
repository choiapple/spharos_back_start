package com.studybusan.mvc.user.model;

import javax.persistence.*;

@Entity
@Table(name = "user_id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // 컬럼에 대한 제약조건을 설정할 수 있다.
    @Column(name = "user_name", nullable = false, length = 10)
    private String name;
    private String age;
}
