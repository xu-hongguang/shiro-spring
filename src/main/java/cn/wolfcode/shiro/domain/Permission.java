package cn.wolfcode.shiro.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 权限类
 * @author 16033
 */
@Getter
@Setter
public class Permission {
    private Long id;
    private String name;  //权限名称
    private String resource; //资源表达式xx:xx  比如：employee:list

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
