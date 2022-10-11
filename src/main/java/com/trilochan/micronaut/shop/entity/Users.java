//package com.trilochan.micronaut.shop.entity;
//
//import jakarta.persistence.*;
//
//import javax.persistence.Entity;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//import java.io.Serial;
//import java.io.Serializable;
//
//    @Entity
//   @Table(name = "users")
//public class Users implements Serializable {
//     @Serial
//     private static final long serialVersionUID = 1L;
//      @Id
//      @GeneratedValue
//      private Long UUID;
//
//      @NotNull
//       @NotBlank
//       private String name;
//       private String email;
//       private String address;
//       private String phone;
//
//     public Users() {
//     }
//
//     public Users(String name, String email, String address, String phone) {
//           this.name = name;
//           this.email = email;
//           this.address = address;
//           this.phone = phone;
//       }
//
//     public String getName() {
//           return name;
//       }
//
//       public String getEmail() {
//           return email;
//       }
//
//       public String getAddress() {
//           return address;
//       }
//
//       public String getPhone() {
//           return phone;
//       }
//   }
