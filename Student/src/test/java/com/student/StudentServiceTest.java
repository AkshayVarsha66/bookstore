package com.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
 
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.student.entity.Student;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;
 
@SpringBootTest
public class StudentServiceTest {
 
    @Test
    public void testUpdateStudent() {
        // Mocking dependencies
        StudentRepository studentRepositoryMock = mock(StudentRepository.class);
 
        // Creating a sample student
        Student inputStudent = new Student();
        inputStudent.setStudentName("John Doe");
        inputStudent.setAge(25);
        inputStudent.setSalary(50000);
 
        // Mocking the save method of the repository
        when(studentRepositoryMock.save(any(Student.class))).thenReturn(inputStudent);
 
        // Creating an instance of the class containing the updateStudent method
        StudentService studentService = new StudentService(studentRepositoryMock);
 
        // Calling the updateStudent method
        Student resultStudent = studentService.updateStudent(inputStudent);
 
        // Verifying that the save method was called with the input student
        verify(studentRepositoryMock, times(1)).save(eq(inputStudent));
 
        // Verifying that the returned student has the same values as the input student
        assertEquals(inputStudent.getStudentName(), resultStudent.getStudentName());
        assertEquals(inputStudent.getAge(), resultStudent.getAge());
        assertEquals(inputStudent.getSalary(), resultStudent.getSalary());
    }
}
