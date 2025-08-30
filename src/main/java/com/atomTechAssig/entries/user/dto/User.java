package com.atomTechAssig.entries.user.dto;

public class User {
    private String firstName;
    private String lastName;
    public  User() {}

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public static class Builder implements FirstNameStep, LastNameStep, BuildStep {
        private String firstName;
        private String lastName;

        private Builder() {
        }

        public static FirstNameStep user() {
            return new Builder();
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
                this.firstName,
                this.lastName
            );
        }
    }
}
