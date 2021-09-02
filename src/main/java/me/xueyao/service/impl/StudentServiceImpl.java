package me.xueyao.service.impl;

import me.xueyao.base.R;
import me.xueyao.domain.Student;
import me.xueyao.repository.StudentRepository;
import me.xueyao.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Optional;

/**
 * @author Simon.Xue
 * @date 2021/9/2 9:30 下午
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentRepository studentRepository;


    @Override
    public R insert(Student student) {
        student.setId(1);
        student.setCreateTm(new Date());
        student.setCreator("admin");
        studentRepository.save(student);
        return R.ofSuccess("添加成功");
    }

    @Override
    public R<Student> getById(Integer id) {
        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isPresent()) {
            return R.ofSuccess("查询成功", optional.get());
        }
        return R.ofSuccess("查询成功");
    }

    @Override
    public R update(Student student) {
        Optional<Student> optional = studentRepository.findById(student.getId());
        if (!optional.isPresent()) {
            return R.ofParam("数据不存在");
        }
        Student result = optional.get();
        BeanUtils.copyProperties(student, result);
        result.setUpdater("admin");
        result.setUpdateTm(new Date());
        studentRepository.save(result);
        return R.ofSuccess("更新成功");
    }

    @Override
    public R delete(Integer id) {
        studentRepository.deleteById(id);
        return R.ofSuccess("删除成功");
    }
}
