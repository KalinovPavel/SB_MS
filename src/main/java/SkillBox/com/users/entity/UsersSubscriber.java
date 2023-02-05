package SkillBox.com.users.entity;

import javax.persistence.*;

@Entity
@Table(name = "users_subscribers", schema = "users_scheme", indexes = {
        @Index(name = "fki_subscribers_id_fk", columnList = "subscribers_id")
})
public class UsersSubscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "users_id", nullable = false)
    private User users;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "subscribers_id", nullable = false)
    private User subscribers;

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

    public User getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(User subscribers) {
        this.subscribers = subscribers;
    }

}