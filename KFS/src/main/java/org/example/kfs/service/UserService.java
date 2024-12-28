package org.example.kfs.service;

import com.fengshuisystem.demo.dto.PageResponse;
import com.fengshuisystem.demo.dto.request.*;
import com.fengshuisystem.demo.dto.response.UserResponse;
import com.fengshuisystem.demo.entity.Account;
import jakarta.validation.Valid;


import java.util.List;

public interface UserService {

    UserResponse createUser(UserCreationRequest request);
    void createPassword(PasswordCreationRequest request);
    UserResponse getMyInfo();
    UserResponse updateUser(String email, UserUpdateRequest request);
    UserResponse deleteUser(Integer userId);
    List<UserResponse> getUsers();
    UserResponse getUser(Integer id);
    PageResponse<UserResponse> getAllUsers(int page, int size);
    PageResponse<UserResponse> getUsersBySearch(String name, int page, int size);
    UserResponse setRole(Integer userId, List<Integer> ids);
    long getNewUsersToday();
    long getNewUsersThisWeek();
    long getNewUsersThisMonth();
  UserResponse updatePassword(UpdatePasswordRequest updatePasswordRequest);
    Account updateFCM(@Valid UpdateFCMRequest updateFCMRequest);
}