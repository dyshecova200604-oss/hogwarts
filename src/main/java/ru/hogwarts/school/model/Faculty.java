package ru.hogwarts.school.model;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Faculty {

    @Id
    @GeneratedValue
    private Long facultyId;
    private String name;
    private String color;

    @OneToMany(mappedBy = "faculty")
    private List<Student> students;

    public void setName(String name) {
    }

    public void setColor(String color) {
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getStudents() {
        return students.toString();
    }
}