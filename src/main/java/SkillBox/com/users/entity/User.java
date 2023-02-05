package SkillBox.com.users.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "users", schema = "users_scheme", indexes = {
        @Index(name = "i_users_city", columnList = "city"),
        @Index(name = "i_users_city_gender", columnList = "city, gender"),
        @Index(name = "i_users_gender", columnList = "gender")
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "surname", nullable = false)
    private String surname;

    @Lob
    @Column(name = "middle_name", nullable = false)
    private String middleName;

    @Lob
    @Column(name = "gender", nullable = false)
    private String gender;

    @Lob
    @Column(name = "city", nullable = false)
    private String city;

    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Lob
    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Lob
    @Column(name = "email", nullable = false)
    private String email;

    @Lob
    @Column(name = "phone", nullable = false)
    private String phone;

    @Lob
    @Column(name = "avatar", nullable = false)
    private String avatar;

    @Lob
    @Column(name = "subscriptions", nullable = false)
    private String subscriptions;

    @OneToMany(mappedBy = "users")
    private Set<Skill> skills = new LinkedHashSet<>();

    @OneToMany(mappedBy = "subscribers")
    private Set<UsersSubscriber> usersSubscribers = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(String subscriptions) {
        this.subscriptions = subscriptions;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public Set<UsersSubscriber> getUsersSubscribers() {
        return usersSubscribers;
    }

    public void setUsersSubscribers(Set<UsersSubscriber> usersSubscribers) {
        this.usersSubscribers = usersSubscribers;
    }

}