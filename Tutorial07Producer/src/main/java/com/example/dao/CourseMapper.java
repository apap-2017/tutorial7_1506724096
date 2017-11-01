package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.example.model.CourseModel;

@Mapper
public interface CourseMapper {
	@Select("select * from course where id_course = #{id_course}")
	CourseModel selectCourse(@Param("id_course") String id_course);
	
	@Select("select * from course")
	List<CourseModel> selectAllCourses();
}

