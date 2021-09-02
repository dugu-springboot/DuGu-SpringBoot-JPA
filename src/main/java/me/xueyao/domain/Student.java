package me.xueyao.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Simon.Xue
 * @date 2021/9/2 9:04 下午
 **/
@Entity
@Table(name = "student")
@Data
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String creator;
    private String updater;
    private Date createTm;
    private Date updateTm;
    private String no;
    private String name;
    private Integer age;
    private String className;
    private String schoolName;

}
