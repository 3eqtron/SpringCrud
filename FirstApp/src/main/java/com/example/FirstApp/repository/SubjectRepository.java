package com.example.FirstApp.repository;


import com.example.FirstApp.bean.Subject;
import org.springframework.data.repository.CrudRepository;


public interface SubjectRepository extends CrudRepository<Subject,String> {


}
