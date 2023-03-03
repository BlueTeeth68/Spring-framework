package com.example.springjpa.repository;

import com.example.springjpa.domain.Role;
import com.example.springjpa.domain.RoleName;
import com.example.springjpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRoleName(RoleName roleName);

//    @Query(value = "SELECT u.* FROM user u JOIN " +
//            " u.id IN (SELECT ur.user_id FROM user_role ur" +
//            " WHERE ur.role_id IN (" +
//            "SELECT r.id FROM role r" +
//            " WHERE r.role_name = ?1))")

//    @Query(value = "SELECT u.* FROM user u JOIN user_role ur ON " +
//            " u.id = ur.user_id WHERE ur.role_id = :roleName")
////    SELECT e.* FROM employee e JOIN employee_project ep ON e.id = ep.employee_id WHERE ep.project_id = :projectId
//    List<User> getUserByRole(RoleName roleName);


//    @Query("SELECT u FROM User u " +
//            " WHERE u.id IN (SELECT ur.user_id FROM user_role ur" +
//            " WHERE ur.role_id IN (" +
//            "SELECT r.id FROM Role r" +
//            " WHERE r.roleName = ?1))")
//    List<User> getUserByRole(RoleName roleName);
}
