package cn.sn.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 十年
 * @since 2020-03-20
 */
@Data
//@EqualsAndHashCode(callSuper = false)
//@Accessors(chain = true)
public class User implements Serializable {

    //private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    //@TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer age;

    private String email;

    @Version //乐观锁Version注解
    private Integer version;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @TableLogic //逻辑删除
    private Integer deleted;


}
