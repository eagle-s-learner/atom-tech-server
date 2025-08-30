package com.atomTechAssig.entries.user.dto;

public class UserDto {
    private String firstName;
    private String lastName;
    public UserDto() {}

    public UserDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public interface FirstNameStep {
        LastNameStep withFirstName(String firstName);
    }

    public interface LastNameStep {
        BuildStep withLastName(String lastName);
    }

    public interface BuildStep {
        UserDto build();
    }

    public static class Builder implements FirstNameStep, LastNameStep, BuildStep {
        private String firstName;
        private String lastName;

        private Builder() {
        }

        public static FirstNameStep userDto() {
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
        public UserDto build() {
            return new UserDto(
                this.firstName,
                this.lastName
            );
        }
    }
}
