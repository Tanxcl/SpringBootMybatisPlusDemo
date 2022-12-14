package com.orange.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.orange.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @className: UserDao
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/14 15:20
 **/
@Mapper
//@Repository
public interface StudentMapper extends BaseMapper<Student> {

    List<Student> getStudent();

    @Select("select * from student")
    List<Student> getStudentTwo();

}
