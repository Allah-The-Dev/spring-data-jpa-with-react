package com.hibernate.demo.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String initials;
    
    @Column(name = "user_name")
    private String name;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "street", column = @Column(name = "home_addr_street")),
        @AttributeOverride(name = "city", column = @Column(name = "home_addr_city")),
        @AttributeOverride(name = "state", column = @Column(name = "home_addr_state")),
        @AttributeOverride(name = "pincode", column = @Column(name = "home_addr_pincode"))
    })
    private Address homeAddress;
}