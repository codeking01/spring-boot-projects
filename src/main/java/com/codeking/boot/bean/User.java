package com.codeking.boot.bean;

import lombok.*;

/**
 * @author : codeking
 * @create : 2022/11/28 22:26
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class User {
    private String userName;
    private Pet pet;

    public User(String userName) {
        this.userName = userName;
    }


    /* public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", pet=" + pet +
                '}';
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }*/
}
