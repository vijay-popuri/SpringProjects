package com.example.ActualHateos.dao;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.ActualHateos.model.Student;
import com.example.ActualHateos.model.StudentPrivateInf;

@Repository
@PropertySource("classpath:sqlFile/student.xml")
public class StudentDao {
	
	@Autowired
	private NamedParameterJdbcTemplate npjt;
	
	@Value("${student.insertRec}")
	private String insertData;
	
	@Value("${student.getStudentById}")
	private String getStudentData;
	
	@Value("${student.getAllStudents}")
	private String getAllStudent;
	
	@Value("${student.getStudentPrivateInformation}")
	private String getStudentPrivateInformation;
	
	private final RowMapper<Student> studentMapper=
			BeanPropertyRowMapper.newInstance(Student.class);
	
	private final RowMapper<StudentPrivateInf> privateMapper=
			BeanPropertyRowMapper.newInstance(StudentPrivateInf.class);
	
	
	public void insertStudentData(Student st) {
		npjt.update(insertData, new BeanPropertySqlParameterSource(st));
	}
	
	public Student getStudentData(int id) {
		final Map<String, Object> params= Map.of("id", id);
		List<Student> students = npjt.query(getStudentData, params, studentMapper);
		return students.get(0);
	}
	
	public List<Student> getAllStudentData(){
		return npjt.query(getAllStudent, studentMapper);
	}
	
	public StudentPrivateInf getStudentPrivateInformation(int id) {
		final Map<String, Object> params=Map.of("id", id);
		List<StudentPrivateInf> sts=npjt.query(getStudentPrivateInformation, params, privateMapper);
		return sts.get(0);
	}

}
