package com.orange.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.orange.dao.StudentMapper;
import com.orange.entity.Student;
import com.orange.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: UserServiceImpl
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/14 15:20
 **/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getStudent() {
        return studentMapper.getStudent();
    }

    @Override
    public List<Student> getStudentTwo() {
        return studentMapper.getStudentTwo();
    }


}
