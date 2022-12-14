package com.orange.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.orange.entity.Student;

import java.util.List;

/**
 * @className: UserService
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/14 15:20
 **/
public interface StudentService extends IService<Student> {

    List<Student> getStudent();

    List<Student> getStudentTwo();

}
