package top.zhuqq.entity;

import java.io.Serializable;

/**
 * project-name : double-patent.
 * class-name : User.
 *
 * @author : Zqq.
 * date : 2021/4/14.
 * time : 22:41.
 */

public class User implements Serializable {
    private String username;
    private Integer age;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user:--"+this.getUsername()+"--"+this.getAge()+"--"+this.getPassword();
    }
}
