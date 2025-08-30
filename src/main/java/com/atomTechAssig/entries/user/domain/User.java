package com.atomTechAssig.entries.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.ToString;

@ToString
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(length = 80)
    private String firstName;
    @Column(length = 80)
    private String lastName;
    public User() {}

    public User(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public interface IdStep {
        FirstNameStep withId(Long id);
    }

    public interface FirstNameStep {
        LastNameStep withFirstName(String firstName);
    }

    public interface LastNameStep {
        BuildStep withLastName(String lastName);
    }

    public interface BuildStep {
        User build();
    }

    public static class Builder implements IdStep, FirstNameStep, LastNameStep, BuildStep {
        private Long id;
        private String firstName;
        private String lastName;

        private Builder() {
        }

        public static IdStep user() {
            return new Builder();
        }

        @Override
        public FirstNameStep withId(Long id) {
            this.id = id;
            return this;
        }

        @Override
        public LastNameStep withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        @Override
        public BuildStep withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @Override
        public User build() {
            return new User(
                this.id,
                this.firstName,
                this.lastName
            );
        }
    }
}
