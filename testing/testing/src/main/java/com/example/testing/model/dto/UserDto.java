package com.example.testing.model.dto;

public class UserDto {
        private Long id;
        private String username;
//        private int age;
//        private String gender;
        private String email;
        private String phone;

        public UserDto() {
        }

        public UserDto(Long id, String username, String email, String phone) {
                this.id = id;
                this.username = username;
//                this.age = age;
//                this.gender = gender;
                this.email = email;
                this.phone = phone;
        }

        public UserDto(String username, String email, String phone) {
                this.username = username;
//                this.age = age;
//                this.gender = gender;
                this.email = email;
                this.phone = phone;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

//        public int getAge() {
//                return age;
//        }
//
//        public void setAge(int age) {
//                this.age = age;
//        }
//
//        public String getGender() {
//                return gender;
//        }
//
//        public void setGender(String gender) {
//                this.gender = gender;
//        }

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
}
