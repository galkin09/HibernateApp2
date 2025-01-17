package springcourse.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "principal")
public class Principal {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private int age;

    @OneToOne(mappedBy = "principal")
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    private School school;

    public Principal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Principal() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
        school.setPrincipal(this);
    }



    @Override
    public String toString() {
        return "Principal{" +
                "name='" + name + '\'' +
                ", school=" + school +
                '}';
    }
}
