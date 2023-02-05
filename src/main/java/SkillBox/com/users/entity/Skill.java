package SkillBox.com.users.entity;

import javax.persistence.*;

@Entity
@Table(name = "skills", schema = "users_scheme", indexes = {
        @Index(name = "fki_hard_skill_fk", columnList = "hard_skill_id"),
        @Index(name = "fki_users_id_fk", columnList = "users_id")
})
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "users_id", nullable = false)
    private User users;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hard_skill_id", nullable = false)
    private HardSkill hardSkill;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public HardSkill getHardSkill() {
        return hardSkill;
    }

    public void setHardSkill(HardSkill hardSkill) {
        this.hardSkill = hardSkill;
    }

}