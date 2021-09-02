package me.xueyao.service;

import me.xueyao.base.R;
import me.xueyao.domain.Student;

/**
 * @author Simon.Xue
 * @date 2021/9/2 9:29 下午
 **/
public interface StudentService {
    /**
     * 新增
     * @param student
     * @return
     */
    R insert(Student student);

    /**
     * 查询详情
     * @param id
     * @return
     */
    R<Student> getById(Integer id);

    /**
     * 更新
     * @param student
     * @return
     */
   R update(Student student);

    /**
     * 删除
     * @param id
     * @return
     */
   R delete(Integer id);
}
