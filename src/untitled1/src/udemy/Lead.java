package udemy;

import java.util.Date;
import java.util.Scanner;

    public class Lead {
        private String id;
        private String name;
        private Date date;
        private boolean gender;
        private String phone;
        private String email;
        private String address;

        public Lead(String id, String name, Date date, boolean gender, String phone, String email, String address) {
            this.id = id;
            this.name = name;
            this.date = date;
            this.gender = gender;
            this.phone = phone;
            this.email = email;
            this.address = address;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public boolean isGender() {
            return gender;
        }

        public void setGender(boolean gender) {
            this.gender = gender;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }


    }


