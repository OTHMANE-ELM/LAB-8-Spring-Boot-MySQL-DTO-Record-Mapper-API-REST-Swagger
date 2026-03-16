package ma.fst.othamane.service;

import ma.fst.othamane.dto.StudentRequestDTO;
import ma.fst.othamane.dto.StudentResponseDTO;
import ma.fst.othamane.entity.Student;
import ma.fst.othamane.exception.ResourceNotFoundException;
import ma.fst.othamane.mapper.StudentMapper;
import ma.fst.othamane.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    public StudentResponseDTO addStudent(StudentRequestDTO dto) {
        Student student = studentMapper.toEntity(dto);
        Student savedStudent = studentRepository.save(student);
        return studentMapper.toResponseDTO(savedStudent);
    }

    public List<StudentResponseDTO> getAllStudents() {
        return studentRepository.findAll()
                .stream()
                .map(studentMapper::toResponseDTO)
                .toList();
    }

    public StudentResponseDTO getStudentById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Aucun étudiant ne correspond à l'identifiant fourni : " + id
                ));

        return studentMapper.toResponseDTO(student);
    }

    public StudentResponseDTO updateStudent(Long id, StudentRequestDTO dto) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "La mise à jour est impossible : aucun étudiant recensé sous l'identifiant : " + id
                ));

        studentMapper.updateEntityFromDTO(dto, student);
        Student updatedStudent = studentRepository.save(student);

        return studentMapper.toResponseDTO(updatedStudent);
    }

    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "La suppression ne peut être effectuée : aucun étudiant répertorié sous l'identifiant : " + id
                ));

        studentRepository.delete(student);
    }
}
