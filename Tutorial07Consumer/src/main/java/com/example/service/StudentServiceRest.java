package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDAO;
import com.example.dao.StudentMapper;
import com.example.model.CourseModel;
import com.example.model.StudentModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Primary
public class StudentServiceRest implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public StudentModel selectStudent (String npm) {
		log.info ("REST - select student with npm {}", npm);
		return studentDAO.selectStudent (npm);
	}
	
	@Override
	public CourseModel selectCourse(String id_course) {
		log.info("select course with id_course {}", id_course);
		return studentMapper.selectCourse(id_course);
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		log.info("REST - select all students");
		return studentDAO.selectAllStudents();
	}

	@Override
	public void addStudent(StudentModel student) {
	}

	@Override
	public void deleteStudent(String npm) {
	}

	@Override
	public void updateStudent(StudentModel student) {
	}

//	@Override
//	public void addCourse(String npm, String idCourse) {
//	}
}
