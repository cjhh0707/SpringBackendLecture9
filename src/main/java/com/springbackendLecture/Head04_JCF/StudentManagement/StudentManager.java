package com.springbackendLecture.Head04_JCF.StudentManagement;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class StudentManager {
    private List<Student> students;
    private Set<String> studentNames;
    private Map<String, Integer> scoreMap;

    public StudentManager() {
        students = new ArrayList<>();
        studentNames = new HashSet<>();
        scoreMap = new HashMap<>();
    }

    public void addStudent(Student student, int score) {
        //중복 체크
        if (studentNames.contains(student.getName())) {
            System.out.println("이미 존재하는 학생입니다");
            return;
        }

        //등록
        students.add(student);
        studentNames.add(student.getName());
        scoreMap.put(student.getName(), score);
        System.out.println("새로운 학생이 등록 되었습니다: " + student);
    }

    public void removeStudent(String name) {
        //이름을 통해 학생 검색
        Student target = null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                target = student;
                break;
            }
        }

        if (target != null) {
            students.remove(target);
            studentNames.remove(name);
            scoreMap.remove(name);
            System.out.println(name + "학생이 삭제 되었습니다.");
        } else {
            System.out.println("해당 학생을 찾을 수 없습니다");
        }
    }

    public void printAllStudents() {
        System.out.println("===학생 목록===");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printScore(String name) {
        Integer score = scoreMap.get(name);
        if (score != null) {
            System.out.println(name + "학생의 점수: " + score);
        } else {
            System.out.println("점수를 찾을 수 없습니다");
        }
    }

    public boolean isStudentExist(String name) {
        return studentNames.contains(name);
    }
}
